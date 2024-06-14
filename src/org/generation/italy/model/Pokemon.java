package org.generation.italy.model;

public abstract class Pokemon {

	protected String nome;
	protected String tipo;
	
	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public Pokemon(String nome, String tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public abstract void attacca();
	public abstract void debolezze();
	
	public void dormi() {
		System.out.println(nome + " sta dormendo... ZzZZzz");
	}

	public void evolvi() {
		System.out.println(nome + " si sta evolvendo...");
	}
	
	@Override
	public String toString() {
		return "Pokemon [nome=" + nome + ", tipo=" + tipo + "]";
	}
	
}
