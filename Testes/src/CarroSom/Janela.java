package CarroSom;

import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class Janela extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Declaração Componetes da JFrame
	JButton botoes[]= new JButton[3];
	JLabel f_labels[]=new JLabel[4];
	JLabel s_labels[]=new JLabel[4];
	JLabel imagens[]=new JLabel[2];
	Carro car = new Carro("Abacate", "UDF-1112", (short)1976);
	
	//Construtor
	public Janela(){
		super("Carro Eustaquio");
		Container window = getContentPane();
		
		//Crição dos Componentes e Atribuição a window
		botoes[0]=new JButton();
		botoes[1]=new JButton();
		botoes[2]=new JButton();
		
		f_labels[0]=new JLabel();
		f_labels[1]=new JLabel();
		f_labels[2]=new JLabel();
		f_labels[3]=new JLabel();
		
		s_labels[0]=new JLabel();
		s_labels[1]=new JLabel();
		s_labels[2]=new JLabel();
		s_labels[3]=new JLabel();
		
		imagens[0]=new JLabel();
		imagens[1]=new JLabel();
		
		window.add(botoes[0]);
		window.add(botoes[1]);
		window.add(botoes[2]);
		
		window.add(f_labels[0]);
		window.add(f_labels[1]);
		window.add(f_labels[2]);
		window.add(f_labels[3]);
		
		window.add(s_labels[0]);
		window.add(s_labels[1]);
		window.add(s_labels[2]);
		window.add(s_labels[3]);
		
		window.add(imagens[0]);
		window.add(imagens[1]);
		
		//Definição de posição e Conteudo dos Componentes
		f_labels[0].setText("Placa:");
		f_labels[0].setBounds(10,80,60,40);
		s_labels[0].setText(car.getStrPlaca());
		s_labels[0].setBounds(10, 95, 60, 40);
		
		f_labels[1].setText("Ano:");
		f_labels[1].setBounds(10,120,60,40);
		s_labels[1].setText(String.valueOf(car.getShoAno()));
		s_labels[1].setBounds(10, 135, 60, 40);
		
		f_labels[2].setText("Cor:");
		f_labels[2].setBounds(10,160,60,40);
		s_labels[2].setText(car.getStrCor());
		s_labels[2].setBounds(10, 175, 60, 40);
		
		imagens[0].setIcon(new ImageIcon("src/CarroEustaquio/imagens/front.jpg"));
		imagens[0].setBounds(80, 10, 360, 260);
		
		f_labels[3].setText("Velocidade:");
		f_labels[3].setBounds(450, 80, 70, 60);
		s_labels[3].setText(String.valueOf(car.getBytVelocidade())+" kl\\hs");
		s_labels[3].setBounds(450, 100, 70, 60);
		
		imagens[1].setIcon(new ImageIcon("src/CarroEustaquio/imagens/velocimetro.gif"));
		imagens[1].setBounds(450, 150, 80, 80);
		
		AcaoOnOff onOff=new AcaoOnOff();
		botoes[0].addActionListener(onOff);
		botoes[0].setIcon(new ImageIcon("src\\CarroEustaquio\\imagens\\off.jpg"));
		botoes[0].setBounds(80, 280, 100, 30);
		
		AcaoAcelerar ace=new AcaoAcelerar();
		botoes[1].setText("Acelerar");
		botoes[1].addActionListener(ace);
		botoes[1].setBounds(200, 280, 100, 30);
		
		AcaoFrear frea=new AcaoFrear();
		botoes[2].setText("Frear");
		botoes[2].addActionListener(frea);
		botoes[2].setBounds(320, 280, 100, 30);
		
		setLayout(null);
		setVisible(true);
		setSize(570,380);
		
	}
	
	private class AcaoOnOff implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			if(!car.isBooLigado()) {
				car.ligar();
				botoes[0].setIcon(new ImageIcon(car.status()));
			}
			else {
				car.desligar();
				botoes[0].setIcon(new ImageIcon(car.status()));
			}
		}
	}
	private class AcaoAcelerar implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			car.acelerar((byte) 10);
			s_labels[3].setText(String.valueOf(car.getBytVelocidade())+" kl\\hs");
		}
	}
	private class AcaoFrear implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			car.frear((byte)10);
			s_labels[3].setText(String.valueOf(car.getBytVelocidade())+" kl\\hs");
		}
	}
}
