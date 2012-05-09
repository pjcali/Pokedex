package us.pokedex;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityPokedexMainMenu extends Activity {
    /** Called when the activity is first created. */
	Context c = this;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokedex_main_menu);
    }
    
    public void startPokemonMatcher(View v){
    	Log.i("PIADEBUG", "JUST GOT INSIDE THE START function.");
    	startActivity(new Intent(c, ActivityPokemonMatcher.class));
    	//finish();
    }
    
    public void startSearchPokemon(View v){
    	Log.i("PIADEBUG", "JUST GOT INSIDE THE START function.");
    	startActivity(new Intent(c, ActivitySearchPokemon.class));
    	//finish();
    }
    
    public void startPokemonRandom(View v){
    	startActivity(new Intent(c, ActivityPokemonRandom.class));
    	//finish();
    }
    
    public void startOptions(View v){
    	startActivity(new Intent(c, ActivityPokemonMatcher.class));
    	//finish();
    }
}