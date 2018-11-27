package InterfaceGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class GuiLabel extends JPanel{
	private JLabel label1, label2, label3, label4;
	private ImageIcon image1;
	
	public GuiLabel(){
		inicializarComponentes();
	}
	
	private void inicializarComponentes() {
		setLayout(new GridLayout(4, 1));
		image1 = new ImageIcon(getClass().getResource("/imagens/java.png"));
		setBackground(new Color (100,220, 100));
		label1 = new JLabel("  Aprendendo",JLabel.LEFT);
		label1.setForeground(Color.white);
		label1.setFont(new Font ("Arial Narrow", Font.BOLD, 30));
		label2 = new JLabel(image1);
		label3 = new JLabel("Inserir   ", JLabel.RIGHT);
		label3.setForeground(Color.blue);
		label4 = new JLabel("Labels e Imagens", image1, JLabel.CENTER);
		label4.setFont(new Font("Serif", Font.BOLD, 20));
		label4.setForeground(Color.black);
		
		add(label1);
		add(label2);
		add(label3);
		add(label4);
	}

}
