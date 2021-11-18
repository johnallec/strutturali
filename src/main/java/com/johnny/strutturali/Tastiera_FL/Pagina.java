package com.johnny.strutturali.Tastiera_FL;

import java.util.ArrayList;
import java.util.List;


public class Pagina {
	
	private List<Riga> listaRighe;
	
	public Pagina() {
		listaRighe = new ArrayList<Riga>();
	}
	
	public void aggiungiRiga(Riga riga) {
		listaRighe.add(riga);
	}
	
	public Riga getRiga(int x) {
		return listaRighe.get(x);
	}
	
	public void stampaRighe() {
		for(Riga r : listaRighe) {
			r.stampaRiga();
		}
	}
}
