package exercicioDeAprendizagemMath;
import javax.swing.JOptionPane;
public class Potencia {
    public static void main(String args[]) {
        float base = Float.parseFloat(
                JOptionPane.showInputDialog("Forne�a o valor da base"));
        float potencia = Float.parseFloat(
                JOptionPane.showInputDialog("Forne�a o valor da pot�ncia"));
        JOptionPane.showMessageDialog(null, "Pot�ncia com pow: " +
                "\nValor da base = " + base +
                "\nValor da pot�ncia = " + potencia +
                "\nResultado = "+Math.pow(base,potencia));
        System.exit(0);
    }
}
