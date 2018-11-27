package containerTeste;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		javax.swing.SwingUtilities.invokeLater(
				new Runnable() {
					public void run(){
						JFrame jframe= new JFrame();
						jframe.setVisible(true);
						jframe.setSize(500, 500);
						Container1 cont = new Container1();
						//UIManager.setLookAndFeel("Macintosh*");
						
						jframe.setContentPane(cont);

						jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
					}
				});
	}

}
