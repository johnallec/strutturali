package com.johnny.strutturali.Tastiera_FL;

import java.util.ArrayList;
import java.util.List;

import com.johnny.strutturali.Tastiera_FL_flyweight.Carattere;

public class Riga {
	
	private List<Carattere> listaCaratteri;
	
	public Riga() {
		listaCaratteri = new ArrayList<Carattere>();
	}
	
	public void inserisciCarattere(Carattere c) {
		listaCaratteri.add(c);
	}
	
	public void stampaRiga() {
		for(Carattere c : listaCaratteri)
			System.out.print(c.getCarattere());
	}

}
