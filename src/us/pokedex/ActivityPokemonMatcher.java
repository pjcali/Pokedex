
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
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.sql.*;
//package us.pokedex;



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
	int hobby_choice = -1;
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
    }
    
//    private
//}

    public void hobby0(View v){
    	//this is where the play button comes into play.
        /*if ( hobby_choice != 0 ){        //if the text to speech is not playing then play and update button.
                //playButton.setText("Pause Playback");
                hobby_button_0.setBackgroundColor(Color.GREEN);
                //hobby_choice = 0;
        }
        else {
            //playButton.setText("Play Statistics"); 
            hobby_button_0.setBackgroundColor(Color.RED);
            hobby_choice = 0;
        }*/
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
    	//this is where the play button comes into play.
        /*if ( hobby_choice != 0 ){        //if the text to speech is not playing then play and update button.
                //playButton.setText("Pause Playback");
                hobby_button_0.setBackgroundColor(Color.GREEN);
                //hobby_choice = 0;
        }
        else {
            //playButton.setText("Play Statistics"); 
            hobby_button_0.setBackgroundColor(Color.RED);
            hobby_choice = 0;
        }*/
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
    	//this is where the play button comes into play.
        /*if ( hobby_choice != 0 ){        //if the text to speech is not playing then play and update button.
                //playButton.setText("Pause Playback");
                hobby_button_0.setBackgroundColor(Color.GREEN);
                //hobby_choice = 0;
        }
        else {
            //playButton.setText("Play Statistics"); 
            hobby_button_0.setBackgroundColor(Color.RED);
            hobby_choice = 0;
        }*/
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
    	//this is where the play button comes into play.
        /*if ( hobby_choice != 0 ){        //if the text to speech is not playing then play and update button.
                //playButton.setText("Pause Playback");
                hobby_button_0.setBackgroundColor(Color.GREEN);
                //hobby_choice = 0;
        }
        else {
            //playButton.setText("Play Statistics"); 
            hobby_button_0.setBackgroundColor(Color.RED);
            hobby_choice = 0;
        }*/
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
    	//this is where the play button comes into play.
        /*if ( hobby_choice != 0 ){        //if the text to speech is not playing then play and update button.
                //playButton.setText("Pause Playback");
                hobby_button_0.setBackgroundColor(Color.GREEN);
                //hobby_choice = 0;
        }
        else {
            //playButton.setText("Play Statistics"); 
            hobby_button_0.setBackgroundColor(Color.RED);
            hobby_choice = 0;
        }*/
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
    	//this is where the play button comes into play.
        /*if ( hobby_choice != 0 ){        //if the text to speech is not playing then play and update button.
                //playButton.setText("Pause Playback");
                hobby_button_0.setBackgroundColor(Color.GREEN);
                //hobby_choice = 0;
        }
        else {
            //playButton.setText("Play Statistics"); 
            hobby_button_0.setBackgroundColor(Color.RED);
            hobby_choice = 0;
        }*/
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
    	//this is where the play button comes into play.
        /*if ( hobby_choice != 0 ){        //if the text to speech is not playing then play and update button.
                //playButton.setText("Pause Playback");
                hobby_button_0.setBackgroundColor(Color.GREEN);
                //hobby_choice = 0;
        }
        else {
            //playButton.setText("Play Statistics"); 
            hobby_button_0.setBackgroundColor(Color.RED);
            hobby_choice = 0;
        }*/
    	hobby_button_7.setBackgroundColor(Color.GREEN);
        hobby_button_1.setBackgroundColor(Color.WHITE);
        hobby_button_2.setBackgroundColor(Color.WHITE);
        hobby_button_3.setBackgroundColor(Color.WHITE);
        hobby_button_4.setBackgroundColor(Color.WHITE);
        hobby_button_5.setBackgroundColor(Color.WHITE);
        hobby_button_0.setBackgroundColor(Color.WHITE);
        hobby_button_7.setBackgroundColor(Color.WHITE);
    }
    
    public void hobby7(View v){
    	//this is where the play button comes into play.
        /*if ( hobby_choice != 0 ){        //if the text to speech is not playing then play and update button.
                //playButton.setText("Pause Playback");
                hobby_button_0.setBackgroundColor(Color.GREEN);
                //hobby_choice = 0;
        }
        else {
            //playButton.setText("Play Statistics"); 
            hobby_button_0.setBackgroundColor(Color.RED);
            hobby_choice = 0;
        }*/
    	hobby_button_7.setBackgroundColor(Color.GREEN);
        hobby_button_1.setBackgroundColor(Color.WHITE);
        hobby_button_2.setBackgroundColor(Color.WHITE);
        hobby_button_3.setBackgroundColor(Color.WHITE);
        hobby_button_4.setBackgroundColor(Color.WHITE);
        hobby_button_5.setBackgroundColor(Color.WHITE);
        hobby_button_6.setBackgroundColor(Color.WHITE);
        hobby_button_0.setBackgroundColor(Color.WHITE);
    }

/**
 * @title: ActivityPokemonMatcher.java
 * @description: Pokemon Database Query Strings and testing.
 * @author Tyler Wood
 * @date April 26, 9:02pm PDT
 */

//1. Get a Pokemon by its ID number. Eg. 001 -> Bulbasaur.
//Prototype: Using the primary key of the database, the Pokedex_ID, this statement returns a Bulbasaur entry:
//SELECT * FROM Pokedex12.Pokedex WHERE Pokedex_ID = 1;

//Class for retrieving a pokemon by it's ID number from the database.
private class GetPokemonByID {
    
    //Instance of this class being used.
    private GetPokemonByID instance = null;
    
    public GetPokemonByID()
    {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        //Hardcoded database location.
        String url = "thecity.sfsu.edu:3306";
        String user = "Pokemon12";
        String password = "pokemon";
        
        //Hardcoded prototype pokemon ID.
        int pokemon_id = 1;    //For a pokemon, BULBASAUR.
		//int pokemon_id = 25;    //For a pokemon, PIKACHU.

        try {
            //Connect to the databse.
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();

			//Try the connection.
            if((rs == (st.executeQuery("SELECT * FROM Pokedex12.Pokedex WHERE Pokedex_ID = " + pokemon_id))))
            { /* Success. */}
			
			else
			{/* Not success; do something else. */}
            
			//Print out results seen.
            if (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (SQLException ex) {
                //Some kind of Exception handling here.
        } finally {
            //Close connections safely.
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                    //Some kind of Exception handling here.
            }
        }
    }
    
    //Class testing; use to instantiate a new instance of the class, which will run.
    public GetPokemonByID user_GetPokemonByID()
    {
        if(instance == null)
            instance = new GetPokemonByID();
        return instance;
    }  
}

//2. Get a Pokemon by its name. Eg. Pikachu -> Get Pokemon 025.
//Prototype: Using the name column of the database, this statement returns a Pikachu entry:
//SELECT * FROM Pokedex12.Pokedex WHERE name = 'PIKACHU';

//Class for retrieving a pokemon by it's name from the database.
private class GetPokemonByName {
    
    //Instance of this class being used.
    private GetPokemonByName instance = null;
    
    public GetPokemonByName()
    {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        //Hardcoded database location.
        String url = "thecity.sfsu.edu:3306";
        String user = "Pokemon12";
        String password = "pokemon";
        
        //Hardcoded prototype pokemon name.
		String pokemon_name = "PIKACHU";
		
        try {
            //Connect to the databse.
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();

			//Try the connection.
            if((rs == (st.executeQuery("SELECT * FROM Pokedex12.Pokedex WHERE name = " + pokemon_name))))
            { /* Success. */}
			
			else
			{/* Not success; do something else. */}
            
			//Print out results seen.
            if (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (SQLException ex) {
                //Some kind of Exception handling here.
        } finally {
            //Close connections safely.
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                    //Some kind of Exception handling here.
            }
        }
    }
    
    //Class testing; use to instantiate a new instance of the class, which will run.
    public GetPokemonByName user_GetPokemonByName()
    {
        if(instance == null)
            instance = new GetPokemonByName();
        return instance;
    }  
}
}

