package us.pokedex;

import java.util.HashMap;

public class PokemonMapping {
	//Create mapping for final pokedex number
	private HashMap<Integer, Integer> map_pokemon;
	
	//Create mapping for pokemon types
	private HashMap<Integer, Integer> map_type;
	
	/**
	 * Constructor for instantiating the Pokemon Mappings
	 */
	PokemonMapping(){
		map_pokemon = new HashMap<Integer, Integer>();
		map_type = new HashMap<Integer, Integer>();
		//Map Unique Pokedex # to activity/color pairs
		
		//Maps to Dragon type
		map_type.put(43, 0);
		map_type.put(48, 0);
		
		//Maps to Normal type
		map_type.put(14, 1);
		map_type.put(19, 1);
		
		//Maps to Fire type
		map_type.put(11, 2);
		map_type.put(12, 2);
		map_type.put(13, 2);
		
		//Maps to Water type
		map_type.put(51, 3);
		map_type.put(58, 3);
		
		//Maps to Electric type
		map_type.put(21, 4);
		map_type.put(22, 4);
		map_type.put(23, 4);
		map_type.put(25, 4);
		
		//Maps to Grass type
		map_type.put(44, 5);
		map_type.put(46, 5);
		map_type.put(49, 5);
		
		//Maps to Ice type
		map_type.put(51, 6);
		map_type.put(58, 6);
		
		//Maps to Fighting type
		map_type.put(31, 7);
		map_type.put(37, 7);
		map_type.put(38, 7);
		
		//Maps to Poison type
		map_type.put(69, 8);
		
		//Maps to Psychic 
		map_type.put(0, 9);
		map_type.put(1, 9);
		map_type.put(4, 9);
		map_type.put(5, 9);
		
		//Maps to Bug type
		map_type.put(47, 10);
		
		//Maps to Rock type
		map_type.put(30, 11);
		map_type.put(40, 11);
		
		//Maps to Ghost type
		map_type.put(68, 12);
		
		//Maps to Ground type
		map_type.put(45, 13);
		
		//Maps to Dragon type by shape
		map_pokemon.put(0, 147);
		map_pokemon.put(1, 148);
		map_pokemon.put(2, 149);
		map_pokemon.put(3, 149);
		
		
	}
	
	public int getPokedexNumber( int att, int type ){
		
		switch (type){
			case 0:	if( att < 100 )
						return 147;
					else if( att > 200 )
						return 149;
					else
						return 148;
			//Filters NORMAL type pokemon
			case 1:	switch (att % 10){
				//Filter WHITE & NORMAL pokemon
				case 1:
					if( att < 100 )
						return 20;
					else if( att < 200 )
						return 52;
					else if( att < 300 )
						return 53;
					else
						return 83;
				case 2:
			}
		}
		return 0;
	}
	
}
