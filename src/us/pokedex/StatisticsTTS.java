package us.pokedex;

import android.content.Context;
import android.content.Intent;
import android.speech.tts.*;

public class StatisticsTTS implements TextToSpeech.OnInitListener {

	private TextToSpeech tts;
	private Context mcontext;
	
	StatisticsTTS(Context c){
		mcontext = c;
		Intent checkIntent = new Intent(); 
	    checkIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA); 
	}//constructor
	
	//@Override
	public void onInit(int status) {
		if (status == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
		// success, create the TTS instance
			tts = new TextToSpeech(mcontext, null);
			tts.speak("OH MY GOD. PIA MADE ME TALK.", TextToSpeech.QUEUE_FLUSH, null);
			tts.stop();
			tts.shutdown();
		}
		else {
			// missing data, install it
			Intent installIntent = new Intent();
			installIntent.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
		}
	}

}
