package exercicioDeAprendizagemString;

import javax.swing.JOptionPane;
public class CaracteresDaFrase {
    public static void main(String args[]) {
        String frase = JOptionPane.showInputDialog("Forneça uma frase");
        String trecho = "";
        for (int i =0; i <= 14; i++) {
        	if (frase.charAt(i)!= 'e')
            trecho += frase.charAt(i);
        }
        JOptionPane.showMessageDialog(null, "Frase: " + frase +
            "\nCaractere 2: " + frase.charAt(1) +
            "\nTrecho: " + trecho);
        System.exit(0);
    }
}