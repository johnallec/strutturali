package com.johnny.strutturali.OggettiGrafici_CO.client;

import javax.swing.JFrame;

import com.johnny.strutturali.OggettiGrafici_CO.Linea;
import com.johnny.strutturali.OggettiGrafici_CO.MyPanel;
import com.johnny.strutturali.OggettiGrafici_CO.OggettoGrafico;
import com.johnny.strutturali.OggettiGrafici_CO.Quadro;
import com.johnny.strutturali.OggettiGrafici_CO.Rettangolo;
import com.johnny.strutturali.OggettiGrafici_CO.Testo;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		MyPanel panel = new MyPanel();
		frame.add(panel);
		OggettoGrafico quadro = new Quadro();
		quadro.add(new Testo("Testo"));
		quadro.add(new Linea(new Linea().new Punto(100,100),new Linea().new Punto(200,100)));
		quadro.add(new Rettangolo(50,50,200,200));
		OggettoGrafico quadro2 = new Quadro();
		quadro2.add(quadro);
		quadro2.add(new Linea(new Linea().new Punto(50,50),new Linea().new Punto(50,100)));
		quadro2.add(new Rettangolo(20,80,300,300));
		quadro2.disegna(panel);
		panel.repaint();
	}

}
