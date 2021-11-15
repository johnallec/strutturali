package com.johnny.strutturali.OggettiGrafici_CO;

import java.util.ArrayList;
import java.util.List;

public class Quadro extends OggettoGrafico {
	
	protected List<OggettoGrafico> listaOggetti;
	
	public Quadro() {
		listaOggetti = new ArrayList<OggettoGrafico>();
	}
	
	@Override
	public void disegna(MyPanel panel) {
		for(OggettoGrafico o : this.listaOggetti)
			o.disegna(panel);
	}

	@Override
	public void add(OggettoGrafico oggetto) {
		this.listaOggetti.add(oggetto);
	}
}
