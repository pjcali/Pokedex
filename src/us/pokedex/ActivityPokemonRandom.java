package us.pokedex;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPokemonRandom extends Activity{
	Button playButton;
	boolean playStatus = false;	//false means not playing, true means playing
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_results);
        playButton = (Button)findViewById(R.id.button1);
    }
    
    public void onClose(View v) {
		finish();
	}
    
    public void onPlay(View v){
    	//this is where the play button comes into play.
    	if ( playStatus ){	//if the text to speech is not playing then play and update button.
    		StatisticsTTS m = new StatisticsTTS(this);
    		m.onInit(1);
    		playButton.setText("PAUSE Playback");
    		playButton.setBackgroundColor(Color.GREEN);
    		playStatus=false;
    	}
    	else {
    		playButton.setText("PLAY Statistics"); 
    		playButton.setBackgroundColor(Color.RED);
    		playStatus=true;
    	}
    }

}
