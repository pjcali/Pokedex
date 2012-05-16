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
		
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 10; j++)
				map_type.put(i*10+j, 0);
		}
			
		//Map Unique Pokedex # to activity/color pairs
		
		//Maps to Dragon type
		map_type.put(43, 0);
		map_type.put(48, 0);
		
		//Maps to Normal type
		map_type.put(14, 1);
		map_type.put(19, 1);
		map_type.put(71, 1);
		map_type.put(72, 1);
		map_type.put(73, 1);
		map_type.put(74, 1);
		map_type.put(75, 1);
		map_type.put(76, 1);
		map_type.put(77, 1);
		map_type.put(78, 1);
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
		map_type.put(50, 6);
		map_type.put(59, 6);
		
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
	/**
	 * Returns the pokemon type based on user choices
	 * @param att Enumeration of user choices
	 * @return The Pokemon type
	 */
	public int getType( int att ){
		return map_type.get(att);
	}
	/**
	 * 
	 * @param att Enumaration of chosen shape/color/activity
	 * @param type Pokemon type (ie Dragon type, water type)
	 * @return Pokedex number
	 */
	public int getPokedexNumber( int att, int type ){
		
		switch (type){
			default: return 132;
			//Filters DRAGON type pokemon
			case 0:	if( att < 100 )
						return 147;
					else if( att > 200 )
						return 149;
					else
						return 148;
			//Filters NORMAL type pokemon
			case 1:	switch (att % 10){
				default: return 132;
				//Filters NORMAL & WHITE pokemon
				case 1:
					if( att < 100 )
						return 20;
					else if( att < 200 )
						return 52;
					else if( att < 300 )
						return 53;
					else
						return 83;
				//Filters NORMAL & RED pokemon
				case 2: 
					if( att < 100 )
						return 21;
					else if( att < 200 )
						return 22;
					else if( att < 300 )
						return 108;
					else
						return 113;
				//Filters NORMAL & ORANGE pokemon
				case 3:
					if( att < 100 )
						return 16;
					else if( att < 200 )
						return 17;
					else if( att < 300 )
						return 18;
					else
						return 128;
				//Filters NORMAL & PINK pokemon
				case 4: 
					if( att < 100 )
						return 35;
					else if( att < 200 )
						return 36;
					else if( att < 300 )
						return 39;
					else
						return 40;
				//Filters NORMAL & YELLOW pokemon
				case 5:
				//Filters NORMAL & GREEN pokemon
				case 6:
				//Filters NORMAL & BROWN pokemon
				case 7:
					if( att < 100 )
						return 115;
					else if( att < 200 )
						return 133;
					else if( att < 300 )
						return 84;
					else
						return 85;
				//Filters NORMAL & BLUE pokemon
				case 8: 
					if( att < 100 )
						return 19;
					else if( att < 200 )
						return 143;
					else
						return 132;
				//Filters NORMAL & PURPLE pokemon
				case 9:
					if( att < 100 )
						return 19;
					else if( att < 200 )
						return 143;
					else
						return 132;	
			}
			//Filters FIRE type pokemon
			case 2: switch( att % 10 ){
				default: return 132;
				case 0:
				//Filters FIRE & WHITE 	
				case 1:
					if( att < 100 )
						return 77;
					else if( att < 200 )
						return 78;
					else if( att < 300 )
						return 58;
					else
						return 59;
				//Filters FIRE & RED 
				case 2:
					if( att < 100 )
						return 37;
					else if( att < 200 )
						return 126;
					else
						return 136;
				//Filters FIRE & ORANGE
				case 3:
					if( att < 100 )
						return 4;
					else if( att < 200 )
						return 5;
					else if( att < 300 )
						return 6;
					else
						return 146;
				case 4:
				//Filters FIRE & YELLOW
				case 5:
					if( att < 100 )
						return 38;
					else if( att < 200 )
						return 77;
					else if( att < 300 )
						return 78;
					else
						return 146;
			}
			//Filters WATER type pokemon
			case 3: switch( att / 10 ){
				default: return 137;
				case 1:
					if( att < 100 )
						return 86;
					else if( att < 200 )
						return 118;
					else if( att < 300 )
						return 119;
					else
						return 87;
				case 4:
					if( att < 100 )
						return 98;
					else if( att < 200 )
						return 99;
					else if( att < 300 )
						return 79;
					else
						return 80;
				case 8:
					if( att < 100 )
						return 7;
					else if( att < 200 )
						return 8;
					else if( att < 300 )
						return 9;
					else
						return 55;
				case 9:
					if( att < 100 )
						return 90;
					else if( att < 200 )
						return 91;
					else if( att < 300 )
						return 72;
					else
						return 73;
			}
			
		}
	}
	
}
