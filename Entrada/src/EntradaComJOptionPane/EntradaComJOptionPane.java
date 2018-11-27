package EntradaComJOptionPane;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class EntradaComJOptionPane {
	public static void main(String[] args) {
	String nome;
	int idade;
	float altura;
	DecimalFormat df = new DecimalFormat(); //df acessa método que trata as casa decimais
	nome = JOptionPane.showInputDialog("Entre com seu nome: ");
	idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com sua idade: "));
	altura = Float.parseFloat (JOptionPane.showInputDialog("Entre com sua altura: "));
	df.applyPattern("0.00"); // defini quantas casas decimais 
                       JOptionPane.showMessageDialog(null, "nome: "+nome+"\nIdade: "+idade+"\nAltura: "+df.format(altura));
}
}

			/*Integer.parseInt() e Float.parseFloat() convertem strings para números inteiros e reais respectivamente*/