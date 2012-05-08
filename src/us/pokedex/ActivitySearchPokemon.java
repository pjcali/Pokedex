package us.pokedex;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class ActivitySearchPokemon extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_pokemon);
    }
    
    public void onClose(View v) {
		finish();
	}
}