package exercicioDeAprendizagemMath;
import javax.swing.JOptionPane;
public class MaiorMenor {
    public static void main(String args[]) {
        float num1 = Float.parseFloat(
                JOptionPane.showInputDialog("Forne�a o primeiro n�mero"));
        float num2 = Float.parseFloat(
                JOptionPane.showInputDialog("Forne�a o segundo n�mero"));
        JOptionPane.showMessageDialog(null, "N�meros fornecidos: " + num1 + " , " + num2 +
                "\nO maior � " + Math.max(num1, num2) +
                "\nO menor � " + Math.min(num1, num2));
        System.exit(0);
    }
}

