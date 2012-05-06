package us.pokedex;

import java.util.ArrayList;

//class to contain all of the relevant pokemon information
public class Pokemon {
	private int attributes;	//Used to collect activity/color/shape data to determine pokedex number
	private int pokedexNumber;
	private String description;
	private ArrayList weaknesses;
	private String type1;
	private String type2;
	private String ability;
	private float height;
	private float weight;
	
	/**
	 * Pokemon class constructor
	 */
	public Pokemon()
	{
		pokedexNumber = 0;	//Pokedex number used to obtain information from the Database
		description = "";
		weaknesses = new ArrayList();
		type1 = "";
		type2 = "";
		ability = "";
		height = 0;
		weight = 0;
	}
	
	/**
	 * Gets the pokedex number
	 * @return Returns pokedex number of current pokemon
	 */
	public int getPokedexNumber(){
		return pokedexNumber;
	}
	
	/**
	 * Gets the description of the pokemon
	 * @return Returns description of current pokemon
	 */
	public String getDescription(){
		return description;
	}
	
	/**
	 * Gets the list of weaknesses
	 * @return
	 */
	public ArrayList<String> getWeaknesses(){
		return weaknesses;
	}
	/**
	 * Method to add the user's color choice to the list of chosen attributes by adding the color's enumeration as the 1's digit
	 * @param i enumeration of user's chosen color
	 */
	
	public String getType1(){
		return type1;
	}
	
	public String getType2(){
		return type2;
	}
	
	public String getAbility(){
		return ability;
	}
	
	public Float getHeight(){
		return height;
	}
	
	public Float getWeight(){
		return weight;
	}
	
	public void addColor( int i ){
		attributes += ( i );
	}
	
	/**
	 * Method to add the user's activity choise to the list of chosen attributes by adding the activity's enumeration as the 10's digit
	 * @param i enumeration of the user's chosen activity
	 */
	public void addActivity( int i ){
		attributes += ( 10 * i );
	}
	
	/**
	 * Method to add the user's activity choise to the list of chosen attributes by adding the shape's enumeration as the 10's digit
	 * @param i enumeration of the user's chosen shape
	 */
	public void addShape( int i ){
		attributes += ( 100 * i );
	}
}


