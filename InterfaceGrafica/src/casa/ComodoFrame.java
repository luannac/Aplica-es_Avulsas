package casa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ComodoFrame extends JFrame {
	/***************Atrubutos****************************************/
	private Comodo comodo;
	private JRadioButton radioButton[]= new JRadioButton[5];
	private JLabel label[]= new JLabel[2];
	private JButton botao;
	
	/***************Construtor***************/
	public ComodoFrame(Comodo como,String nome){
		
		/*************Configurações Gerais************************/
			super(nome);
			setLayout(null);
			setSize(300, 200);
			setVisible(true);
			setResizable(false);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			
		/*************Label Lampada********************************/
			label[0] = new JLabel("Lampada");
			getContentPane().add(label[0]);
			label[0].setVisible(true);
			label[0].setBounds(30, 10, 80, 30);
			
		/*************RadioButton lampada Acessa*******************/
			radioButton[0] = new JRadioButton("Acessa");
			getContentPane().add(radioButton[0]);
			radioButton[0].setVisible(true);
			radioButton[0].setBounds(30, 40, 80, 30);
			
		/*************RadioButton lampada Apagada******************/
			radioButton[1] = new JRadioButton("Apagada");
			getContentPane().add(radioButton[1]);
			radioButton[1].setVisible(true);
			radioButton[1].setBounds(30, 70, 80, 30);
			
		/*************Label Porta**********************************/
			label[1] = new JLabel("Porta");
			getContentPane().add(label[1]);
			label[1].setVisible(true);
			label[1].setBounds(150, 10, 80, 30);
			
		/*************RadioButton porta Aberta*********************/
			radioButton[2] = new JRadioButton("Aberta");
			getContentPane().add(radioButton[2]);
			radioButton[2].setVisible(true);
			radioButton[2].setBounds(150, 40, 80, 30);
			
		/*************RadioButton porta Fechada********************/
			radioButton[3] = new JRadioButton("Fechada");
			getContentPane().add(radioButton[3]);
			radioButton[3].setVisible(true);
			radioButton[3].setBounds(150, 70, 80, 30);
			
		/*************RadioButton porta Trancada*******************/
			radioButton[4] = new JRadioButton("Trancada");
			getContentPane().add(radioButton[4]);
			radioButton[4].setVisible(true);
			radioButton[4].setBounds(150, 100, 80, 30);
			
		/*************Botao****************************************/
			botao = new JButton("Ok");
			getContentPane().add(botao);
			botao.setVisible(true);
			botao.setBounds(40, 110, 50, 30);
			
			botao.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					setVisible(false);
				}
			});
		
	}
}
