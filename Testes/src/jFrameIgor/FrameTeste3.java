package jFrameIgor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

	public class FrameTeste3 extends JFrame {
		JLabel label,label2;
		JTextField barraTexto;
		JButton botao;
		
		public FrameTeste3(){
			super("Alo Mundo");
			
			//Configurações gerais 
				setVisible(true);
				setSize(400, 200);
				setLayout(null);
				setResizable(false);
				
			///Configuração JLabel
				label = new JLabel(); 
				getContentPane().add(label);
				label.setVisible(true);
				label.setBounds(10, 10, 100, 30);
				label.setText("Digite seu nome:");
			
				
			//Configuração JTextField
				barraTexto = new JTextField();
				getContentPane().add(barraTexto);
				barraTexto.setVisible(true);
				barraTexto.setBounds(110, 10, 80, 30);
				
			//Configuração Botao
				botao = new JButton();
				getContentPane().add(botao);
				botao.setVisible(true);
				botao.setText("oi");
				botao.setBounds(200, 10, 60, 30);
				botao.setBackground(Color.CYAN);
				
				botao.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						label2.setText("Olá "+barraTexto.getText());
					}
				});
				
			//Configuração label2
				label2 = new JLabel();
				getContentPane().add(label2);
				label2.setVisible(true);
				label2.setBounds(40, 60, 100, 30);
		}
	
		public static void main(String[] args) {
			new FrameTeste3();
		}
}
