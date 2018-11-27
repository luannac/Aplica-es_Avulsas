package EntradaComJOptionPane;

import javax.swing.JOptionPane;
public class EntradaJOptionPane5 {
	public static void main(String[] args) {
	String resposta;
	do {
	resposta = JOptionPane.showInputDialog(null,"Deseja finalizar o programa?","Finalização",JOptionPane.QUESTION_MESSAGE);
	if(!resposta.equals("sim")&& !resposta.equals("não")){
	JOptionPane.showMessageDialog(null,"Responda sim ou não","Cuidado",JOptionPane.WARNING_MESSAGE);
	resposta=null;
	}
	} while (resposta == null || resposta.equals("não"));
	}
	}
