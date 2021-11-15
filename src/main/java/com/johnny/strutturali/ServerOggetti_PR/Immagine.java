package com.johnny.strutturali.ServerOggetti_PR;

import java.awt.Dimension;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;
import java.io.IOException;

public class Immagine extends Oggetto {

	private String path;
	private JLabel labelImage; 
	
	public Immagine() {
		super();
		labelImage = new JLabel();
		labelImage.setPreferredSize(new Dimension(100, 100));
	}
	
	public Immagine(String nome, String path) {
		super(nome);
		this.path = path;
		labelImage = new JLabel();
		labelImage.setPreferredSize(new Dimension(100, 100));
	}

	@Override
	public void costruisci() {
		try {
			Image img = ImageIO.read(getClass().getClassLoader().getResourceAsStream(this.path)).getScaledInstance(labelImage.getWidth(), labelImage.getHeight(), Image.SCALE_SMOOTH);
			labelImage.setIcon(new ImageIcon(img));
			labelImage.setVisible(true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public JLabel getLabelImage() {
		return labelImage;
	}
}
