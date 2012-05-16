package us.pokedex;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import org.apache.http.client.ClientProtocolException;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityShowResults extends Activity implements OnInitListener {

	Button playButton;
	boolean playStatus = true;	//false means not playing, true means playing
	String pkmnAudioString = "No Pokemon Information at this time. Please try again.";
	private int MY_DATA_CHECK_CODE = 0;
	private TextToSpeech myTTS;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_results);
        
        playButton = (Button) findViewById(R.id.button1);
        
        int pokedex_number = 0;
        Pokemon pk = new Pokemon();
        
        Bundle extras = getIntent().getExtras();
        pokedex_number = extras.getInt("POKEDEX");
        
        try {
			pk = QueryDB.queryByID(pokedex_number);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        ImageView resultPokemon = (ImageView)findViewById(R.id.resultPokemon);
        try {
            URL url = null;
            if(pokedex_number < 10 ) 
            	url = new URL("http://thecity.sfsu.edu/~667.04/00" + pokedex_number + ".png");
            else if(pokedex_number < 100 ) 
            	url = new URL("http://thecity.sfsu.edu/~667.04/0" + pokedex_number + ".png");
            else
            	url = new URL("http://thecity.sfsu.edu/~667.04/" + pokedex_number + ".png");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(input);
            resultPokemon.setImageBitmap(myBitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //show data
        TextView tvNumber = (TextView) findViewById(R.id.tvPokedexNumber);
       // tvNumber.setBackgroundColor(Color.WHITE);
        tvNumber.setText(String.valueOf(pokedex_number));
        TextView tvName = (TextView) findViewById(R.id.tvName);
        //tvName.setBackgroundColor(Color.WHITE);
        tvName.setText(pk.getName());
        pkmnAudioString = String.valueOf(pk.getName())+ ", ";
        pkmnAudioString += "Poke-ay dex Number: "+String.valueOf(pokedex_number)+ ", ";
        TextView tvType1 = (TextView) findViewById(R.id.tvType1);
       // tvType1.setBackgroundColor(Color.WHITE);
        tvType1.setText(pk.getType1());
        pkmnAudioString += "Type: "+String.valueOf(pk.getType1())+ ", ";
        TextView tvType2 = (TextView) findViewById(R.id.tvType2);
        if( pk.getType2() != null ){
        	//tvType2.setBackgroundColor(Color.WHITE);
        	tvType2.setText(pk.getType2());
        	//pkmnAudioString += "Sub-Type: "+String.valueOf(pk.getType2())+ ", ";
        }
        TextView tvHeight = (TextView) findViewById(R.id.tvHeight);
       // tvHeight.setBackgroundColor(Color.WHITE);
        tvHeight.setText(String.valueOf(pk.getHeight()) + "m");
        //pkmnAudioString += "Height: "+String.valueOf(pk.getHeight())+ " meters, ";
        TextView tvWeight = (TextView) findViewById(R.id.tvWeight);
        //tvWeight.setBackgroundColor(Color.WHITE);
        tvWeight.setText(String.valueOf(pk.getWeight())+"kg");
       // pkmnAudioString += "Weight: "+String.valueOf(pk.getWeight())+ " kilograms, ";
        TextView tvHp = (TextView) findViewById(R.id.tvHp);
        //tvHp.setBackgroundColor(Color.WHITE);
        tvHp.setText(String.valueOf(pk.getHp()));
        //pkmnAudioString += "Hit Points: "+String.valueOf(pk.getHp())+ ", ";
        TextView tvAbility = (TextView) findViewById(R.id.tvAbility);
        tvAbility.setText(String.valueOf(pk.getAbility()));
        //tvHp.setBackgroundColor(Color.WHITE);
        tvHp.setText(String.valueOf(pk.getHp()));
        TextView tvAttack = (TextView) findViewById(R.id.tvAttack);
       // tvAbility.setBackgroundColor(Color.WHITE);
        //tvAttack.setBackgroundColor(Color.WHITE);
        tvAttack.setText(String.valueOf(pk.getAttack()));
        //pkmnAudioString += "Attack: "+String.valueOf(pk.getAttack())+ ", ";
        TextView tvDefense = (TextView) findViewById(R.id.tvDefense);
        //tvDefense.setBackgroundColor(Color.WHITE);
        tvDefense.setText(String.valueOf(pk.getDefense()));
        //pkmnAudioString += "Defense: "+String.valueOf(pk.getDefense())+ ", ";
        TextView tvspAttack = (TextView) findViewById(R.id.tvspAttack);
        //tvspAttack.setBackgroundColor(Color.WHITE);
        tvspAttack.setText(String.valueOf(pk.getspAttack()));
        //pkmnAudioString += "Special Attack: "+String.valueOf(pk.getspAttack())+ ", ";
        TextView tvspDefense = (TextView) findViewById(R.id.tvspDefense);
        //tvspDefense.setBackgroundColor(Color.WHITE);
        tvspDefense.setText( String.valueOf(pk.getspDefense()));
        //pkmnAudioString += "Special Defense: "+String.valueOf(pk.getspDefense())+ ", ";
        TextView tvDes = (TextView) findViewById(R.id.tvDescription);
        //tvDes.setBackgroundColor(Color.WHITE);
        tvDes.setText(pk.getDescription());
        pkmnAudioString += ". "+String.valueOf(pk.getDescription())+ ".";
        TextView tvSpeed = (TextView) findViewById(R.id.tvSpeed);
        tvSpeed.setText(String.valueOf(pk.getSpeed()));
        
        //check for TTS data
        Intent checkTTSIntent = new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent, MY_DATA_CHECK_CODE);
        
    }
    
    public void onClose(View v) {
    	myTTS.shutdown();
    	startActivity(new Intent(this, ActivityPokedexMainMenu.class));
	}
    public void onPlay(View v){
    	if ( playStatus ){	//if the text to speech is not playing then play and update button.
    		playButton.setText("STOP Playback");
    		playButton.setBackgroundColor(Color.RED);
    		playStatus=false;
    		myTTS.speak(pkmnAudioString, TextToSpeech.QUEUE_FLUSH, null);
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
}