package com.johnny.strutturali.ServerOggetti_PR.proxy;

import com.johnny.strutturali.ServerOggetti_PR.Immagine;

public class ImmagineProxy extends Immagine{
	private Immagine img;
	
	public ImmagineProxy() {
		super();
		this.img = null;
	}
	
	public ImmagineProxy(String nome, String path) {
		super(nome, path);
	}

	@Override
	public void costruisci() {
		if(img == null)
			this.img = new Immagine();
	}
}
