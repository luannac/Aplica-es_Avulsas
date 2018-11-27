package EntradaComJOptionPane;

import javax.swing.JOptionPane;
public class EntradaJOptionPaneInput {
	public static void main(String[] args) {
		String nome = null;
		while (nome == null || nome.equals("")|| nome.equals(" nome e sobrenome ")) { //testa se foi colocado um nome na caixa de texto caso sim termina o programa nome = JOptionPane.showInputDialog("Qual o seu nome?","nome e sobrenome");
			// a segunda mensagem fica dentro do campo de texto
			nome=JOptionPane.showInputDialog("Nome:","Nome e Sobrenome");
			if (nome == null || nome.equals("")||nome.equals(" nome e sobrenome ")) {
				// Testa a caixa de texto e mostra uma mensagem caso esteja vazia 
				JOptionPane.showMessageDialog(null,"Você não respondeu a pergunta.");
			}
		}
		JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
		// mostra uma mensagem na janela 
	}
}
