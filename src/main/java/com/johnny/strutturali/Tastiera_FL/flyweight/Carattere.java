package com.johnny.strutturali.Tastiera_FL.flyweight;

public class Carattere {
	
	protected char carattere;
	
	public Carattere() {
		this.carattere = '\u0000';
	}
	
	public Carattere(char carattere) {
		this.carattere = carattere;
	}
	
	public char getCarattere() {
		return this.carattere;
	}

	public void setCarattere(char carattere) {
		this.carattere = carattere;
	}
}
