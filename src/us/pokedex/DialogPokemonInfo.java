package us.pokedex;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DialogPokemonInfo extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_pokemon_info);
        
        TextView tv1 = (TextView) findViewById(R.id.tvPokemonNumber);
        tv1.setBackgroundColor(Color.WHITE);
	}
	
	public void button_ok(View v){
		finish();
	}
}
