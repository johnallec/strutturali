package com.johnny.strutturali.FormeColorate_BR.client;

import javax.swing.JFrame;

import com.johnny.strutturali.FormeColorate_BR.Cerchio;
import java.awt.Color;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame();
		MyPanel panel = new MyPanel();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.add(panel);
		panel.disegna(new Cerchio(Color.WHITE));
		Thread.sleep(1000);
		panel.disegna(new Cerchio(Color.BLACK));
	}

}
