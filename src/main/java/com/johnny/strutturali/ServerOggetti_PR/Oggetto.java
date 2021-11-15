package com.johnny.strutturali.ServerOggetti_PR;

public abstract class Oggetto {
	protected String nome;
	public Oggetto() {
		this.nome = "";
	}
	
	public Oggetto(String nome) {
		this.nome = nome;
	}
	
	public void costruisci() {};
	protected void immagazzina(Oggetto o) {}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
