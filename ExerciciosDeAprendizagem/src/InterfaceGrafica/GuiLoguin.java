package InterfaceGrafica;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GuiLoguin extends JFrame {
	private JTextField tfLogin;    //declara��o de componenetes visuais
	private JLabel lbSenha;        //utilizados na aplica��o
	private JLabel lbLogin;        //e cada exemplo podera ser utilizado
	private JButton btLogar;       //um componente diferente
	private JButton btCancelar;    
	private JPasswordField pfSenha;
	private static GuiLoguin frame;    
	
	public GuiLoguin(){       //metodo construtor que invoca dois metodos internos (inicializar e definir) 
		inicializarComponentes(); //metodos q serao utilizados para def carac visuais e os eventos neles.
		definirEventos();
	}
	/************Metodo para inicializar componentes ***************************************/
	private void inicializarComponentes() {
		setTitle("Login no Sistema");    //define  titulo
		setSize(250, 200);     //define  dimen�oes do frame (comprimento e largura )
		setLayout (null);  //define como nulo o gerenciador de layout com o metodo setLayout 
		tfLogin = new JTextField(5);      // cria��o de objetos e o num define o comprim das caixas de texto 
		pfSenha = new JPasswordField(5);//determina o numero de caracter que dever� ter a senha 
		lbSenha = new JLabel("Senha: ");  //cria objetos de labels e botoes c/ seus titulos
		lbLogin = new JLabel("Login: ");
		btLogar = new JButton("Logar");
		btCancelar = new JButton("Cancelar");
		
	/*********Define tamanho e posicionamento dos elementos *****************************/
		
		tfLogin.setBounds(100, 30, 120, 25);    
		lbLogin.setBounds(30, 30, 80, 25);
		lbSenha.setBounds(30, 75, 80, 25);
		pfSenha.setBounds(100, 75, 120, 25);
		btLogar.setBounds(20, 120, 100, 25);
		btCancelar.setBounds(125, 120, 100, 25);
		
	/*******************Adiciona elementos � frame   *************************************/	
		add(tfLogin);     //os componentes graficos s�o adicionados ao frame como um quebra cabe�as 
		add(lbSenha);     //estes s�o adicionados ao que foi definido anteriormente 
		add(lbLogin);
		add(btLogar);
		add(btCancelar);
		add(pfSenha);
	}
	/*******************M�todo que define os eventos ex.: acionar bot�es ******************/	
	private void definirEventos(){     //defini��o de um m�todo "filho" do anterior que define os eventos 
		btLogar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String senha = String.valueOf(pfSenha.getPassword()); // o m�todo getPassword retorna uma matriz de caracter eo o metodo valueOf convert em uma String
				if (tfLogin.getText().equals("") && senha.equals("")){ //testa se a senha esta correta e o loguin
						 frame.setVisible(false);
						 MenuPrincipal.abrir(); //Este m�todo cria a tela(frame)do menu principal 
				}else{
					JOptionPane.showMessageDialog(null, "Loguin ou senha incorretos");
				}
				
			}
		});
		
		btCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);                             // sai do programa 
			}
		});
	}
	//metodo principal 
	public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
	public void run() {
	frame = new GuiLoguin();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //encerra aplica��o qd a janela � fechada 
	Dimension tela = Toolkit.getDefaultToolkit().getScreenSize(); // metodos que manipulam dimens�o da tela do ambiente gr�fico
	frame.setLocation((tela.width - (frame).getSize().width)/2,          
	(tela.height - frame.getSize().height)/2);		   // centraliza janela coluna e a janela linha 
		frame.setVisible(true);
				
				
			}
		});
	}
}
