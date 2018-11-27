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
	/********M�todo que define os eventos ex.: acionar bot�es ******/
	private void definirEventos() {
		btMensagem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
		    JOptionPane.showMessageDialog(null, "Botao Mensagem");
			}
		});
		
	btTeimoso.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(null, "Bot�o teimoso");
		}
	});
	
	btTeimoso.addMouseListener(new MouseListener(){
		public void mouseClicked(MouseEvent e){ }//este m�todo s� � utilizado qd  o bot�o do mouse � pressionado sobre um componente
		public void mousePressed(MouseEvent e){ }// este m�todo s� � utilizado qd  o bot�o do mouse � solto sobre um componente
		public void mouseReleased(MouseEvent e){ }// este m�todo s� � utilizado qd o mouse � solto sobre um componente
		public void mouseEntered(MouseEvent e){ // este m�todo s� � utilizado qd o ponteiro do mouse entra na �rea de um componente
		btTeimoso.setBounds(50, 120, 100, 25);
	}
		public void mouseExited(MouseEvent e){// este m�todo s� � utilizado qd o ponteiro do mouse sai na �rea de um componente
			btTeimoso.setBounds(50, 70, 100, 25);
		}
	});
	}

}
