package us.pokedex;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivitySearchPokemon extends Activity {
    /** Called when the activity is first created. */
	Button playButton;
	boolean playStatus = false;	//false means not playing, true means playing

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_pokemon);
        playButton = (Button) findViewById(R.id.button2);
    }
    
    public void onClose(View v) {
		finish();
	}
    
    public void onSearch(View v){
    	//SEARCH HERE
    }
 
    public void onPlay(View v){
    	//this is where the play button comes into play.
    	if ( playStatus ){	//if the text to speech is not playing then play and update button.
    		StatisticsTTS m = new StatisticsTTS(this);
    		m.onInit(1);
    		playButton.setText("Pause Playback");
    		playButton.setBackgroundColor(Color.GREEN);
    		playStatus=false;
    	}
    	else {
    		playButton.setText("Play Statistics"); 
    		playButton.setBackgroundColor(Color.RED);
    		playStatus=true;
    	}
    }
}

