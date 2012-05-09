package us.pokedex;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class ActivityPokemonRandom extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_results);
    }
    
    public void onClose(View v) {
		finish();
	}

}
