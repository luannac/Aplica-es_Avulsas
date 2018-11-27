package CarroEstaquio1;

import javax.swing.JFrame;

public class EstaquioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(
				new Runnable () {
					public void run() {
						
						EstaquioFrame ef=new EstaquioFrame();
						ef.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					}
				}
				);
	}

}
