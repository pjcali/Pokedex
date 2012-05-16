package us.pokedex;

import java.util.ArrayList;

//class to contain all of the relevant pokemon information
public class Pokemon {
	public static String ID;
	private int attributes;	//Used to collect activity/color/shape data to determine pokedex number
	private int pokedexNumber;
	private String description;
	private ArrayList weaknesses;
	private String type1;
	private String type2;
	private String ability;
	private float height;
	private float weight;
	private int hp;
	private int attack;
	private int defense;
	private int spAttack;
	private int spDefense;
	private int speed;
	private String name;
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
		name = "";
	}
	
	/**
	 * Gets the pokedex number
	 * @return Returns pokedex number of current pokemon
	 */
	public int getPokedexNumber(){
		return pokedexNumber;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String nm){
		name = nm;
	}
	
	
	/**
	 * Gets the description of the pokemon
	 * @return Returns description of current pokemon
	 */
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String des){
		description = des;
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
	
	public void setType1(String tp){
		type1 = tp;
	}
	
	public String getType2(){
		return type2;
	}
	
	public void setType2(String tp){
		type2 = tp;
	}
	
	public String getAbility(){
		return ability;
	}
	
	public void setAbility(String a){
		ability = a;
	}
	
	public Float getHeight(){
		return height;
	}
	
	public void setHeight(Float h){
		height = h;
	}
	
	public Float getWeight(){
		return weight;
	}
	
	public void setWeight(Float w){
		weight = w;
	}
	
	public int getHp(){
		return hp;
	}
	
	public void setHp(int h){
		hp = h;
	}
	
	public int getAttack(){
		return hp;
	}
	
	public void setAttack(int a){
		attack = a;
	}

	public int getDefense(){
		return defense;
	}
	
	public void setDefense(int d){
		defense = d;
	}
	
	public int getspAttack(){
		return spAttack;
	}
	
	public void setspAttack(int d){
		spAttack = d;
	}
	
	public int getspDefense(){
		return spDefense;
	}
	
	public void setspDefense(int d){
		spDefense = d;
	}
	
	void addColor( int i ){
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


