package exercicioDeAprendizagemString;


import javax.swing.JOptionPane;
public class RetirandoEspaços {
    public static void main(String args[]) {
        String frase = JOptionPane.showInputDialog("Forneça uma frase");
        frase = "     " + frase + "     ";
        JOptionPane.showMessageDialog(null,
                "\nCom espaços: " + "-" + frase + "-" +
                "\nSem espaços: " + "-" + frase.trim() + "-");
        /*string.trim() remove os espaços em branco antes e depois da string
         */
        System.exit(0);
    }
}