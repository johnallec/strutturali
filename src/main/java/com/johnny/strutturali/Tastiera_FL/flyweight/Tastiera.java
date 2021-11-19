package com.johnny.strutturali.Tastiera_FL.flyweight;

import java.util.HashMap;

import com.johnny.strutturali.Tastiera_FL_flyweight.Carattere;

public class Tastiera {
	private HashMap<Character,Carattere> caratteri;
	
	public Tastiera() {
		caratteri = new HashMap<Character,Carattere>();
	}
	
	public Carattere dammiCarattere(char carattere) {
		if(caratteri.containsKey(carattere))
			return caratteri.get(carattere);
		Carattere nuovoCarattere = new Carattere(carattere);
		caratteri.put(carattere,nuovoCarattere);
		return nuovoCarattere;
	}
	
	public void stampaCaratteri() {
		for(char c : caratteri.keySet())
			System.out.print(caratteri.get(c).getCarattere());
		System.out.println();
	}
	
	public int getNumeroCaratteri() {
		return caratteri.size();
	}
}
