package DesafioIMC;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Janela extends JFrame {
	JTextField Q_ALTURA;
	JTextField Q_PESO;
	JLabel RESPOSTA[]=new JLabel[4];

public Janela() {
		
		super("IMC");
		
		Container JANELA = getContentPane();
		
		
		RESPOSTA[3]= new JLabel(new ImageIcon("src//DesafioIMC//imc_logo.png"));
		
		JLabel T_ALTURA = new JLabel("Altura: ");
		Q_ALTURA = new JTextField();
		
		JLabel T_PESO = new JLabel("Peso: ");
		Q_PESO = new JTextField();
		
		
		
		JButton BOTAO = new JButton("OK");
		
		RESPOSTA[0] = new JLabel();
		RESPOSTA[1]= new JLabel();
		RESPOSTA[2]=new JLabel();
		
		setLayout(null);
		
		JANELA.add(T_ALTURA);
		JANELA.add(Q_ALTURA);
		
		JANELA.add(T_PESO);
		JANELA.add(Q_PESO);
		
		JANELA.add(BOTAO);
		
		JANELA.add(RESPOSTA[0]);
		JANELA.add(RESPOSTA[1]);
		JANELA.add(RESPOSTA[2]);
		
		JANELA.add(RESPOSTA[3]);
		
		T_ALTURA.setBounds(20,20,100,20);
		Q_ALTURA.setBounds(20,40,100,20);
		
		T_PESO.setBounds(20,70,100,20);
		Q_PESO.setBounds(20,100,100,20);
		
		BOTAO.setBounds(60,170,60,20);
		
		RESPOSTA[0].setBounds(140,20,170,100);
		RESPOSTA[1].setBounds(140,50,170,100);
		RESPOSTA[2].setBounds(140,80,170,100);
		
		RESPOSTA[3].setBounds(300,00,300,300);
		
		AcionaBotao EVENTO = new AcionaBotao();
		BOTAO.addActionListener(EVENTO);
		
		setSize(580,330);
		setVisible(true);
		setResizable(false);
		
		
	}
	
	private class AcionaBotao implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			String r_altura = Q_ALTURA.getText();
			String r_peso = Q_PESO.getText();
			
			Double peso = Double.valueOf(r_peso);
			Double altura = Double.valueOf(r_altura);
			
			Double imc;
			
			imc = peso / Math.pow(altura,2);

			DecimalFormat df= new DecimalFormat();
			df.applyPattern("##.##");
			
			if(imc<18.5) {
				RESPOSTA[0].setText(df.format(peso)+"Kg Magreza Grave.");
				RESPOSTA[1].setText("Altura: "+df.format(altura));
				RESPOSTA[2].setText("IMC: "+df.format(imc));
				RESPOSTA[3].setIcon(new ImageIcon("src/DesafioIMC/imc2.jpg"));
			}

			if(imc>=18.5 & imc<24.4) {
				RESPOSTA[0].setText(df.format(peso)+"Kg Saudavel");
				RESPOSTA[1].setText("Altura: "+df.format(altura));
				RESPOSTA[2].setText("IMC: "+df.format(imc));
				RESPOSTA[3].setIcon(new ImageIcon("src/DesafioIMC/imc3.jpg"));
			}
			if(imc>=24.5 & imc<30) {
				RESPOSTA[0].setText(df.format(peso)+"Kg Sobrepeso.");
				RESPOSTA[1].setText("Altura: "+df.format(altura));
				RESPOSTA[2].setText("IMC: "+df.format(imc));
				RESPOSTA[3].setIcon(new ImageIcon("src/DesafioIMC/imc4.jpg"));
			}
			if(imc>=30 & imc<35) {
				RESPOSTA[0].setText(df.format(peso)+"Kg Obesidade Grau 1 .");
				RESPOSTA[1].setText("Altura: "+df.format(altura));
				RESPOSTA[2].setText("IMC: "+df.format(imc));
				RESPOSTA[3].setIcon(new ImageIcon("src/DesafioIMC/imc5.jpg"));
			}
			if(imc>=35 & imc<40) {
				RESPOSTA[0].setText(df.format(peso)+"Kg Obesidade Grau 2.");
				RESPOSTA[1].setText("Altura: "+df.format(altura));
				RESPOSTA[2].setText("IMC: "+df.format(imc));
				RESPOSTA[3].setIcon(new ImageIcon("src/DesafioIMC/imc6.jpg"));
			}
			if(imc>=40) {
				RESPOSTA[0].setText(df.format(peso)+"Kg Obesidade Grau 3.");
				RESPOSTA[1].setText("Altura: "+df.format(altura));
				RESPOSTA[2].setText("IMC: "+df.format(imc));
				RESPOSTA[3].setIcon(new ImageIcon("src/DesafioIMC/imc7.jpg"));
			}
			
		}
}
}

	