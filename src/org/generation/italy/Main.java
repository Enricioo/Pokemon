package org.generation.italy;

import java.util.ArrayList;
import java.util.List;

import org.generation.italy.model.Acqua;
import org.generation.italy.model.Elettro;
import org.generation.italy.model.Pokemon;

public class Main {

	public static void main(String[] args) {
		
		int i;
		List<Pokemon> elencoPokemon = new ArrayList <Pokemon>();
		
		Elettro e = new Elettro("Pikachu", "Elettro", "Prima");
		elencoPokemon.add(e);
		e.attacca();
		e.dormi();
		Acqua a = new Acqua("Squirtle", "Acqua", "Prima");
		elencoPokemon.add(a);
		a.attacca();
		a.dormi();
	
		System.out.println(elencoPokemon.toString());
		
		elencoPokemon.add(new Elettro("Arceus", "Elettro", "Quarta"));
		elencoPokemon.add(new Acqua("Greninja", "Acqua", "Sesta"));
		
		for (Pokemon pokem : elencoPokemon) {
			pokem.debolezze();
			pokem.dormi();
			System.out.println(pokem.toString());
		}
	}

}
