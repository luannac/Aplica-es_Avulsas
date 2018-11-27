package exrcicioAprendizagemString1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame{
	
	JLabel resposta= new JLabel();
	JTextField preco= new JTextField();
	JTextField desconto = new JTextField();
	JButton botao = new JButton("Ver Resultado");
	
	Janela(){
		super("Desconto");
		Container window = getContentPane();
		
		setLayout(null);
		
		window.add(resposta);
		window.add(preco);
		window.add(desconto);
		window.add(botao);
		
		preco.setBounds(10, 10, 80, 30);
		preco.setToolTipText("Preço");
		desconto.setBounds(10, 50, 80, 30);
		desconto.setToolTipText("Desconto");
		resposta.setBounds(130,20,80,30);
		botao.setBounds(60, 90, 130, 30);
		
		ActionListener evento= new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				double precov=Double.parseDouble(preco.getText()),descontov=Double.parseDouble(desconto.getText());
				double valor= precov-(precov*(descontov/100));
				DecimalFormat df =new DecimalFormat();
				df.applyPattern("####.##");
				resposta.setText("Valor = "+df.format(valor));
			}
		};
		botao.addActionListener(evento);
		
		setSize(300, 200);
		setVisible(true);
	}
}