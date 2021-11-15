package com.johnny.strutturali.ServerOggetti_PR.proxy;

import java.util.ArrayList;
import java.util.List;

import com.johnny.strutturali.ServerOggetti_PR.Immagine;
import com.johnny.strutturali.ServerOggetti_PR.Oggetto;

public class OggettoProxy extends Oggetto {
	private List<Immagine> listaImmagini;
	private List<Testo> listaTesti;
	
	public OggettoProxy() {
		this.listaImmagini = new ArrayList<Immagine>();
		this.listaTesti = new ArrayList<Testo>();
	}
	
	public Immagine costruisciImmagine(String nomeImmagine, String path) {
		for(Immagine i : listaImmagini)
			if(i.getNome().compareTo(nomeImmagine)==0)
				return i;
		Immagine img = new Immagine(nomeImmagine, path);
		img.costruisci();
		immagazzina(img);
		return img;
	}
	
	public Testo costruisciTesto(String nomeTesto, String testo) {
		for(Testo t : listaTesti)
			if(t.getNome().compareTo(nomeTesto)==0)
				return t;
		Testo t = new Testo(nomeTesto, testo);
		t.costruisci();
		immagazzina(t);
		return t;
	}
	
	@Override
	protected void immagazzina(Oggetto o) {
		if(o instanceof Immagine) {
			listaImmagini.add((Immagine) o);
		}
		else if(o instanceof Testo) {
			listaTesti.add((Testo) o);
		}
	}
}
