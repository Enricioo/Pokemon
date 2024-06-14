package org.generation.italy.model;

import java.util.Scanner;

public class Acqua extends Pokemon {

	private String gen;
	private int mossa;
	private boolean attacco;
	Scanner sc = new Scanner(System.in);

	public Acqua(String nome, String tipo, String gen) {
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
			System.out.println("1. Pistolacqua \n2. Idropompa");
			mossa = sc.nextInt();
			sc.nextLine();
			attacco = false;
			switch (mossa) {
			case 1:
				System.out.println(nome + " usa Pistolacqua!");
				attacco = true;
				break;
			case 2:
				System.out.println(nome + " usa Idropompa!");
				attacco = true;
				break;
			default:
				System.out.println("Mossa non valida, riprova:");
				break;
			}
		}

	}

	@Override
	public void debolezze() {
		System.out.println(
				"Il tipo Acqua è uno dei diciotto tipi esistenti di Pokémon e le sue debolezze sono: il tipo Erba e il tipo Elettro.");
	}

	@Override
	public String toString() {
		return "Pokemon Acqua [Nome= " + nome + ", Tipo= " + tipo + ", Generazione= " + gen + "]";
	}

}
