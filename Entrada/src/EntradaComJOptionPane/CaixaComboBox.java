package EntradaComJOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class CaixaComboBox {
public static void main(String[] args) {
String[] opcao={"sim","não"};
Object resposta; // Object é a classe mãe do JAVA que permite utilizar lista e matriz neste caso.
do {
 resposta = JOptionPane.showInputDialog(null,"Deseja finalizar o programa?" ,"Finalização" , JOptionPane.QUESTION_MESSAGE,new ImageIcon("src/Imagens/ArcoIris.gif"), opcao,"não");
} while (resposta == null || resposta.equals("não"));

}
}
