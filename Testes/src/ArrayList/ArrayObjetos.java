package ArrayList;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayObjetos {

	public static void main(String[] args) {
		ArrayList<Pessoa> array  = new ArrayList<>();
		int resp;
		Pessoa pessoa;
		
		
		do{
			pessoa =  new Pessoa();
				pessoa.nome = JOptionPane.showInputDialog(null,"Digite um nome:");
				
				pessoa.idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade"));
				
				resp =JOptionPane.showConfirmDialog(null,"Deseja fazer de novo?");
				
			array.add(pessoa);
			pessoa = null;
		}while (resp==0);
		
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i).nome);
			System.out.println(array.get(i).idade);
			System.out.println();
		}
		System.out.close();

	}

}
