package com.johnny.strutturali.OggettiGrafici_CO;

public class Rettangolo extends OggettoGrafico {
	
	private int lunghezza;
	private int altezza;
	private int x;
	private int y;
	
	public Rettangolo() {
		this.lunghezza = 0;
		this.altezza = 0;
	}
	
	public Rettangolo(int lunghezza, int altezza, int x, int y) {
		super();
		this.lunghezza = lunghezza;
		this.altezza = altezza;
		this.x=x;
		this.y=y;
	}
	
	@Override
	public void disegna(MyPanel panel) {
		panel.disegnaRettangolo(this);
	}

	public int getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Rettangolo [lunghezza=" + lunghezza + ", altezza=" + altezza + "]";
	}
}
