package com.johnny.strutturali.ServerOggetti_PR;

import java.awt.Dimension;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

public class Immagine extends Oggetto {

	protected File file;
	private JLabel labelImage; 
	
	public Immagine() {
		super();
		labelImage = new JLabel();
		labelImage.setPreferredSize(new Dimension(100, 100));
	}
	
	public Immagine(String nome, File file) {
		super(nome);
		this.file = file;
		labelImage = new JLabel();
		labelImage.setSize(new Dimension(100, 100));
	}

	@Override
	public void costruisci() {
		try {
			Image img = ImageIO.read(this.file);
			labelImage.setIcon(new ImageIcon(img));
			labelImage.setVisible(true);
		} catch (IOException e) {
			System.out.println("aaaa");
			//e.printStackTrace();
		}
	}

	public File getFile() {
		return this.file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public JLabel getLabelImage() {
		return labelImage;
	}
}
