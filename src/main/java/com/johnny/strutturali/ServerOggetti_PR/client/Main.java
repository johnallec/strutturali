package com.johnny.strutturali.ServerOggetti_PR.client;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.johnny.strutturali.ServerOggetti_PR.proxy.Proxy;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.awt.*;

public class Main {

	private static JLabel label;
	private static JPanel panel;
	private static JPanel panel2;
	private static Proxy proxy;
	private static int index = 0;
	
	public static void main(String[] args) throws IOException {
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(700,200);
		panel = new JPanel(new BorderLayout());
		frame.add(panel);
		
		label = new JLabel();
		panel2 = new JPanel();
		
		panel.add(label, BorderLayout.CENTER);
		panel.add(panel2, BorderLayout.PAGE_END);
		
		JButton ahead = new JButton("Ahead");
		JButton back = new JButton("Back");
		JButton add = new JButton("Add");
		creaGrafica(ahead, back, add);
		
		proxy = new Proxy();
		ahead.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!proxy.listaImmaginiProxy.isEmpty()) {
					System.out.println(index);
					if(index < proxy.listaImmaginiProxy.size()-1)
						index++;
					else index = 0;
					label.setIcon(proxy.listaImmaginiProxy.get(index).getImmagine().getLabelImage().getIcon());
				}
			}
		});
		
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!proxy.listaImmaginiProxy.isEmpty()) {
					System.out.println(index);
					if(index > 0)
						index--;
					else index = proxy.listaImmaginiProxy.size()-1;
					label.setIcon(proxy.listaImmaginiProxy.get(index).getImmagine().getLabelImage().getIcon());
				}
			}
		});
		
		add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				File file = scegliImmagine();
				if(file!=null)
					proxy.aggiungiImmagine(file);
				if(proxy.listaImmaginiProxy.size()==1)
					label.setIcon(proxy.listaImmaginiProxy.get(0).getImmagine().getLabelImage().getIcon());
			}
		});
		
	}

	private static File scegliImmagine() {
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
	
	public static void creaGrafica(JButton ahead, JButton back, JButton add) {
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(new Dimension(100,100));
		label.setVisible(true);
		panel2.setLayout(new BorderLayout());
		ahead.setMargin(new Insets(10, 10, 10, 10));
		back.setMargin(new Insets(10, 10, 10, 10));
		add.setMargin(new Insets(10, 10, 10, 10));
		panel2.add(ahead, BorderLayout.CENTER);
		panel2.add(back, BorderLayout.PAGE_END);
		panel2.add(add, BorderLayout.LINE_END);
	}
}
