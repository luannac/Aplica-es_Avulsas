import java.awt.Container;
import java.io.*;

import javax.swing.*;

public class Html extends JFrame{
	JLabel label = new JLabel();
	public Html(){
		Container janela = getContentPane();
		janela.add(label);
		File file= new File("src/Exer1.html");
		String str = new InputStreamReader(new BufferedInputStream(new FileInputStream(file)));
		label.setText(str);
		
		setVisible(true);
		setSize(1000, 600);
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(
				new Runnable () {
					public void run() {
						
						Html princ=new Html();
						princ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					}
				}
				);
	}

}
