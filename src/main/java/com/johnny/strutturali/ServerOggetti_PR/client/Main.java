package com.johnny.strutturali.ServerOggetti_PR.client;

import com.johnny.strutturali.ServerOggetti_PR.proxy.OggettoProxy;
import com.johnny.strutturali.ServerOggetti_PR.proxy.Testo;

public class Main {

	public static void main(String[] args) {
		OggettoProxy o = new OggettoProxy();
		Testo t1 = o.costruisciTesto("testo1", "Questo è il testo numero 1");
		Testo t2 = o.costruisciTesto("testo2", "Questo è il testo numero 2");
		Testo t3 = o.costruisciTesto("testo3", "Questo è il testo numero 3");
		Testo t4 = o.costruisciTesto("testo1", "Questo è il testo numero 4");
		System.out.println(t1.getTesto());
		System.out.println(t2.getTesto());
		System.out.println(t3.getTesto());
		System.out.println(t4.getTesto());
	}
}
