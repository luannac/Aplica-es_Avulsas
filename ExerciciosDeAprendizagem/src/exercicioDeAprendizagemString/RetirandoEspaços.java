package exercicioDeAprendizagemString;


import javax.swing.JOptionPane;
public class RetirandoEspa�os {
    public static void main(String args[]) {
        String frase = JOptionPane.showInputDialog("Forne�a uma frase");
        frase = "     " + frase + "     ";
        JOptionPane.showMessageDialog(null,
                "\nCom espa�os: " + "-" + frase + "-" +
                "\nSem espa�os: " + "-" + frase.trim() + "-");
        /*string.trim() remove os espa�os em branco antes e depois da string
         */
        System.exit(0);
    }
}