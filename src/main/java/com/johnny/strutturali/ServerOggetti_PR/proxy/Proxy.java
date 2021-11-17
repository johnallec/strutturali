package com.johnny.strutturali.ServerOggetti_PR.proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy {
	
	private List<ImmagineProxy> listaImmaginiProxy;
	
	public Proxy() {
		this.listaImmaginiProxy = new ArrayList<ImmagineProxy>();
	}
	
	public void aggiungiImmagine(String path) {
		for(ImmagineProxy imgp : listaImmaginiProxy)
			if(imgp.getPath().compareTo(path)==0)
				return;
		ImmagineProxy tmp = new ImmagineProxy("", path);
		tmp.costruisci();
		listaImmaginiProxy.add(tmp);
	}

}
