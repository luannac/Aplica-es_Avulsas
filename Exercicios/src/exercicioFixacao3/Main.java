package exercicioFixacao3;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String[] op={"Sim","Não"};
		int opcao;

		Produto[] produto= new Produto[4];
		produto[0]= new Produto("ABCD",5.3);
		produto[1]=new Produto("XYPK", 6.0);
		produto[2]=new Produto("KLMP", 3.2);
		produto[3]=new Produto("QRST", 2.5);
		
		do{
			
			JOptionPane.showMessageDialog(null, produto[0].total(Integer.parseInt(
					JOptionPane.showInputDialog("Digite a quantidade:")),
					produto[0].buscar((String)JOptionPane.showInputDialog("Digite o Codigo"), produto))
					+" Reais");
					opcao=JOptionPane.showOptionDialog(null,"Deseja fazer de novo?","Final",JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE,null,op,"Sim");
		}while(opcao!=1);
	}

}
