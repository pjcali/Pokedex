package us.pokedex;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class DialogOptions extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_options);
    }
    
    public void onClose(View v) {
		finish();
	}
    
    public void onClick(View v) {
    		//TODO
	}
}