package exrcicioAprendizagemString2;

import javax.swing.JOptionPane;

public class FraseSemVogal {
		public static void main(String args[]) {
	        String frase = JOptionPane.showInputDialog("Forneça uma frase");
	        String trecho = "";
	        for (int i =0; i < frase.length(); i++) {
	        	if (frase.charAt(i)!= 'a'&&frase.charAt(i)!= 'e'&&frase.charAt(i)!= 'o'&&frase.charAt(i)!= 'u'&&frase.charAt(i)!= 'i'&&
	        			frase.charAt(i)!= 'A'&&frase.charAt(i)!= 'E'&&frase.charAt(i)!= 'O'&&frase.charAt(i)!= 'U'&&frase.charAt(i)!= 'I')
	            trecho += frase.charAt(i);
	        }
	        JOptionPane.showMessageDialog(null, "Frase: " + frase+
	        									"\nSem vogal: "+trecho);
	        System.exit(0);
	    }
}
