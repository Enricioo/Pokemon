package org.generation.italy.model;

import java.util.Scanner;

public class Elettro extends Pokemon {

	private int mossa;
	private String gen;
	private boolean attacco;
	Scanner sc = new Scanner(System.in);

	public Elettro(String nome, String tipo, String gen) {
		super(nome, tipo);
		this.gen = gen;
	}

	public String getGen() {
		return gen;
	}

	@Override
	public void attacca() {
		while (!attacco) {
			System.out.println("Seleziona la tua mossa: ");
			System.out.println("1. Fulmine \n2. Tuononda");
			mossa = sc.nextInt();
			sc.nextLine();
			attacco = false;

			switch (mossa) {
			case 1:
				System.out.println(nome + " usa Fulmine!");
				attacco = true;
				break;
			case 2:
				System.out.println(nome + " usa Tuononda!");
				attacco = true;
				break;
			default:
				System.out.println("Mossa non valida");
				break;
			}
		}

	}

	@Override
	public void debolezze() {
		System.out.println(
				"Il tipo Elettro è uno dei diciotto tipi esistenti di Pokémon e le sue debolezze sono: il tipo Terra.");
	}

	@Override
	public String toString() {
		return "Pokemon Elettro [Nome= " + nome + ", Tipo= " + tipo + ", Generazione= " + gen + "]";
	}

}
