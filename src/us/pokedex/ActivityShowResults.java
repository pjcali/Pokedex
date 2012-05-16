package us.pokedex;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.client.ClientProtocolException;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityShowResults extends Activity {
    /** Called when the activity is first created. */
	Button playButton;
	boolean playStatus = false;	//false means not playing, true means playing

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_results);
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
        TextView tvNumber = (TextView) findViewById(R.id.tvPokedexNumber);
        tvNumber.setBackgroundColor(Color.WHITE);
        tvNumber.setText(String.valueOf(pokedex_number));
        TextView tvName = (TextView) findViewById(R.id.tvName);
        tvName.setBackgroundColor(Color.WHITE);
        tvName.setText(pk.getName());
        TextView tvType1 = (TextView) findViewById(R.id.tvType1);
        tvType1.setBackgroundColor(Color.WHITE);
        tvType1.setText("Type: " + pk.getType1());
        TextView tvType2 = (TextView) findViewById(R.id.tvType2);
        if( pk.getType2() != null ){
        	tvType2.setBackgroundColor(Color.WHITE);
        	tvType2.setText("/" + pk.getType2());
        }
        TextView tvHeight = (TextView) findViewById(R.id.tvHeight);
        tvHeight.setBackgroundColor(Color.WHITE);
        tvHeight.setText(String.valueOf(pk.getHeight()));
        TextView tvWeight = (TextView) findViewById(R.id.tvWeight);
        tvWeight.setBackgroundColor(Color.WHITE);
        tvWeight.setText(String.valueOf(pk.getWeight()));
        TextView tvHp = (TextView) findViewById(R.id.tvHp);
        tvHp.setBackgroundColor(Color.WHITE);
        tvHp.setText(String.valueOf(pk.getHp()));
        TextView tvAttack = (TextView) findViewById(R.id.tvAttack);
        tvAttack.setBackgroundColor(Color.WHITE);
        tvAttack.setText(String.valueOf(pk.getAttack()));
        TextView tvDefense = (TextView) findViewById(R.id.tvDefense);
        tvDefense.setBackgroundColor(Color.WHITE);
        tvDefense.setText(String.valueOf(pk.getDefense()));
        TextView tvspAttack = (TextView) findViewById(R.id.tvspAttack);
        tvspAttack.setBackgroundColor(Color.WHITE);
        tvspAttack.setText(String.valueOf(pk.getspAttack()));
        TextView tvspDefense = (TextView) findViewById(R.id.tvspDefense);
        tvspDefense.setBackgroundColor(Color.WHITE);
        tvspDefense.setText(String.valueOf(pk.getspDefense()));
        //TextView tvDes = (TextView) findViewById(R.id.tvDescription);
        //tvDes.setBackgroundColor(Color.WHITE);
        //tvDes.setText(pk.getDescription());
        
    }
    
    public void onClose(View v) {
		finish();
	}
    
    public void onPlay(View v){
    	//this is where the play button comes into play.
    	if ( playStatus ){	//if the text to speech is not playing then play and update button.
    		//StatisticsTTS m = new StatisticsTTS(this);
    		//m.onInit(1);
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