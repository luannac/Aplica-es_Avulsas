package exercicioDeAprendizagemMath;

import javax.swing.JOptionPane;
public class CartaoLoteria {
    public static void main(String[] args) {
        for (int cartao = 1; cartao <= 4; cartao++) { //controla o n�mero do cart�o
            String numerosCartao = "";
            for (int numCartao = 1; numCartao <= 6; numCartao++) { //controla os n�meros de cada cart�o
                int num = (int) (Math.random() * 10);
                numerosCartao += num + "   ";
            }
            JOptionPane.showMessageDialog(null, "N�meros do cart�o: " + cartao +
                    "\n" + numerosCartao);
        }
        System.exit(0);
    }
}
