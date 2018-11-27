package CarroSom;

import javax.swing.JFrame;

public class EustaquioMain {

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(
				new Runnable() {
					public void run(){
						Janela jn=new Janela();
						jn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
					}
				});
	}

}
