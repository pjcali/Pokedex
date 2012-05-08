package us.pokedex;

import android.app.Activity;
import android.os.Bundle;

public class ActivityShowSearchResults extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_pokemon);
    }
}
