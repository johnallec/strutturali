package com.johnny.strutturali.DisegnaForme_AD.client;

import java.awt.Dimension;
import javax.swing.JFrame;

import com.johnny.strutturali.DisegnaForme_AD.Cerchio;
import com.johnny.strutturali.DisegnaForme_AD.Disegna;
import com.johnny.strutturali.DisegnaForme_AD.Quadrato;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Tavola");
		Tavola tavola = new Tavola();
		frame.add(tavola);
		frame.setSize(new Dimension(800, 800));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Disegna d = new Disegna(tavola);
		Cerchio c = new Cerchio();
		Quadrato q = new Quadrato();
		c.setRaggio(10.0);
		q.setLato(10.0);
		d.richiesta(c);
		Thread.sleep(1000);
		d.richiesta(q);
	}

}
