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
    
    public void startPokemonMatcher(View v) throws NullPointerException {
    	Throwable tr = new Throwable();
    	Log.getStackTraceString(tr);
    	startActivity(new Intent(c, ActivityPokemonMatcher.class));
    }
    

    public void startPokemonSearch(View v){
    	startActivity(new Intent(this, ActivitySearchPokemon.class));
    }
    
    public void startPokemonRandom(View v){
    	startActivity(new Intent(this, ActivityPokemonRandom.class));
    }
    
    public void startOptions(View v){
    	startActivity(new Intent(this, ActivityPokemonMatcher.class));
    }
}