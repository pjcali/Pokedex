package us.pokedex;

import android.app.Activity;
import android.os.Bundle;
import java.sql.*;


//Unused Sean code:
//public class ActivityPokemonMatcher extends Activity {
    /** Called when the activity is first created. */
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_pokemon_matcher);
//    }
    
//    private
//}


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
public class GetPokemonByID {
    
    //Instance of this class being used.
    private static GetPokemonByID instance = null;
    
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
    public static GetPokemonByID user_GetPokemonByID()
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
public class GetPokemonByName {
    
    //Instance of this class being used.
    private static GetPokemonByName instance = null;
    
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
            if((rs == (st.executeQuery("SELECT * FROM Pokedex12.Pokedex WHERE name = " pokemon_name))))
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
    public static GetPokemonByName user_GetPokemonByName()
    {
        if(instance == null)
            instance = new GetPokemonByName();
        return instance;
    }  
}