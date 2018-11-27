package exrcicioAprendizagemString3;

import javax.swing.JOptionPane;

public class Exer3 {
	public static void main(String args[]){
		Frase frase = new Frase();
		frase.frase=JOptionPane.showInputDialog(null, "Digite a frase:");
		frase.palavra=JOptionPane.showInputDialog(null,"Digite a palavra:");
		
		JOptionPane.showMessageDialog(null, "A frase é:\n"
											+frase.frase+"\n"
											+ "Quantidade de palavras "+frase.palavra+" na frase é igual a "+frase.luannIndexOf());
	}
}
