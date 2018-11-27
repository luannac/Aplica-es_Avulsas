package InterfaceGrafica;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class MenuPrincipal  extends JFrame {
	private Container contentPane;
	private JMenuBar mnBarra;
	private JMenu mnArquivo, mnExemplos;
	private JMenuItem miSair, miBotao,miOpcao,miRadio,miLabel,miList,miMasc,miAbas,miDataHora;
	
	public MenuPrincipal() {
	inicializarComponentes();
	definirEventos();
	}
	/***************Metodo pa inicializar componentes *************/
	private void inicializarComponentes() {
		setTitle("Menu principal");    //define  titulo
		setBounds (0, 0, 800, 600);      //define o posicionamento e dimençoes do frame (x e y)
		
		contentPane = getContentPane(); //método  que permite que outros elementos sejam add a ela como fila.
		mnBarra = new JMenuBar();     // Cria o objeto menu
		mnArquivo = new JMenu("Arquivo");   //coloca no menu a palavra Arquivo na barra de menu
		mnExemplos = new JMenu("Exemplos");
		mnArquivo.setMnemonic('A'); // cria uma letra de atalho para a palavra sair(alt+a)
		mnExemplos.setMnemonic('E');
				miSair = new JMenuItem("Sair");
		miSair.setAccelerator(KeyStroke.getKeyStroke( //cria um atalho de sair (ALT+S)
				KeyEvent.VK_S, ActionEvent.ALT_MASK));
		miBotao = new JMenuItem("Botao");
		miOpcao = new JMenuItem("Opção");
		miRadio = new JMenuItem("Radio");
		miLabel = new JMenuItem("Label");
		miList = new JMenuItem("Lista");
		miMasc = new JMenuItem("Mascara");
		miAbas = new JMenuItem("Abas");
		miDataHora = new JMenuItem("Data");
		
		
	/***********Adiciona elementos à menu barra  ***************/	
		
		mnArquivo.add(miSair);     //adiciona item sair ao menu Arquivo 
		mnExemplos.add(miBotao);//adiciona item sair ao menu Exemplos
		mnExemplos.add(miOpcao);
		mnExemplos.add(miRadio);
		mnExemplos.add(miLabel);
		mnExemplos.add(miList);
		mnExemplos.add(miMasc);
		mnExemplos.add(miAbas);
		mnExemplos.add(miDataHora);
		mnBarra.add(mnArquivo);
		mnBarra.add(mnExemplos);
		setJMenuBar(mnBarra);
		
	}
	/*******Método que define os eventos ex.: acionar botões *****/	
	private void definirEventos() {
		miSair.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
		}
	});
		// este eventos quando selecionado aciona a tela Botão
		miBotao.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JPanel botao = new Botao(); // cria um objeto da classe Botao
				contentPane.removeAll(); // Remove todos os objetos do painel(container)
				contentPane.add(botao); // o Adiciona ao menu o acesso a Classe Botão
				contentPane.validate(); // Valida todos os componentes do painel da  Classe Botão 

			}
		});
		// este eventos quando selecionado aciona a tela Caixa de Opção
		
		miOpcao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JPanel panel = new CaixaOpcao(); // cria um objeto da classe Botao
				contentPane.removeAll(); // Remove todos os objetos do painel(container)
				contentPane.add(panel); // o Adiciona ao menu o acesso a Classe Botão
				contentPane.validate(); // Valida todos os componentes do painel da  Classe Botão 
				
			}
		});
		// este eventos quando selecionado aciona a tela De Radio
		
		miRadio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JPanel panel = new GuiRadio(); // cria um objeto da classe Radio
				contentPane.removeAll(); // Remove todos os objetos do painel(container)
				contentPane.add(panel); // o Adiciona ao menu o acesso a Classe Botão
				contentPane.validate(); // Valida todos os componentes do painel da  Classe Botão 
				
			}
		});
		// este eventos quando selecionado aciona a tela De Label
		
				miLabel.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						JPanel panel = new GuiLabel(); // cria um objeto da classe Label
						contentPane.removeAll(); // Remove todos os objetos do painel(container)
						contentPane.add(panel); // o Adiciona ao menu o acesso a Classe Botão
						contentPane.validate(); // Valida todos os componentes do painel da  Classe Botão 
						
					}
				});
		// este eventos quando selecionado aciona a tela De Label
				
				miList.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						JPanel panel = new GuiLista(); // cria um objeto da classe Botao
						contentPane.removeAll(); // Remove todos os objetos do painel(container)
						contentPane.add(panel); // o Adiciona ao menu o acesso a Classe Botão
						contentPane.validate(); // Valida todos os componentes do painel da  Classe Botão 
						
					}
				});
				miMasc.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						JPanel panel = new GuiMascara(); // cria um objeto da classe Botao
						contentPane.removeAll(); // Remove todos os objetos do painel(container)
						contentPane.add(panel); // o Adiciona ao menu o acesso a Classe Botão
						contentPane.validate(); // Valida todos os componentes do painel da  Classe Botão 
						
					}
				});
				miAbas.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						JPanel panel = new GuiAbas(); // cria um objeto da classe Botao
						contentPane.removeAll(); // Remove todos os objetos do painel(container)
						contentPane.add(panel); // o Adiciona ao menu o acesso a Classe Botão
						contentPane.validate(); // Valida todos os componentes do painel da  Classe Botão 
						
					}
				});
				miDataHora.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						JPanel panel = new ManipulacaoDataHora("Data"); // cria um objeto da classe Botao
						contentPane.removeAll(); // Remove todos os objetos do painel(container)
						contentPane.add(panel); // o Adiciona ao menu o acesso a Classe Botão
						contentPane.validate(); // Valida todos os componentes do painel da  Classe Botão 
						
					}
				});
	}
	/********Método que cria a frame do menu principal ***********/
	public static void abrir(){
		MenuPrincipal frame = new MenuPrincipal();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((tela.width - frame.getSize().width)/2,
				(tela.height - frame.getSize().height)/2);
		frame.setVisible(true);
	}
	
	
}
