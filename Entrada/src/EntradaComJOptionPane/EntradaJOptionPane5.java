package EntradaComJOptionPane;

import javax.swing.JOptionPane;
public class EntradaJOptionPane5 {
	public static void main(String[] args) {
	String resposta;
	do {
	resposta = JOptionPane.showInputDialog(null,"Deseja finalizar o programa?","Finaliza��o",JOptionPane.QUESTION_MESSAGE);
	if(!resposta.equals("sim")&& !resposta.equals("n�o")){
	JOptionPane.showMessageDialog(null,"Responda sim ou n�o","Cuidado",JOptionPane.WARNING_MESSAGE);
	resposta=null;
	}
	} while (resposta == null || resposta.equals("n�o"));
	}
	}
