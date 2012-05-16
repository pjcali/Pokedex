package us.pokedex;

import java.sql.*;
import java.util.Properties;
 
public class Database {

	public Connection con;
	public String Name = "Pokedex", Type = "MySQL", LogonType = "",
			Username = "Pokemon12", Password = "pokemon",
			Address = "thecity.sfsu.edu", Port = "3306";
	
	public String SID = "", Database = "Pokedex12.Pokedex",
			InitialCatalog = "", Instance = "";

	private String getConnectionUrl() {
		if (Type.compareTo("Oracle") == 0) {
			return new String("jdbc:oracle:thin:@" + Address + ":" + Port + ":" + SID);
		}// We use this.
		else if (Type.compareTo("MySQL") == 0) {
			return new String("jdbc:mysql://" + Address + ":" + Port + "/" + Database);
		} else if (Type.compareTo("SQL Server") == 0) {
			return new String("jdbc:jtds:sqlserver://" + Address + ":" + Port + "/" + InitialCatalog);
		}
		return null;
	}

	public synchronized void openConnection() throws ClassNotFoundException,
			SQLException {
		if (con != null) {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				con = null;
			}
		}

		Properties properties = new Properties();
		properties.put("user", Username);
		properties.put("password", Password);

		if (Type.compareTo("Oracle") == 0) {
			properties.put("internal_logon", LogonType); // SYSDBA, SYSOPER, NORMAL
			properties.put("v$session.program", "Name of your app");
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}// We use this.
		else if (Type.compareTo("MySQL") == 0) {
			Class.forName("com.mysql.jdbc.Driver");
		} else if (Type.compareTo("SQL Server") == 0) {
			if (Instance != null && Instance.compareTo("") != 0) {
				properties.put("instance", Instance);
			}
			properties.put("appName", "Name of your app");
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
		}

		con = DriverManager.getConnection(getConnectionUrl(), properties);
	}

	// Function for retrieving a pokemon by it's ID number from the database.
	public static String GetPokemonByID(int id) {
		Database aDatabase = new Database();
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int pokemon_id = id;

		// Try to connect to database.
		try {
			aDatabase.openConnection();
		} catch (Exception SQLException){
			// Some kind of Exception handling here.
		}
		
		// Using the database connection...
		try {
			con = aDatabase.con;
			st = con.createStatement();

			// Try executing the MySQL query on the database connection.
			String queryString = "SELECT * FROM Pokedex12.Pokedex WHERE Pokemon_ID = " + pokemon_id;
			rs = st.executeQuery(queryString);

			// Print out results seen.
			if (rs.next()) {
				System.out.println(rs.getString(1));
			}

		} catch (SQLException ex) {
			// Some kind of Exception handling here.
		}
		return rs.toString();
	}

	// Function for retrieving a pokemon by it's name from the database.
	public String GetPokemonByName(String name) {
		Database aDatabase = null;
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		String pokemon_name = name;

		// Try to connect to database.
		try {
			aDatabase.openConnection();
		} catch (Exception SQLException) {
			// Some kind of Exception handling here.
		}

		// Using the database connection...
		try {
			con = aDatabase.con;
			st = con.createStatement();

			// Try executing the MySQL query on the database connection.
			String queryString = "SELECT * FROM Pokedex12.Pokedex WHERE name = '" + pokemon_name + "'";
			rs = st.executeQuery(queryString);

			// Print out results seen.
			if (rs.next()) {
				System.out.println(rs.getString(1));
			}

		} catch (SQLException ex) {
			// Some kind of Exception handling here.
		}
		return rs.toString();
	}
}