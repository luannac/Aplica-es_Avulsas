package casa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FramePrincipal extends JFrame{
	/**********************Atributos***************************/
		private Comodo comodos[]= new Comodo[4];
		private JButton botoes[]= new JButton[5];
		
	/**********************Configurações principais***************************/
		public FramePrincipal(){
			super("Casa");
			setVisible(true);
			setSize(300, 200);
			setResizable(false);
			setLayout(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/**********************Criação dos Comodos***************************/
				comodos[0] = new Comodo();
				comodos[1] = new Comodo();
				comodos[2] = new Comodo();
				comodos[3] = new Comodo();
			
			
		/*Configuraçõa do Botao 0 Quarto 1***************************/
			 botoes[0] = new JButton("Quarto 1");
			 add(botoes[0]);
			 botoes[0].setBounds(20, 10, 100, 30);
			 botoes[0].setVisible(true);
			 
			 botoes[0].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					new ComodoFrame(comodos[0], "Quarto 1");
				}
			});
			 
		 /*Configuraçõa do Botao 1 Quarto 2***************************/
			 botoes[1] = new JButton("Quarto 2");
			 add(botoes[1]);
			 botoes[1].setBounds(150, 10, 100, 30);
			 botoes[1].setVisible(true);
			 
			 botoes[1].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						new ComodoFrame(comodos[1], "Quarto 2");
					}
				});
			 
		 /*Configuraçõa do Botao 2 Banheiro 1 **************************/
			 botoes[2] = new JButton("Banheiro 1");
			 add(botoes[2]);
			 botoes[2].setBounds(20, 60, 100, 30);
			 botoes[2].setVisible(true);
			 
			 botoes[2].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						new ComodoFrame(comodos[2], "Banheiro 1");
					}
				});
			 
		 /*Configuraçõa do Botao 3 Banheiro 2***************************/
			 botoes[3] = new JButton("Banheiro 2");
			 add(botoes[3]);
			 botoes[3].setBounds(150, 60, 100, 30);
			 botoes[3].setVisible(true);
			 
			 botoes[3].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						new ComodoFrame(comodos[3], "Banheiro 2");
					}
				});
			 
		 /*Configuraçõa do Botao 4 Mostrar Estatus ***************************/
			 botoes[4] = new JButton("Mostrar Status");
			 add(botoes[4]);
			 botoes[4].setBounds(70, 100, 120, 30);
			 botoes[4].setVisible(true);
		}
	/**********************Metodos***************************/
		
	/**********************Metodo Main***************************/
	public static void main(String[] args) {
		new FramePrincipal();
		
	}
}
