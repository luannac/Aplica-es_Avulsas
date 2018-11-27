package CarroEstaquio1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EstaquioFrame extends JFrame {
	Carro car=new Carro();
	
	//Atributos botões
	JButton b_Ligar=new JButton("Ligar");
	JButton b_Desligar=new JButton("Desligar");
	JButton b_Acelerar=new JButton("Acelerar");
	JButton b_Desacelerar=new JButton("Descelerar");
	
	//Status JLabels que mostram dados
	JLabel s_Velocidade= new JLabel("0 kms//h");
	JLabel s_Ligado= new JLabel(new ImageIcon("src/DesafioCarroEstaquio/imagens/off.jpg"));
	JLabel s_Placa= new JLabel(car.getPlaca());
	JLabel s_Cor= new JLabel(car.getCor());
	JLabel s_Ano= new JLabel(String.valueOf(car.getAno()));
	
	JLabel imagem=new JLabel(new ImageIcon("src/DesafioCarroEstaquio/imagens/visao.jpg"));
	
	public EstaquioFrame(){
		
		super("Car");
		
		Container windows = getContentPane();
		
		//frame - JLabels que auxiliam visualmente
		JLabel f_Velocidade= new JLabel("Velocidade:");
		JLabel f_Placa= new JLabel("Placa:");
		JLabel f_Cor= new JLabel("Cor:");
		JLabel f_Ano= new JLabel("Ano:");
		
		//Adicionado componentes para a frame windows
		windows.add(b_Acelerar);
		windows.add(b_Desacelerar);
		windows.add(b_Ligar);
		windows.add(b_Desligar);
		
		windows.add(s_Ano);
		windows.add(s_Cor);
		windows.add(s_Placa);
		windows.add(s_Velocidade);
		windows.add(s_Ligado);
		
		windows.add(f_Velocidade);
		windows.add(f_Placa);
		windows.add(f_Cor);
		windows.add(f_Ano);
		
		windows.add(imagem);
		
		//Define tamanho e localização dos componentes no Frame
		f_Velocidade.setBounds(10, 30, 100, 100);
		s_Velocidade.setBounds(10, 45, 100, 100);
		s_Ligado.setBounds(10, 90, 100, 100);
		
		imagem.setBounds(120, 30, 100, 300);
		
		f_Placa.setBounds(500, 30, 100, 100);
		s_Placa.setBounds(500, 40, 100, 100);
		f_Ano.setBounds(500, 60, 100, 100);
		s_Ano.setBounds(500, 70, 100, 100);
		f_Cor.setBounds(500, 80, 100, 100);
		s_Cor.setBounds(500, 90, 100, 100);
		
		b_Acelerar.setBounds(120, 350, 80, 20);
		b_Ligar.setBounds(210, 350, 80, 20);
		b_Desacelerar.setBounds(300, 350, 80, 20);
		b_Desligar.setBounds(390, 350, 80, 20);
		
		//Cria Objetos de ação 
		AcaoBotaoAcelerar ac= new AcaoBotaoAcelerar();
		AcaoBotaoDesacelerar dc= new AcaoBotaoDesacelerar();
		AcaoBotaoLigar ll= new AcaoBotaoLigar();
		AcaoBotaoDeligar dl= new AcaoBotaoDeligar();
		
		//Atribui objetos ao botoes
		b_Acelerar.addActionListener(ac);
		b_Desacelerar.addActionListener(dc);
		b_Ligar.addActionListener(ll);
		b_Desligar.addActionListener(dl);
		
		setSize(600, 450);
		setVisible(true);
		setResizable(false);
	}
	
	
	//Classes de ação dos Botoes
	private class AcaoBotaoLigar implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			if(car.ligar()){
				s_Ligado.setIcon(new ImageIcon("src/DesafioCarroEstaquio/imagens/on.jpg"));
			}
		}
	}
	private class AcaoBotaoDeligar implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			if(car.Desligar()){
				s_Ligado.setIcon(new ImageIcon("src/DesafioCarroEstaquio/imagens/off.jpg"));
			}
		}
	}
	private class AcaoBotaoAcelerar implements ActionListener{
		public void actionPerformed(ActionEvent ae){
				car.acelerar((short)10);
				s_Velocidade.setText(car.getVelocidade()+"kms//h");
		}
	}
	private class AcaoBotaoDesacelerar implements ActionListener{
		public void actionPerformed(ActionEvent ae){
				car.desacelerar((short)10);
				s_Velocidade.setText(car.getVelocidade()+"kms//h");
		}
	}
}
