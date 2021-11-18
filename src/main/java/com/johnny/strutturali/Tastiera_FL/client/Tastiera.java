package com.johnny.strutturali.Tastiera_FL.client;

import java.util.ArrayList;
import java.util.List;

import com.johnny.strutturali.Tastiera_FL_flyweight.Carattere;

public class Tastiera {
	private List<Carattere> caratteri;
	
	public Tastiera() {
		caratteri = new ArrayList<Carattere>();
	}
	
	public Carattere dammiCarattere(char carattere) {
		for(Carattere c : caratteri)
			if(carattere == c.getCarattere())
				return c;
		Carattere nuovoCarattere = new Carattere(carattere);
		caratteri.add(nuovoCarattere);
		return nuovoCarattere;
	}
	
	public void stampaCaratteri() {
		for(Carattere c : caratteri)
			System.out.print(c.getCarattere());
		System.out.println();
	}
	
	public int getNumeroCaratteri() {
		return caratteri.size();
	}
}
