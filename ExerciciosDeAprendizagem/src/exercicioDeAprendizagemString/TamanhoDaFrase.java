package exercicioDeAprendizagemString;
import javax.swing.JOptionPane;
public class TamanhoDaFrase {
    public static void main(String args[]) {
        String frase = JOptionPane.showInputDialog("Forne�a uma frase");
        int tamanho = frase.length();
        JOptionPane.showMessageDialog(null, "Frase: " + frase + "\nQuantidade de Caracteres: " + tamanho);
        System.exit(0);
    }
}
