package com.johnny.strutturali.Tastiera_FL;

import java.util.ArrayList;
import java.util.List;

import com.johnny.strutturali.Tastiera_FL.flyweight.Carattere;

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

	public void stampaRipetuti() {
		for(int i = 0; i < listaCaratteri.size()-1; ++i)
			for(int j = i+1; j < listaCaratteri.size(); ++j)
				if(listaCaratteri.get(i) == listaCaratteri.get(j))
					System.out.println("Carattere " + listaCaratteri.get(i).getCarattere() + " posizione " + i + " <-> Carattere " + listaCaratteri.get(j).getCarattere() + " posizione " + j );
	}
}
