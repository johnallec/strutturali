package com.johnny.strutturali.ServerOggetti_PR.proxy;

import java.awt.Dimension;

import javax.swing.JLabel;

import com.johnny.strutturali.ServerOggetti_PR.Oggetto;

public class Testo extends Oggetto {
	private String testo;
	private JLabel labelTesto;
	
	public Testo() {
		super();
		this.testo = "TESTO STANDARD";
		labelTesto = new JLabel();
		labelTesto.setPreferredSize(new Dimension(100, 100));
	}

	public Testo(String nome, String testo) {
		super(nome);
		this.testo = testo;
		labelTesto = new JLabel();
		labelTesto.setPreferredSize(new Dimension(100, 100));
	}

	@Override
	public void costruisci() {
		labelTesto.setText(this.testo);
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public JLabel getLabelTesto() {
		return labelTesto;
	}
}
