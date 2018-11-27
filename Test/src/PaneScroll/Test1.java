package PaneScroll;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class Test1 extends JFrame {
	
	public Test1(){
		super("Teste SCROLLPANE");
		
		setVisible(true);
		setSize(600, 300);
		
		JScrollPane src = new JScrollPane(new PaneTE());
		getContentPane().add( src);
		src.setBounds(0, 0, 600, 290);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test1();
	}

}
