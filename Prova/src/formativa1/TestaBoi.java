package formativa1;

import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TestaBoi {
	//Atributos
	static ArrayList<Boi> bois= new ArrayList<Boi>();
	
	//Metodos 
	public static byte menu(){
		String opcoes[]= {"Cadastrar","Testar Boi","Valor Total","Mostrar Todos","Mostrar Total","Sair"};
		return (byte)JOptionPane.showOptionDialog(null, null, "Menu", 1, 1, new ImageIcon("src/formativa1/menu.jpg"), opcoes, "Cadastrar");
	}
	
	public static void cadastrar(){
		bois.add(new Boi(Float.parseFloat(JOptionPane.showInputDialog("Novo Boi\nDigite o peso do novo Boi:"))));
		JOptionPane.showMessageDialog(null, bois.get(Boi.getTotal()-1).getIdentificacao()+" Criado\nDa categoria "+bois.get(Boi.getTotal()-1).getStatus());
	}
	
	public static void testaBoi(){		
		if(!bois.isEmpty()){
			int resp = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero do Boi:"));
			if(bois.get(resp-1)!=null)
				JOptionPane.showMessageDialog(null,bois.get(resp-1).getIdentificacao()+"\n Se classifica como "+bois.get(resp-1).getStatus());
		}else{
			JOptionPane.showMessageDialog(null, "Lista Vazia\nCadastre algum Boi!");
		}
	}
	
	public static void valorTotal(){
		double total=0;
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#######.###");
		if(!bois.isEmpty()){
			double arroba = Double.parseDouble(JOptionPane.showInputDialog("Digite o Preço atual da Arroba:"));
			for (int i = 0; i < bois.size(); i++) {
				total+=bois.get(i).calcularVenda(arroba);
			}
			JOptionPane.showMessageDialog(null, "O total de Bois a ser Vendido equivale a \n"+df.format(total)+" R$");
		}else{
			JOptionPane.showMessageDialog(null, "Lista Vazia\nCadastre algum Boi!");
		}
		
	}
	public static void mostraTodos(){
		if(!bois.isEmpty()){
			String mostrar="Id     Peso   Status\n";
			for (int i = 0; i < bois.size(); i++) {
				mostrar+=bois.get(i).getIdentificacao()+"   "+bois.get(i).getPeso()+"   "+bois.get(i).getStatus()+"\n";
			}
			JOptionPane.showMessageDialog(null, mostrar);
		}else{
			JOptionPane.showMessageDialog(null, "Lista Vazia\nCadastre algum Boi!");
		}	
	}
	public static void mostrarTotal(){
		JOptionPane.showMessageDialog(null, "Há "+Boi.getTotal()+" Bois");
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
