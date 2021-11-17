package com.johnny.strutturali.ServerOggetti_PR.client;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.awt.*;

public class Main {

	public static void main(String[] args) throws IOException {
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(700,200);
		JPanel panel = new JPanel(new BorderLayout());
		frame.add(panel);
		
		File file = scegliImmagine(panel);
		
		JLabel label = new JLabel();
		JPanel panel2 = new JPanel();
		
		panel.add(label, BorderLayout.CENTER);
		panel.add(panel2, BorderLayout.PAGE_END);
		
		JButton ahead = new JButton("Ahead");
		JButton back = new JButton("Back");
		creaGrafica(label, panel2, ahead, back);
		
	}

	private static File scegliImmagine(JPanel panel) {
		JFileChooser jfc = new JFileChooser();
		jfc.setAcceptAllFileFilterUsed(false);
		jfc.addChoosableFileFilter(new FileNameExtensionFilter("Images","jpg","jpeg","png"));
		int res = jfc.showOpenDialog(panel);
		if(res == JFileChooser.APPROVE_OPTION){
			File file = jfc.getSelectedFile();
			return file;
		}
		return null;
	}
	
	public static void creaGrafica(JLabel label, JPanel panel, JButton ahead, JButton back) {
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(new Dimension(100,100));
		label.setVisible(true);
		panel.setLayout(new BorderLayout());
		ahead.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		ahead.setMargin(new Insets(10, 10, 10, 10));
		back.setMargin(new Insets(10, 10, 10, 10));
		panel.add(ahead, BorderLayout.CENTER);
		panel.add(back, BorderLayout.PAGE_END);
	}
}
