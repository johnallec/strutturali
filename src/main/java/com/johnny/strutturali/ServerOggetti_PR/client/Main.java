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
		frame.setSize(800,800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(new BorderLayout());
		frame.add(panel);
		JFileChooser jfc = new JFileChooser();
		jfc.setAcceptAllFileFilterUsed(false);
		jfc.addChoosableFileFilter(new FileNameExtensionFilter("Images","jpg","jpeg","png"));
		int res = jfc.showOpenDialog(panel);
		if(res == JFileChooser.APPROVE_OPTION){
			File file = jfc.getSelectedFile();
			JLabel label = new JLabel();
			label.setHorizontalAlignment(JLabel.CENTER);
			label.setSize(new Dimension(100,100));
			label.setVisible(true);
			Image img = ImageIO.read(file);
			img = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
			label.setIcon(new ImageIcon(img));
			panel.add(label, BorderLayout.CENTER);
			JPanel panel2 = new JPanel();
			BoxLayout bl = new BoxLayout(panel2, BoxLayout.LINE_AXIS);
			panel2.setLayout(bl);
			panel.add(panel2, BorderLayout.PAGE_END);
			panel2.setAlignmentX(Component.CENTER_ALIGNMENT);
			JButton ahead = new JButton("Ahead");
			ahead.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {

				}
			});
			JButton back = new JButton("Back");
			back.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
				}
			});
			ahead.setHorizontalAlignment(JButton.CENTER);
			back.setHorizontalAlignment(JButton.CENTER);
			ahead.setMargin(new Insets(10, 10, 10, 10));
			back.setMargin(new Insets(10, 10, 10, 10));
			panel2.add(ahead);
			panel2.add(back);
		}
		
	}
}
