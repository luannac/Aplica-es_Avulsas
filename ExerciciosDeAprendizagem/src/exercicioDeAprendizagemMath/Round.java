package exercicioDeAprendizagemMath;

import javax.swing.JOptionPane;
public class Round {
    public static void main(String args[]) {
        double n1 = 5.2, n2 = 5.6, n3 = -5.8;
        JOptionPane.showMessageDialog(null, "Round: " +
                "\n" + n1 + "=" + Math.round(n1) +
                ",   " + n2 + "=" + Math.round(n2) +
                ",   " + n3 + "=" + Math.round(n3));
        System.exit(0);
    }
}
