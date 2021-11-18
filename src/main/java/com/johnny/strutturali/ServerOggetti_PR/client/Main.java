package com.johnny.strutturali.ServerOggetti_PR.client;

import javax.swing.*;

public class Main {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(700,200);
		InterfacciaGrafica interfaccia = new InterfacciaGrafica(frame);
		interfaccia.start();
	}
}
