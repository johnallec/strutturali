package com.johnny.strutturali.ServerOggetti_PR.proxy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Proxy {
	
	public List<ImmagineProxy> listaImmaginiProxy;
	
	public Proxy() {
		this.listaImmaginiProxy = new ArrayList<ImmagineProxy>();
	}
	
	public void aggiungiImmagine(File file) {
		for(ImmagineProxy imgp : listaImmaginiProxy)
			if(imgp.getFile().getAbsolutePath().compareTo(file.getAbsolutePath())==0)
				return;
		ImmagineProxy tmp = new ImmagineProxy("", file);
		tmp.costruisci();
		listaImmaginiProxy.add(tmp);
	}

}
