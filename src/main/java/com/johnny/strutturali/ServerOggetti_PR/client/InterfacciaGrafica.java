package com.johnny.strutturali.ServerOggetti_PR.client;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.johnny.strutturali.ServerOggetti_PR.proxy.Proxy;

public class InterfacciaGrafica {
	
	private JFrame frame;
	private JLabel label;
	private JPanel panel;
	private JPanel panel2;
	private Proxy proxy;
	private int index;
	private JButton ahead;
	private JButton back;
	private JButton add;
	
	public InterfacciaGrafica(JFrame frame) {
		this.frame=frame;
		this.index = -1;
	}
	
	public void start() {
		proxy = new Proxy();
		creaGrafica();
	}
	
	private File[] scegliImmagine() {
		JFileChooser jfc = new JFileChooser();
		jfc.setCurrentDirectory(new File("C:\\Users\\cj198\\OneDrive\\Desktop\\imgs"));
		jfc.setAcceptAllFileFilterUsed(false);
		jfc.addChoosableFileFilter(new FileNameExtensionFilter("Images","jpg","jpeg","png"));
		jfc.setMultiSelectionEnabled(true);
		int res = jfc.showOpenDialog(panel);
		if(res == JFileChooser.APPROVE_OPTION){
			File[] files = jfc.getSelectedFiles();
			return files;
		}
		return null;
	}

	private void creaBottoni() {
		
		ahead = new JButton("Ahead");
		back = new JButton("Back");
		add = new JButton("Add");
		
		ahead.setMargin(new Insets(10, 10, 10, 10));
		back.setMargin(new Insets(10, 10, 10, 10));
		add.setMargin(new Insets(10, 10, 10, 10));
		
		ahead.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!proxy.listaImmaginiProxy.isEmpty()) {
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
				label.setIcon(null);
				label.setText("Loading");
				File[] files = scegliImmagine();
				if(files!=null) {
					System.out.println(label.getText());
					for(int i=0; i<files.length; ++i)
						if(files[i]!=null) 
							proxy.aggiungiImmagine(files[i]);
					index++;
					if(proxy.listaImmaginiProxy.size()>0) {
								label.setIcon(proxy.listaImmaginiProxy.get(index).getImmagine().getLabelImage().getIcon());
					}
				}
				label.setText("");
				if(files == null && proxy.listaImmaginiProxy.size()>0)
					label.setIcon(proxy.listaImmaginiProxy.get(index).getImmagine().getLabelImage().getIcon());
			}
		});
	}
	
	public void creaGrafica() {
		panel = new JPanel(new BorderLayout());
		frame.add(panel);
		
		label = new JLabel();
		panel2 = new JPanel();
		
		panel.add(label, BorderLayout.CENTER);
		panel.add(panel2, BorderLayout.PAGE_END);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(new Dimension(100,100));
		label.setVisible(true);
		panel2.setLayout(new BorderLayout());
		
		creaBottoni();
		
		panel2.add(ahead, BorderLayout.CENTER);
		panel2.add(back, BorderLayout.PAGE_END);
		panel2.add(add, BorderLayout.LINE_END);
	}


}
