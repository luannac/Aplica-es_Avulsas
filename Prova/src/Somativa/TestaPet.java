package Somativa;

import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TestaPet {
	/**********************************Atributos********************/
	private static ArrayList<Animal> aAnimais=  new ArrayList<Animal>(40);//List que guarda todos animais
	
	/**********************************************Main*********************************/
	public static void main(String[] args) {
		int resp = 0;
		do{
			resp = menu();
			if(resp==0)
				cadastrar();
			if(resp==1)
				valorTotal();
			if(resp==2)
				todosResgistros();
			if(resp==3)
				quantResgistro();
			if(resp==4)
				relatorio();
			
		}while(resp!=5);

	}
	/******************************Metodos Do Menu e suas Funcionalidades*****************/
	public static int menu(){
		String sOpcoes[]= {"Cadastrar","Valor Total","Todos os Registros","Quantidade de Registros","Relatório","Sair"};
		return JOptionPane.showOptionDialog(null, "PETSHOP", "Menu", 1, 1, null, sOpcoes, "Cadastrar");
	}
	
	/*************************************/
	public static void cadastrar(){
		String sAnimais[]= {"Gato","Cachorro"};
		String sAtividades[]= {"Banho e Tosa","Banho","Tosa"};
		String sTamanho[]={"Pequeno","Médio","Grande"};
		int iOpcoes;
		
		if(0==JOptionPane.showOptionDialog(null, "Deseja cadastrar :", "Opção", 1, 1, null, sAnimais, "Gato")){
			Animal gato = new Animal(JOptionPane.showInputDialog("Digite o Nome do Dono"),
									JOptionPane.showInputDialog("Digite o nome do Gato"));
				
			iOpcoes = JOptionPane.showOptionDialog(null, "O que deseja fazer :", "Opção", 1, 1, null, sAtividades, "Banho e Tosa");
			
			byte iQuantidade =Byte.parseByte(JOptionPane.showInputDialog("Em quantos gatos :"));
			if(iOpcoes==0){
				gato.banho(iQuantidade);
				gato.tosa(iQuantidade);
			}
			if(iOpcoes==1)
				gato.banho(iQuantidade);
			if(iOpcoes==2)
				gato.tosa(iQuantidade);
			aAnimais.add(gato);
		}else{
			Animal cachorro = new Animal(JOptionPane.showInputDialog("Digite o Nome do Dono"),
					JOptionPane.showInputDialog("Digite o nome do Cachorro"),
					JOptionPane.showOptionDialog(null, "Qual o Tamanho :", "Opção", 1, 1, null, sTamanho, "Médio"));

			iOpcoes = JOptionPane.showOptionDialog(null, "O que deseja fazer :", "Opção", 1, 1, null, sAtividades, "Banho e Tosa");
			
			if(iOpcoes==0){
			cachorro.banho();
			cachorro.tosa();
			}
			if(iOpcoes==1)
			cachorro.banho();
			if(iOpcoes==2)
			cachorro.tosa();
			aAnimais.add(cachorro);
		}
	}
	
	/***************************************/
	private static void valorTotal() {
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("####.##");
		JOptionPane.showMessageDialog(null, "O PETSHOP rendeu hoje:\n"+df.format(Animal.getfValorTotal()));
	}
	/***************************************/
	private static void todosResgistros() {
		if(!aAnimais.isEmpty()){
			String registros = "";
			for (int i = 0; i < aAnimais.size(); i++) {
				registros = registros+aAnimais.get(i).getsAnimalNome()+"               "+
										aAnimais.get(i).getsDonoNme()+"      ";
				if(aAnimais.get(i).getsTipo()==0)
					registros+= "gato       ";
				else
					registros+= "Cachorro   ";
				DecimalFormat df = new DecimalFormat();
				df.applyPattern("###.##");
				registros+=df.format(aAnimais.get(i).getfValorServico())+"\n";
			}
			JOptionPane.showMessageDialog(null, "Nome Animal   Nome Dono   Tipo   Gastou\n"+registros);
		}else
			JOptionPane.showMessageDialog(null, "Nenhum animal registrado");
	}
	/**************************************/
	private static void quantResgistro() {
		JOptionPane.showMessageDialog(null, "Há um total de "+aAnimais.size()+" registros");
	}
	/*************************************/
	private static void relatorio() {
		JOptionPane.showMessageDialog(null, "Hoje \n"
											+"Foi dado banho em "+Animal.getbQuantbanho()+" animais\n"
											+"Foram tosados "+Animal.getbQuantTosa());
	}
}