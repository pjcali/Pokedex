package us.pokedex;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.*;

public class Database2 {
 
    //private static Database2 instance = null;
    private static Connection connection;
    //private static Statement st;
    private static ResultSet rs;

    public Database2() throws IllegalAccessException, InstantiationException, ClassNotFoundException{
    	
        try {
            String username = "Pokedex12";
        	//String username = "root";
            String password = "pokemon";
            
            String url = "jdbc:mysql://thecity.sfsu.edu:3306/test";
            //String url = "jdbc:mysql://snyamathi.dyndns.org:37965/lithub";
				Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*public static Database2 getDatabase() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        if (instance == null) {
            instance = new Database2();
        }
        return instance;
    }*/
    
    public String GetPokemonByID(int id) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        
        int pokemon_id = id;
        
        try {
        	Statement st = connection.createStatement();
            rs = st.executeQuery("SELECT * FROM Pokedex12.Pokedex WHERE Pokemon_ID = " + pokemon_id);
			if (rs.next()) {
				System.out.println(rs.getString(1));
			}
			rs.toString();
			
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public String GetPokemonByName(String name) throws SQLException {
    	
        String pokemon_name = name;

        String updateString = "SELECT * FROM Pokedex12.Pokedex WHERE name=?";
        PreparedStatement statement = connection.prepareStatement(updateString);
        statement.setString(1, pokemon_name);
        ResultSet rs = statement.executeQuery();

		if (rs.next()) {
			System.out.println(rs.getString(1));
		}

		return rs.toString();
    }
}