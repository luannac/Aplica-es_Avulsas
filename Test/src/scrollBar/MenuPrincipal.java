package scrollBar;

//contem os imports para os componentes graficos
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;   //

import javax.swing.*;






public class MenuPrincipal  extends JFrame {
private Container contentPane;
private JMenuBar mnBarra;
private JMenu mnArquivo, mnExemplos;
private JMenuItem miSair, miBotao,miOpcao,miRadio,miLabel,mipaises,miExcluir,mitelefone,mimascara,miAbas,miInternoFrame,miFoto
, miBarraRolagem,miLista;
private JScrollPane jp;

public MenuPrincipal() {
inicializarComponentes();
definirEventos();
}
/***********************Metodo pa inicializar componentes ***************************************/
private void inicializarComponentes() {
setTitle("Menu principal");    //define  titulo
setBounds (0, 0, 800, 600);      //define o posicionamento e dimençoes do frame (x e y)

contentPane = getContentPane(); //classe  que permite que outros elementos sejam add a ela como fila.
mnBarra = new JMenuBar();     // Cria o objeto menu
mnArquivo = new JMenu("Arquivo");   //coloca no menu a palavra Arquivo na barra de menu
mnExemplos = new JMenu("Exemplos");
mnArquivo.setMnemonic('A'); // cria uma letra de atalho para a palavra sair(alt+a)
mnExemplos.setMnemonic('E');
miOpcao = new JMenuItem("Caixa de Opçao"); //cria um menuitem "Caixa de Opção"
mipaises = new JMenuItem("Paises");
miSair = new JMenuItem("Sair");
miSair.setAccelerator(KeyStroke.getKeyStroke( //cria um atalho de sair (ALT+S)
		KeyEvent.VK_S, ActionEvent.ALT_MASK));
miBotao = new JMenuItem("Botao");
miRadio = new JMenuItem("Radio");
miLabel = new JMenuItem("Label");
miExcluir = new JMenuItem("Excluir");
mitelefone = new JMenuItem("Telefone Digital");
mimascara = new JMenuItem("Mascara");
miAbas = new JMenuItem("Abas") ;
miBarraRolagem = new JMenuItem("Barra de Rolagem");
miInternoFrame = new JMenuItem("Frame Interno");
miFoto =new JMenuItem("Lista Foto");
miLista = new JMenuItem("Lista");
jp= new JScrollPane();
//contentPane.add(jp);

/*******************Adiciona elementos à menu barra  *************************************/	

mnArquivo.add(miSair);     //adiciona item sair ao menu Arquivo 
mnExemplos.add(miBotao); //adiciona item sair ao menu Exemplos 
mnExemplos.add(miOpcao);
mnExemplos.add(miRadio);
mnExemplos.add(miLabel);
mnExemplos.add(mipaises);
mnExemplos.add(miExcluir);
mnExemplos.add(mitelefone);
mnExemplos.add(mimascara);
mnExemplos.add(miAbas);
mnExemplos.add(miBarraRolagem);
mnExemplos.add(miInternoFrame);
mnExemplos.add(miFoto);
mnExemplos.add(miLista);
mnBarra.add(mnArquivo);
mnBarra.add(mnExemplos);
setJMenuBar(mnBarra);

}
/*******************Método que define os eventos ex.: acionar botões ******************/	
private void definirEventos() {
miSair.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		System.exit(0);
}
});
// este eventos quando selecionado aciona a tela Botão
miBotao.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		//Botao botao = new Botao(); // cria um objeto da classe Botao
	Botao bt= new Botao();
		contentPane.removeAll(); // Remove todos os objetos do painel(container)
		contentPane.add(bt); // o Adiciona ao menu o acesso a Classe Botão
		contentPane.validate(); // Valida todos os componentes do painel da  Classe Botão 

	}
});
// este eventos quando selecionado aciona a tela Caixa de Opção

miOpcao.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		CaixaOpcao caixaOpcao = new CaixaOpcao();
		contentPane.removeAll();
		contentPane.add(caixaOpcao);
		contentPane.validate();
	}
});
// este eventos quando selecionado aciona a tela Botões Radio
miRadio.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		GuiRadio radio = new GuiRadio();
		
		contentPane.removeAll();
		contentPane.add(radio);
		contentPane.validate();
	}
});
// este eventos quando selecionado aciona a tela Label
miLabel.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		Label label = new Label();
		contentPane.removeAll();
		contentPane.add(label);
		contentPane.validate();
	}
});

mipaises.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		Paises paises = new Paises();
		contentPane.removeAll();
		contentPane.add(paises);
		contentPane.validate();
	}
});
miExcluir.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		GuiExcluir excluir = new GuiExcluir();
		contentPane.removeAll();
		contentPane.add(excluir);
		contentPane.validate();
		
	}
});
mitelefone.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		GuiDiscador discador = new GuiDiscador();
		contentPane.removeAll();
		contentPane.add(discador);
		contentPane.validate();
		
	}
});
mimascara.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		GuiMascara mascara = new GuiMascara();
		contentPane.removeAll();
		contentPane.add(mascara);
		contentPane.validate();	
		
	}
});
miAbas.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		GuiAbas abas = new GuiAbas();
		contentPane.removeAll();
		contentPane.add(abas);
		contentPane.validate();	
	}
});
miBarraRolagem.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		GuiBarraRolagem barra = new GuiBarraRolagem();
		contentPane.removeAll();
		contentPane.add(barra);
		contentPane.validate();	
	}
});
miInternoFrame.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		GuiFrameInterno frameInt = new GuiFrameInterno();
	
		contentPane.removeAll();
		contentPane.add(frameInt);
		contentPane.validate();	
		
	}
});
miFoto.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		GuiListaComFotos foto = new GuiListaComFotos();
		
		contentPane.removeAll();
		contentPane.add(foto);
		contentPane.validate();
	}
});
miLista.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		GuiLista lista = new GuiLista();
		contentPane.removeAll();
		contentPane.add(lista);
		contentPane.validate();
	}
});
}
/*******************Método que cria a frame do menu principal ******************/
public static void abrir(){
MenuPrincipal frame = new MenuPrincipal();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
frame.setLocation((tela.width - frame.getSize().width)/2,
		(tela.height - frame.getSize().height)/2);
frame.setVisible(true);
}


}
