package com.johnny.strutturali.DisegnaForme_AD;

import com.johnny.strutturali.DisegnaForme_AD.client.Tavola;

public class Disegna {
	private Tavola tavola;
	public Disegna(Tavola tavola) { this.tavola = tavola; }
	
	public void richiesta(Figura figura) {
		tavola.disegna(figura, 100, 100);
	}
}
