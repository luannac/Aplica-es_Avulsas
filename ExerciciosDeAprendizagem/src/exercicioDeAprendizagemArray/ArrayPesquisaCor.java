package exercicioDeAprendizagemArray;

import javax.swing.JOptionPane;

public class ArrayPesquisaCor {

	public static void main(String[] args) {
		String[] cores = {"verde", "amarelo", "azul", "vermelho", "preto"};
		String cor = JOptionPane.showInputDialog("Forne�a uma cor");
		String mensagem = "Cor n�o encontrada";
		for(String elemento:cores){ //experimente digitar for (ctrl+espa�o) e escolha foreach
			if(elemento.equals(cor)){
				mensagem = "Cor encontrada";
				break;
			}
		}
		JOptionPane.showMessageDialog(null, mensagem);
		System.exit(0);
	}
}
