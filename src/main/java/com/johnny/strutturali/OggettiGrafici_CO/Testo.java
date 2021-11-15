package com.johnny.strutturali.OggettiGrafici_CO;

public class Testo extends OggettoGrafico {
	private String testo;
	
	public Testo() {
		this.testo = "Questo è un testo";
	}
	
	public Testo(String testo) {
		super();
		this.testo = testo;
	}

	@Override
	public void disegna(MyPanel panel) {
		panel.disegnaTesto(this);
	}
	
	public void setTesto(String testo) {
		this.testo = testo;
	}
	
	public String getTesto() {
		return this.testo;
	}

}