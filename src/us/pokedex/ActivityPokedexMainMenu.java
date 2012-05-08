package us.pokedex;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityPokedexMainMenu extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokedex_main_menu);
    }
    
    public void startPokemonMatcher(View v){
    	startActivity(new Intent(this, ActivityPokemonMatcher.class));
    	finish();
    }
    
    void startPokemonLookup(View v){
    	startActivity(new Intent(this, ActivityPokemonMatcher.class));
    	finish();
    }
    
    void startPokemonRandom(View v){
    	startActivity(new Intent(this, ActivityPokemonMatcher.class));
    	finish();
    }
    
    void startOptions(View v){
    	startActivity(new Intent(this, ActivityPokemonMatcher.class));
    	finish();
    }
}