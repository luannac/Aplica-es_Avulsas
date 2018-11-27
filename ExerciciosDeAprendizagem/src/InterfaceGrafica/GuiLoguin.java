package InterfaceGrafica;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GuiLoguin extends JFrame {
	private JTextField tfLogin;    //declaração de componenetes visuais
	private JLabel lbSenha;        //utilizados na aplicação
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
		setSize(250, 200);     //define  dimençoes do frame (comprimento e largura )
		setLayout (null);  //define como nulo o gerenciador de layout com o metodo setLayout 
		tfLogin = new JTextField(5);      // criação de objetos e o num define o comprim das caixas de texto 
		pfSenha = new JPasswordField(5);//determina o numero de caracter que deverá ter a senha 
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
		
	/*******************Adiciona elementos à frame   *************************************/	
		add(tfLogin);     //os componentes graficos são adicionados ao frame como um quebra cabeças 
		add(lbSenha);     //estes são adicionados ao que foi definido anteriormente 
		add(lbLogin);
		add(btLogar);
		add(btCancelar);
		add(pfSenha);
	}
	/*******************Método que define os eventos ex.: acionar botões ******************/	
	private void definirEventos(){     //definição de um método "filho" do anterior que define os eventos 
		btLogar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String senha = String.valueOf(pfSenha.getPassword()); // o método getPassword retorna uma matriz de caracter eo o metodo valueOf convert em uma String
				if (tfLogin.getText().equals("") && senha.equals("")){ //testa se a senha esta correta e o loguin
						 frame.setVisible(false);
						 MenuPrincipal.abrir(); //Este método cria a tela(frame)do menu principal 
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
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //encerra aplicação qd a janela é fechada 
	Dimension tela = Toolkit.getDefaultToolkit().getScreenSize(); // metodos que manipulam dimensão da tela do ambiente gráfico
	frame.setLocation((tela.width - (frame).getSize().width)/2,          
	(tela.height - frame.getSize().height)/2);		   // centraliza janela coluna e a janela linha 
		frame.setVisible(true);
				
				
			}
		});
	}
}
