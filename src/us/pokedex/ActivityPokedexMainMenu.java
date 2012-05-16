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
<<<<<<< HEAD
    	overridePendingTransition(0,0);
    	Log.i("PIADEBUG", "JUST GOT PAST THE CALL.");
    	//finish();
=======
>>>>>>> 7866690c5dec066dea92cf40ea0f11f84b272226
    }
    

    public void startPokemonSearch(View v){
    	startActivity(new Intent(this, ActivitySearchPokemon.class));
<<<<<<< HEAD
    	overridePendingTransition(0,0);
    	finish();
=======
>>>>>>> 7866690c5dec066dea92cf40ea0f11f84b272226
    }
    
    public void startPokemonRandom(View v){
    	startActivity(new Intent(this, ActivityPokemonRandom.class));
<<<<<<< HEAD
    	overridePendingTransition(0,0);
    	finish();
=======
>>>>>>> 7866690c5dec066dea92cf40ea0f11f84b272226
    }
    
    public void startOptions(View v){
    	startActivity(new Intent(this, ActivityPokemonMatcher.class));
<<<<<<< HEAD
    	overridePendingTransition(0,0);
    	finish();

=======
>>>>>>> 7866690c5dec066dea92cf40ea0f11f84b272226
    }
}