package us.pokedex;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.content.Intent;
import java.util.Locale;

public class ActivitySearchPokemon extends Activity implements OnInitListener {

	Button playButton;
	boolean playStatus = false;	//false means not playing, true means playing
	String pkmnSearchString = "the search string didn't get reset.";
	EditText enteredText;
	private int MY_DATA_CHECK_CODE = 0;
	private TextToSpeech myTTS;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_pokemon);
        playButton = (Button) findViewById(R.id.button2);
        //check for TTS data
        Intent checkTTSIntent = new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent, MY_DATA_CHECK_CODE);
    }
        
    
    public void onClose(View v) {
    	myTTS.shutdown();
    	startActivity(new Intent(this, ActivityPokedexMainMenu.class));
	}
    
    public void onSearch(View v){
    	enteredText = (EditText)findViewById(R.id.editText1);
    	pkmnSearchString = enteredText.getText().toString();
    	Intent intent = new Intent(this, ActivityShowResults.class);
    	if ( Integer.valueOf(pkmnSearchString) < 152 ||  Integer.valueOf(pkmnSearchString) > 0 )
    		intent.putExtra("POKEDEX", pkmnSearchString);	//check for number
    	else if ( !pkmnSearchString.equals(null) )
    		intent.putExtra("POKEMON", pkmnSearchString);
    	
    	startActivity(intent);
    }
 
    public void onPlay(View v){
    	if ( playStatus ){	//if the text to speech is not playing then play and update button.
    		playButton.setText("STOP Playback");
    		playButton.setBackgroundColor(Color.RED);
    		playStatus=false;
    		myTTS.speak("pkmnSearchString", TextToSpeech.QUEUE_FLUSH, null);
    	}
    	else {
    		playButton.setText("PLAY Statistics"); 
    		playButton.setBackgroundColor(Color.GREEN);
    		playStatus=true;
    		myTTS.stop();
    	}
    }

	public void onInit(int initStatus) {
		
        //check for successful instantiation
		if (initStatus == TextToSpeech.SUCCESS) {
			if(myTTS.isLanguageAvailable(Locale.US)==TextToSpeech.LANG_AVAILABLE)
				myTTS.setLanguage(Locale.US);
		}
		else if (initStatus == TextToSpeech.ERROR) {
			Toast.makeText(this, "Sorry! Text To Speech failed...", Toast.LENGTH_LONG).show();
		}
    
	}
	
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == MY_DATA_CHECK_CODE) {
            if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
                //the user has the necessary data - create the TTS
            myTTS = new TextToSpeech(this, this);
            }
            else {
                    //no data - install it now
                Intent installTTSIntent = new Intent();
                installTTSIntent.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
                startActivity(installTTSIntent);
            }
        }
    }
} //end class

