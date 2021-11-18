package com.johnny.strutturali.Tastiera_FL.client;

import com.johnny.strutturali.Tastiera_FL.Pagina;
import com.johnny.strutturali.Tastiera_FL.Riga;

public class Main {

	public static void main(String[] args) {
		Tastiera t = new Tastiera();
		Riga riga1 = new Riga();
		riga1.inserisciCarattere(t.dammiCarattere('c'));
		riga1.inserisciCarattere(t.dammiCarattere('i'));
		riga1.inserisciCarattere(t.dammiCarattere('a'));
		riga1.inserisciCarattere(t.dammiCarattere('o'));
		riga1.inserisciCarattere(t.dammiCarattere(' '));
		riga1.inserisciCarattere(t.dammiCarattere('c'));
		riga1.inserisciCarattere(t.dammiCarattere('o'));
		riga1.inserisciCarattere(t.dammiCarattere('m'));
		riga1.inserisciCarattere(t.dammiCarattere('e'));
		riga1.inserisciCarattere(t.dammiCarattere(' '));
		riga1.inserisciCarattere(t.dammiCarattere('s'));
		riga1.inserisciCarattere(t.dammiCarattere('t'));
		riga1.inserisciCarattere(t.dammiCarattere('a'));
		riga1.inserisciCarattere(t.dammiCarattere('i'));
		riga1.inserisciCarattere(t.dammiCarattere('?'));
		Pagina pagina = new Pagina();
		pagina.aggiungiRiga(riga1);
		pagina.stampaRighe();
		t.stampaCaratteri();
		System.out.println(t.getNumeroCaratteri());
	}

}
