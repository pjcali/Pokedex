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
    	Log.i("PIADEBUG", "JUST GOT INSIDE THE START function.");
    	Log.getStackTraceString(tr);
    	startActivity(new Intent(c, ActivityPokemonMatcher.class));
    	overridePendingTransition(0,0);
    	Log.i("PIADEBUG", "JUST GOT PAST THE CALL.");
    	//finish();
    }
    

    public void startPokemonSearch(View v){
    	startActivity(new Intent(this, ActivitySearchPokemon.class));
    	overridePendingTransition(0,0);
    	finish();
    }
    
    public void startPokemonRandom(View v){
    	startActivity(new Intent(this, ActivityPokemonRandom.class));
    	overridePendingTransition(0,0);
    	finish();
    }
    
    public void startOptions(View v){
    	startActivity(new Intent(this, ActivityPokemonMatcher.class));
    	overridePendingTransition(0,0);
    	finish();

    }
}