package EntradaComJOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class CaixaComboBox {
public static void main(String[] args) {
String[] opcao={"sim","n�o"};
Object resposta; // Object � a classe m�e do JAVA que permite utilizar lista e matriz neste caso.
do {
 resposta = JOptionPane.showInputDialog(null,"Deseja finalizar o programa?" ,"Finaliza��o" , JOptionPane.QUESTION_MESSAGE,new ImageIcon("src/Imagens/ArcoIris.gif"), opcao,"n�o");
} while (resposta == null || resposta.equals("n�o"));

}
}
