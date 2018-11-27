package DesafioIMC;

import javax.swing.JFrame;

public class Main {

	public static void main (String args[]) {
		javax.swing.SwingUtilities.invokeLater(
				new Runnable () {
					public void run() {
						Janela PROGRAMA = new Janela();
						PROGRAMA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					}
				}
				);
	}
}
