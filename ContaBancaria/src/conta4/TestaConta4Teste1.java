package conta4;

import javax.swing.JOptionPane;

public class TestaConta4Teste1 {

	public static void main(String[] args) {
		int numeroDeContas=2;
		Conta4 contaCorrente[]= new Conta4[numeroDeContas];
		for(int i=0;i<contaCorrente.length;i++){
			contaCorrente[i]= new Conta4(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero da Conta:")),
										JOptionPane.showInputDialog(null,"Digite o nome do Cliente: "),
										JOptionPane.showInputDialog(null,"Digite o sobrenome do Cliente: "),
										JOptionPane.showInputDialog(null,"Digite o CPF do Cliente: "),
										Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o saldo:")),
										Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o limite:")));
		}
		System.out.println(Conta4.getTotal());
		
		for (int i = 0; i < contaCorrente.length; i++) {
			System.out.println("\nome: "+contaCorrente[i].getNome());
		}
		
	}

}
