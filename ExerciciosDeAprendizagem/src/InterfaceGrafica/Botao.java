package InterfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.*;

import javax.swing.*;

public class Botao extends JPanel{
	private JButton btMensagem,btTeimoso;
	private ImageIcon imageIcon1;
	
	public Botao(){
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes(){
		setLayout (null);
		imageIcon1 = new ImageIcon(getClass().getResource("/imagens/foto2.jpg"));
		btMensagem = new JButton("ola", imageIcon1);
		btMensagem.setBounds(50, 20, 100, 30);
		btMensagem.setMnemonic(KeyEvent.VK_M);
		btMensagem.setToolTipText("Clique aqui");
		btTeimoso = new JButton("Teimoso");
		btTeimoso.setBounds(50, 70, 100, 25);
		add(btMensagem);
		add(btTeimoso);
	}
	/********Método que define os eventos ex.: acionar botões ******/
	private void definirEventos() {
		btMensagem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
		    JOptionPane.showMessageDialog(null, "Botao Mensagem");
			}
		});
		
	btTeimoso.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(null, "Botão teimoso");
		}
	});
	
	btTeimoso.addMouseListener(new MouseListener(){
		public void mouseClicked(MouseEvent e){ }//este método só é utilizado qd  o botão do mouse é pressionado sobre um componente
		public void mousePressed(MouseEvent e){ }// este método só é utilizado qd  o botão do mouse é solto sobre um componente
		public void mouseReleased(MouseEvent e){ }// este método só é utilizado qd o mouse é solto sobre um componente
		public void mouseEntered(MouseEvent e){ // este método só é utilizado qd o ponteiro do mouse entra na área de um componente
		btTeimoso.setBounds(50, 120, 100, 25);
	}
		public void mouseExited(MouseEvent e){// este método só é utilizado qd o ponteiro do mouse sai na área de um componente
			btTeimoso.setBounds(50, 70, 100, 25);
		}
	});
	}

}
