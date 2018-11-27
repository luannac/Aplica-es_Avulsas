package Imc;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class IMC extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField Q_ALTURA;
	JTextField Q_PESO;
	JLabel RESPOSTA;
	public IMC() {
		
		super("IMC");
		
		Container JANELA = getContentPane();
		
		JLabel T_ALTURA = new JLabel("Altura: ");
		Q_ALTURA = new JTextField();
		
		JLabel T_PESO = new JLabel("Peso: ");
		Q_PESO = new JTextField();
		
		JButton BOTAO = new JButton("OK");
		
		RESPOSTA = new JLabel();
		
		setLayout(null);
		
		JANELA.add(T_ALTURA);
		JANELA.add(Q_ALTURA);
		
		JANELA.add(T_PESO);
		JANELA.add(Q_PESO);
		
		JANELA.add(BOTAO);
		
		JANELA.add(RESPOSTA);
		
		T_ALTURA.setBounds(20,20,100,20);
		Q_ALTURA.setBounds(20,40,100,20);
		
		T_PESO.setBounds(20,70,100,20);
		Q_PESO.setBounds(20,100,100,20);
		
		BOTAO.setBounds(60,130,80,20);
		
		RESPOSTA.setBounds(140,20,400,200);
		
		AcionaBotao EVENTO = new AcionaBotao();
		BOTAO.addActionListener(EVENTO);
		
		setSize(273,273);
		setVisible(true);
		
		
	}
	
	private class AcionaBotao implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			String r_altura = Q_ALTURA.getText();
			String r_peso = Q_PESO.getText();
			String resposta;
			
			Double peso = Double.valueOf(r_peso);
			Double altura = Double.valueOf(r_altura);
			
			Double imc;
			
			imc = peso / Math.pow(altura,2);
			resposta = Double.toString(imc);

			
			if(imc<16) {
				RESPOSTA.setText(resposta+"\n Magreza Grave - Engorde Muito.");
			}
			if(imc>=16 && imc<17) {
				RESPOSTA.setText(resposta+"\n Magreza Moderada - Engorde.");
			}
			if(imc>=17 && imc<18.5) {
				RESPOSTA.setText(resposta+"\n Magreza Leve - Engorde um pouco.");
			}
			if(imc>=18.5 && imc<25) {
				RESPOSTA.setText(resposta+"\n Saudavel - Fique assim.");
			}
			if(imc>=25 && imc<30) {
				RESPOSTA.setText(resposta+" Sobrepeso - Perda peso.");
			}
			if(imc>=30 && imc<35) {
				RESPOSTA.setText(resposta+" Obesidade Grau 1 - Perca bastante peso.");
			}
			if(imc>=35 && imc<40) {
				RESPOSTA.setText(resposta+" Obesidade Grau 2 (Severa) - Perca muito peso.");
			}
			if(imc>=40) {
				RESPOSTA.setText(resposta+" Obesidade Grau 3 (Morbida) - Perca muito peso.");
			}
			
		}

	}
        		
		public static void main (String args[]) {
			javax.swing.SwingUtilities.invokeLater(
					new Runnable () {
						public void run() {
							JFrame.setDefaultLookAndFeelDecorated(true);
							
							IMC PROGRAMA = new IMC();
							PROGRAMA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						}
					}
					);
		}
}