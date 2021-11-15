package com.johnny.strutturali.FormeColorate_BR;

import java.awt.Color;

public abstract class Figura {
	protected Color colore;
	protected String nome;
	
	public Figura() {}
	public Figura(Color colore) {
		this.colore = colore;
	}
	
	public Figura getFigura() {
		return this;
	}
	
	public Color getColor() {
		return this.colore;
	}
}
