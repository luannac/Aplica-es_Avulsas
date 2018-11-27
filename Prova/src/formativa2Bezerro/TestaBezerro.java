package formativa2Bezerro;

import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TestaBezerro{
	//Atributos
	static ArrayList<Bezerro> bezerros= new ArrayList<Bezerro>();
	
	//Metodos 
	public static byte menu(){
		String opcoes[]= {"Cadastrar","Testar Bezerro","Valor Total","Mostrar Todos","Mostrar Total","Sair"};
		return (byte)JOptionPane.showOptionDialog(null, null, "Menu", 1, 1, new ImageIcon("src/formativa2Bezerro/bezerros.jpg"), opcoes, "Cadastrar");
	}
	
	public static void cadastrar(){
		bezerros.add(new Bezerro(Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do Bezerro")),
								Boolean.parseBoolean(JOptionPane.showInputDialog("Está mamando?(true/false)").toLowerCase())));
		JOptionPane.showMessageDialog(null, bezerros.get(Bezerro.getTotal()-1).getId()+" Criado\nEstá mamando : "+bezerros.get(Bezerro.getTotal()-1).isMamando());
	}
	
	public static void testaBoi(){		
		if(!bezerros.isEmpty()){
			int resp = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero do Bezerro:"));
			if(bezerros.get(resp-1)!=null)
				JOptionPane.showMessageDialog(null,bezerros.get(resp-1).getId()+"\n Está mamando : "+bezerros.get(resp-1).isMamando());
		}else{
			JOptionPane.showMessageDialog(null, "Lista Vazia\nCadastre algum Bezerro!");
		}
	}
	
	public static void valorTotal(){
		double total=0;
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#######.###");
		if(!bezerros.isEmpty()){
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Preço atual do quilo:"));
			for (int i = 0; i < bezerros.size(); i++) {
				total+=bezerros.get(i).calcularVenda(valor);
			}
			JOptionPane.showMessageDialog(null, "O total de Bezerros a ser Vendido equivale a \n"+df.format(total)+" R$");
		}else{
			JOptionPane.showMessageDialog(null, "Lista Vazia\nCadastre algum Bezerro!");
		}
		
	}
	public static void mostraTodos(){
		if(!bezerros.isEmpty()){
			String mostrar="Id   	  Peso   Status\n";
			for (int i = 0; i < bezerros.size(); i++) {
				mostrar+=bezerros.get(i).getId()+"   "+bezerros.get(i).getPeso()+"   "+bezerros.get(i).status()+"\n";
			}
			JOptionPane.showMessageDialog(null, mostrar);
		}else{
			JOptionPane.showMessageDialog(null, "Lista Vazia\nCadastre algum Bezerro!");
		}	
	}
	public static void mostrarTotal(){
		JOptionPane.showMessageDialog(null, "Há "+Bezerro.getTotal()+" Bezerro");
	}
	
	//Metodo Main
	public static void main(String[] args) {
		byte resp=0;
		
		do{
			resp = menu();
			if(resp==0)
				cadastrar();
			if(resp==1)
				testaBoi();
			if(resp==2)
				valorTotal();
			if(resp==3)
				mostraTodos();
			if(resp==4)
				mostrarTotal();
			
			
		}while(resp!=5);
	}
}
