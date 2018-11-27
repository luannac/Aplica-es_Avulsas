package EntradaComJOptionPane;

import javax.swing.JOptionPane;
public class BotaoJOptionPane {
public static void main(String[] args) {
Object[] opcoes = {"Aceita","Rejeita"};
int resposta;
do {
resposta = JOptionPane.showOptionDialog(null,"Deseja finalizar o programa?","Finalização",JOptionPane.DEFAULT_OPTION,
JOptionPane.QUESTION_MESSAGE,null,opcoes,"Rejeita");

} while (resposta == 1 );
}
}
