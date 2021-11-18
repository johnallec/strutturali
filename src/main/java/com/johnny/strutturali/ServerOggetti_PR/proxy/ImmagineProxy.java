package com.johnny.strutturali.ServerOggetti_PR.proxy;

import java.io.File;

import com.johnny.strutturali.ServerOggetti_PR.Immagine;

public class ImmagineProxy extends Immagine{
	private Immagine img;
	
	public ImmagineProxy() {
		super();
		this.img = null;
	}
	
	public ImmagineProxy(String nome, File file) {
		super(nome, file);
	}

	@Override
	public void costruisci() {
		if(img == null) {
			this.img = new Immagine(this.nome, this.file);
			this.img.costruisci();
			System.out.println(this.file.getAbsolutePath() + " ---> Aggiunta");
		}
	}
	
	public Immagine getImmagine() {
		return this.img;
	}
}
