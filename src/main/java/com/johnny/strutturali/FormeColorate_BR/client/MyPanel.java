package com.johnny.strutturali.FormeColorate_BR.client;

import java.awt.Graphics;

import javax.swing.JPanel;

import com.johnny.strutturali.FormeColorate_BR.Cerchio;
import com.johnny.strutturali.FormeColorate_BR.Figura;
import com.johnny.strutturali.FormeColorate_BR.Quadrato;
import java.awt.Color;

public class MyPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private Figura figura;
	
	public void disegna(Figura figura) {
		this.figura = figura;
		this.repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.GRAY);
		g.setColor(this.figura.getColor());
		if(this.figura instanceof Quadrato) {
			g.fillRect(100,100,50,50);
		}
		else if(this.figura instanceof Cerchio) {
			g.fillOval(100,100,50,50);
		}
	}
}
