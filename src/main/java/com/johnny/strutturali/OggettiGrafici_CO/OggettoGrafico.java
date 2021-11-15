package com.johnny.strutturali.OggettiGrafici_CO;

public abstract class OggettoGrafico {
	
	protected MyPanel panel;
	
	public OggettoGrafico() {
		this.panel = null;
	}
	
	public OggettoGrafico(MyPanel panel) {
		this.panel = panel;
	}
	
	public void disegna(MyPanel panel) { 
		
	}
	
	public void add(OggettoGrafico oggetto) {
	}
	
	public OggettoGrafico getChild(int k) {
		return null;
	}
}
