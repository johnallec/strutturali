package com.johnny.strutturali.OggettiGrafici_CO;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;

public class MyPanel extends JPanel{
	
	private static final long serialVersionUID = -7937479432326022902L;
	
	private Testo testo;
	private List<Linea> listaLinee;
	private List<Rettangolo> listaRettangoli;
	
	public MyPanel() {
		this.listaLinee = new ArrayList<Linea>();
		this.listaRettangoli = new ArrayList<Rettangolo>();
	}
	
	public void disegnaTesto(Testo testo) {
		this.testo = testo;
	}
	
	public void disegnaLinea(Linea linea) {
		this.listaLinee.add(linea); 
	}
	
	public void disegnaRettangolo(Rettangolo rettangolo) {
		this.listaRettangoli.add(rettangolo);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);		
		g.setColor(Color.RED);
		if(this.testo != null) {
			g.drawString(this.testo.getTesto(),50,50);
		}
		if(!this.listaLinee.isEmpty()) {
			for(Linea linea : this.listaLinee)
				g.drawLine(linea.getPunto1().getX(), linea.getPunto1().getY(), linea.getPunto2().getX(), linea.getPunto2().getY());
		}
		if(!this.listaRettangoli.isEmpty()) {
			for(Rettangolo rettangolo : this.listaRettangoli)
				g.fillRect(rettangolo.getX(), rettangolo.getY(), rettangolo.getLunghezza(), rettangolo.getAltezza());
		}
	}
}
