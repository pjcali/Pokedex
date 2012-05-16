
package us.pokedex;

//import android.app.Activity;
//import android.os.Bundle;
/*
public class ActivityPokemonMatcher extends Activity {
    /** Called when the activity is first created. */
/*
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_matcher);
    }
    
<<<<<<< HEAD
    private Pokemon findMatch( int shape, int color, int hobby )
    {
    	
    	return null;
    }
}
=======
   
*/

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;

import org.apache.http.HttpConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
//package us.pokedex;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



//Unused Sean code:
public class ActivityPokemonMatcher extends Activity {
	ImageButton hobby_button_0;
	ImageButton hobby_button_1;
	ImageButton hobby_button_2;
	ImageButton hobby_button_3;
	ImageButton hobby_button_4;
	ImageButton hobby_button_5;
	ImageButton hobby_button_6;
	ImageButton hobby_button_7;
	
	ImageButton color_button_0;
	ImageButton color_button_1;
	ImageButton color_button_2;
	ImageButton color_button_3;
	ImageButton color_button_4;
	ImageButton color_button_5;
	ImageButton color_button_6;
	ImageButton color_button_7;
	ImageButton color_button_8;
	ImageButton color_button_9;
	
	ImageButton shape_button_0;
	ImageButton shape_button_1;
	ImageButton shape_button_2;
	ImageButton shape_button_3;
	
	int hobby_choice = -1;
	int color_choice = -1;
	int shape_choice = -1;
	
    /** Called when the activity is first created. */
//    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_matcher);
        hobby_button_0 = (ImageButton) findViewById(R.id.ImageButton08);
        hobby_button_1 = (ImageButton) findViewById(R.id.ImageButton09);
        hobby_button_2 = (ImageButton) findViewById(R.id.ImageButton10);
        hobby_button_3 = (ImageButton) findViewById(R.id.ImageButton11);
        hobby_button_4 = (ImageButton) findViewById(R.id.ImageButton12);
        hobby_button_5 = (ImageButton) findViewById(R.id.ImageButton13);
        hobby_button_6 = (ImageButton) findViewById(R.id.ImageButton14);
        hobby_button_7 = (ImageButton) findViewById(R.id.imageButton2);
        
<<<<<<< HEAD
        TextView tv_hobby = (TextView) findViewById(R.id.hobbie);
        TextView tv_color = (TextView) findViewById(R.id.color);
        TextView tv_shape = (TextView) findViewById(R.id.shape);
        Typeface face = Typeface.createFromAsset(getAssets(),"8bitfont.ttf");
        tv_hobby.setTypeface(face);
        tv_color.setTypeface(face);
        tv_shape.setTypeface(face);
=======
        hobby_button_0.setBackgroundColor(Color.WHITE);
        hobby_button_1.setBackgroundColor(Color.WHITE);
        hobby_button_2.setBackgroundColor(Color.WHITE);
        hobby_button_3.setBackgroundColor(Color.WHITE);
        hobby_button_4.setBackgroundColor(Color.WHITE);
        hobby_button_5.setBackgroundColor(Color.WHITE);
        hobby_button_6.setBackgroundColor(Color.WHITE);
        hobby_button_7.setBackgroundColor(Color.WHITE);
        
        color_button_0 = (ImageButton) findViewById(R.id.ImageButton01);
        color_button_1 = (ImageButton) findViewById(R.id.ImageButton02);
        color_button_2 = (ImageButton) findViewById(R.id.ImageButton03);
        color_button_3 = (ImageButton) findViewById(R.id.ImageButton04);
        color_button_4 = (ImageButton) findViewById(R.id.ImageButton05);
        color_button_5 = (ImageButton) findViewById(R.id.ImageButton06);
        color_button_6 = (ImageButton) findViewById(R.id.ImageButton07);
        color_button_7 = (ImageButton) findViewById(R.id.ImageButton16);
        color_button_8 = (ImageButton) findViewById(R.id.ImageButton25);
        color_button_9 = (ImageButton) findViewById(R.id.ImageButton15);
        
        color_button_0.setBackgroundColor(Color.WHITE);
        color_button_1.setBackgroundColor(Color.WHITE);
        color_button_2.setBackgroundColor(Color.WHITE);
        color_button_3.setBackgroundColor(Color.WHITE);
        color_button_4.setBackgroundColor(Color.WHITE);
        color_button_5.setBackgroundColor(Color.WHITE);
        color_button_6.setBackgroundColor(Color.WHITE);
        color_button_7.setBackgroundColor(Color.WHITE);
        color_button_8.setBackgroundColor(Color.WHITE);
        color_button_9.setBackgroundColor(Color.WHITE);
        
        shape_button_0 = (ImageButton) findViewById(R.id.ImageButton20);
        shape_button_1 = (ImageButton) findViewById(R.id.ImageButton23);
        shape_button_2 = (ImageButton) findViewById(R.id.ImageButton22);
        shape_button_3 = (ImageButton) findViewById(R.id.ImageButton21);
        
        shape_button_0.setBackgroundColor(Color.WHITE);
        shape_button_1.setBackgroundColor(Color.WHITE);
        shape_button_2.setBackgroundColor(Color.WHITE);
        shape_button_3.setBackgroundColor(Color.WHITE);
>>>>>>> 7866690c5dec066dea92cf40ea0f11f84b272226
    }
    
//    private
//}

    public void hobby0(View v){
    	hobby_choice = 0;
    	hobby_button_0.setBackgroundColor(Color.GREEN);
        hobby_button_1.setBackgroundColor(Color.WHITE);
        hobby_button_2.setBackgroundColor(Color.WHITE);
        hobby_button_3.setBackgroundColor(Color.WHITE);
        hobby_button_4.setBackgroundColor(Color.WHITE);
        hobby_button_5.setBackgroundColor(Color.WHITE);
        hobby_button_6.setBackgroundColor(Color.WHITE);
        hobby_button_7.setBackgroundColor(Color.WHITE);
    }
    
    public void hobby1(View v){
    	hobby_choice = 1;
    	hobby_button_1.setBackgroundColor(Color.GREEN);
        hobby_button_0.setBackgroundColor(Color.WHITE);
        hobby_button_2.setBackgroundColor(Color.WHITE);
        hobby_button_3.setBackgroundColor(Color.WHITE);
        hobby_button_4.setBackgroundColor(Color.WHITE);
        hobby_button_5.setBackgroundColor(Color.WHITE);
        hobby_button_6.setBackgroundColor(Color.WHITE);
        hobby_button_7.setBackgroundColor(Color.WHITE);
    }
    
    public void hobby2(View v){
    	hobby_choice = 2;
    	hobby_button_2.setBackgroundColor(Color.GREEN);
        hobby_button_1.setBackgroundColor(Color.WHITE);
        hobby_button_0.setBackgroundColor(Color.WHITE);
        hobby_button_3.setBackgroundColor(Color.WHITE);
        hobby_button_4.setBackgroundColor(Color.WHITE);
        hobby_button_5.setBackgroundColor(Color.WHITE);
        hobby_button_6.setBackgroundColor(Color.WHITE);
        hobby_button_7.setBackgroundColor(Color.WHITE);
    }
    
    public void hobby3(View v){
    	hobby_choice = 3;
    	hobby_button_3.setBackgroundColor(Color.GREEN);
        hobby_button_1.setBackgroundColor(Color.WHITE);
        hobby_button_2.setBackgroundColor(Color.WHITE);
        hobby_button_0.setBackgroundColor(Color.WHITE);
        hobby_button_4.setBackgroundColor(Color.WHITE);
        hobby_button_5.setBackgroundColor(Color.WHITE);
        hobby_button_6.setBackgroundColor(Color.WHITE);
        hobby_button_7.setBackgroundColor(Color.WHITE);
    }
    
    public void hobby4(View v){
    	hobby_choice = 4;
    	hobby_button_4.setBackgroundColor(Color.GREEN);
        hobby_button_1.setBackgroundColor(Color.WHITE);
        hobby_button_2.setBackgroundColor(Color.WHITE);
        hobby_button_3.setBackgroundColor(Color.WHITE);
        hobby_button_0.setBackgroundColor(Color.WHITE);
        hobby_button_5.setBackgroundColor(Color.WHITE);
        hobby_button_6.setBackgroundColor(Color.WHITE);
        hobby_button_7.setBackgroundColor(Color.WHITE);
    }
    
    public void hobby5(View v){
    	hobby_choice = 5;
    	hobby_button_5.setBackgroundColor(Color.GREEN);
        hobby_button_1.setBackgroundColor(Color.WHITE);
        hobby_button_2.setBackgroundColor(Color.WHITE);
        hobby_button_3.setBackgroundColor(Color.WHITE);
        hobby_button_4.setBackgroundColor(Color.WHITE);
        hobby_button_0.setBackgroundColor(Color.WHITE);
        hobby_button_6.setBackgroundColor(Color.WHITE);
        hobby_button_7.setBackgroundColor(Color.WHITE);
    }
    
    public void hobby6(View v){
    	hobby_choice = 6;
    	hobby_button_6.setBackgroundColor(Color.GREEN);
        hobby_button_1.setBackgroundColor(Color.WHITE);
        hobby_button_2.setBackgroundColor(Color.WHITE);
        hobby_button_3.setBackgroundColor(Color.WHITE);
        hobby_button_4.setBackgroundColor(Color.WHITE);
        hobby_button_5.setBackgroundColor(Color.WHITE);
        hobby_button_0.setBackgroundColor(Color.WHITE);
        hobby_button_7.setBackgroundColor(Color.WHITE);
    }
    
    public void hobby7(View v){
    	hobby_choice = 7;
    	hobby_button_7.setBackgroundColor(Color.GREEN);
        hobby_button_1.setBackgroundColor(Color.WHITE);
        hobby_button_2.setBackgroundColor(Color.WHITE);
        hobby_button_3.setBackgroundColor(Color.WHITE);
        hobby_button_4.setBackgroundColor(Color.WHITE);
        hobby_button_5.setBackgroundColor(Color.WHITE);
        hobby_button_6.setBackgroundColor(Color.WHITE);
        hobby_button_0.setBackgroundColor(Color.WHITE);
    }
    
    public void color0(View v){
    	color_choice = 0;
    	color_button_0.setBackgroundColor(Color.GREEN);
        color_button_1.setBackgroundColor(Color.WHITE);
        color_button_2.setBackgroundColor(Color.WHITE);
        color_button_3.setBackgroundColor(Color.WHITE);
        color_button_4.setBackgroundColor(Color.WHITE);
        color_button_5.setBackgroundColor(Color.WHITE);
        color_button_6.setBackgroundColor(Color.WHITE);
        color_button_7.setBackgroundColor(Color.WHITE);
        color_button_8.setBackgroundColor(Color.WHITE);
        color_button_9.setBackgroundColor(Color.WHITE);
    }
    
    public void color1(View v){
    	color_choice = 1;
    	color_button_1.setBackgroundColor(Color.GREEN);
        color_button_0.setBackgroundColor(Color.WHITE);
        color_button_2.setBackgroundColor(Color.WHITE);
        color_button_3.setBackgroundColor(Color.WHITE);
        color_button_4.setBackgroundColor(Color.WHITE);
        color_button_5.setBackgroundColor(Color.WHITE);
        color_button_6.setBackgroundColor(Color.WHITE);
        color_button_7.setBackgroundColor(Color.WHITE);
        color_button_8.setBackgroundColor(Color.WHITE);
        color_button_9.setBackgroundColor(Color.WHITE);
    }
    
    public void color2(View v){
    	color_choice = 2;
    	color_button_2.setBackgroundColor(Color.GREEN);
        color_button_0.setBackgroundColor(Color.WHITE);
        color_button_1.setBackgroundColor(Color.WHITE);
        color_button_3.setBackgroundColor(Color.WHITE);
        color_button_4.setBackgroundColor(Color.WHITE);
        color_button_5.setBackgroundColor(Color.WHITE);
        color_button_6.setBackgroundColor(Color.WHITE);
        color_button_7.setBackgroundColor(Color.WHITE);
        color_button_8.setBackgroundColor(Color.WHITE);
        color_button_9.setBackgroundColor(Color.WHITE);
    }
    
    public void color3(View v){
    	color_choice = 3;
    	color_button_3.setBackgroundColor(Color.GREEN);
        color_button_1.setBackgroundColor(Color.WHITE);
        color_button_2.setBackgroundColor(Color.WHITE);
        color_button_0.setBackgroundColor(Color.WHITE);
        color_button_4.setBackgroundColor(Color.WHITE);
        color_button_5.setBackgroundColor(Color.WHITE);
        color_button_6.setBackgroundColor(Color.WHITE);
        color_button_7.setBackgroundColor(Color.WHITE);
        color_button_8.setBackgroundColor(Color.WHITE);
        color_button_9.setBackgroundColor(Color.WHITE);
    }
    
    public void color4(View v){
    	color_choice = 4;
    	color_button_4.setBackgroundColor(Color.GREEN);
        color_button_1.setBackgroundColor(Color.WHITE);
        color_button_2.setBackgroundColor(Color.WHITE);
        color_button_3.setBackgroundColor(Color.WHITE);
        color_button_0.setBackgroundColor(Color.WHITE);
        color_button_5.setBackgroundColor(Color.WHITE);
        color_button_6.setBackgroundColor(Color.WHITE);
        color_button_7.setBackgroundColor(Color.WHITE);
        color_button_8.setBackgroundColor(Color.WHITE);
        color_button_9.setBackgroundColor(Color.WHITE);
    }
    
    public void color5(View v){
    	color_choice = 5;
    	color_button_5.setBackgroundColor(Color.GREEN);
        color_button_1.setBackgroundColor(Color.WHITE);
        color_button_2.setBackgroundColor(Color.WHITE);
        color_button_3.setBackgroundColor(Color.WHITE);
        color_button_4.setBackgroundColor(Color.WHITE);
        color_button_0.setBackgroundColor(Color.WHITE);
        color_button_6.setBackgroundColor(Color.WHITE);
        color_button_7.setBackgroundColor(Color.WHITE);
        color_button_8.setBackgroundColor(Color.WHITE);
        color_button_9.setBackgroundColor(Color.WHITE);
    }
    
    public void color6(View v){
    	color_choice = 6;
    	color_button_6.setBackgroundColor(Color.GREEN);
        color_button_1.setBackgroundColor(Color.WHITE);
        color_button_2.setBackgroundColor(Color.WHITE);
        color_button_3.setBackgroundColor(Color.WHITE);
        color_button_4.setBackgroundColor(Color.WHITE);
        color_button_5.setBackgroundColor(Color.WHITE);
        color_button_0.setBackgroundColor(Color.WHITE);
        color_button_7.setBackgroundColor(Color.WHITE);
        color_button_8.setBackgroundColor(Color.WHITE);
        color_button_9.setBackgroundColor(Color.WHITE);
    }
    
    public void color7(View v){
    	color_choice = 7;
    	color_button_7.setBackgroundColor(Color.GREEN);
        color_button_1.setBackgroundColor(Color.WHITE);
        color_button_2.setBackgroundColor(Color.WHITE);
        color_button_3.setBackgroundColor(Color.WHITE);
        color_button_4.setBackgroundColor(Color.WHITE);
        color_button_5.setBackgroundColor(Color.WHITE);
        color_button_6.setBackgroundColor(Color.WHITE);
        color_button_0.setBackgroundColor(Color.WHITE);
        color_button_8.setBackgroundColor(Color.WHITE);
        color_button_9.setBackgroundColor(Color.WHITE);
    }
    
    public void color8(View v){
    	color_choice = 8;
    	color_button_8.setBackgroundColor(Color.GREEN);
        color_button_1.setBackgroundColor(Color.WHITE);
        color_button_2.setBackgroundColor(Color.WHITE);
        color_button_3.setBackgroundColor(Color.WHITE);
        color_button_4.setBackgroundColor(Color.WHITE);
        color_button_5.setBackgroundColor(Color.WHITE);
        color_button_6.setBackgroundColor(Color.WHITE);
        color_button_7.setBackgroundColor(Color.WHITE);
        color_button_0.setBackgroundColor(Color.WHITE);
        color_button_9.setBackgroundColor(Color.WHITE);
    }
    
    public void color9(View v){
    	color_choice = 9;
    	color_button_9.setBackgroundColor(Color.GREEN);
        color_button_1.setBackgroundColor(Color.WHITE);
        color_button_2.setBackgroundColor(Color.WHITE);
        color_button_3.setBackgroundColor(Color.WHITE);
        color_button_4.setBackgroundColor(Color.WHITE);
        color_button_5.setBackgroundColor(Color.WHITE);
        color_button_6.setBackgroundColor(Color.WHITE);
        color_button_7.setBackgroundColor(Color.WHITE);
        color_button_8.setBackgroundColor(Color.WHITE);
        color_button_0.setBackgroundColor(Color.WHITE);
    }
    
    public void shape0(View v){
    	shape_choice = 0;
    	shape_button_0.setBackgroundColor(Color.GREEN);
        shape_button_1.setBackgroundColor(Color.WHITE);
        shape_button_2.setBackgroundColor(Color.WHITE);
        shape_button_3.setBackgroundColor(Color.WHITE);
    }
    
    public void shape1(View v){
    	shape_choice = 3;
    	shape_button_3.setBackgroundColor(Color.GREEN);
        shape_button_0.setBackgroundColor(Color.WHITE);
        shape_button_2.setBackgroundColor(Color.WHITE);
        shape_button_1.setBackgroundColor(Color.WHITE);
    }
    
    public void shape2(View v){
    	shape_choice = 2;
    	shape_button_2.setBackgroundColor(Color.GREEN);
        shape_button_0.setBackgroundColor(Color.WHITE);
        shape_button_1.setBackgroundColor(Color.WHITE);
        shape_button_3.setBackgroundColor(Color.WHITE);
    }
    
    public void shape3(View v){
    	shape_choice = 1;
    	shape_button_1.setBackgroundColor(Color.GREEN);
        shape_button_3.setBackgroundColor(Color.WHITE);
        shape_button_2.setBackgroundColor(Color.WHITE);
        shape_button_0.setBackgroundColor(Color.WHITE);
    }
    
    public void submit(View v) throws InstantiationException, IllegalAccessException,IOException{
    	PokemonMapping pokemap = new PokemonMapping();
    	int type = pokemap.getType(10*hobby_choice + color_choice);
    	int pokedex_number = pokemap.getPokedexNumber(100*shape_choice + 10*hobby_choice + color_choice, type);
    	
    	/*Database2 db = new Database2();
    	
    	TextView tv = (TextView) findViewById(R.id.tvPokenumber);
    	tv.setText(db.GetPokemonByID(pokedex_number));*/
    	
    	Intent intent = new Intent(this, ActivityShowResults.class);
    	intent.putExtra("POKEDEX", pokedex_number);
    	startActivity(intent);
    	//finish();
    }
    
    public void onClose(View v){
    	finish();
    }
    
}
