package com.johnny.strutturali.DisegnaForme_AD.client;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics2D;
import com.johnny.strutturali.DisegnaForme_AD.Figura;
import com.johnny.strutturali.DisegnaForme_AD.Cerchio;
import com.johnny.strutturali.DisegnaForme_AD.Quadrato;

public class Tavola extends JPanel {
	private static final long serialVersionUID = 4500239286030222195L;
	
	private Figura figura;
	private int x;
	private int y;
	
	public void disegna(Figura figura, int x, int y) {
		this.figura = figura;
		this.x = x;
		this.y = y;
		this.repaint();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g = (Graphics2D) g;
		g.setColor(Color.BLACK);
		if(this.figura instanceof Quadrato) {
			this.figura = (Quadrato) this.figura;
			g.drawRect(this.x, this.y, (int)this.figura.getArea(), (int)this.figura.getArea());
		}
		else if(this.figura instanceof Cerchio) {
			this.figura = (Cerchio) this.figura;
			g.drawOval(this.x, this.y, (int)this.figura.getArea(), (int)this.figura.getArea());
		}
	}
	
}
