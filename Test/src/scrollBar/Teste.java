package scrollBar;

import javax.swing.JFrame;

public class Teste extends JFrame{
	GuiBarraRolagem gui = new GuiBarraRolagem();
	
	public Teste(){
		super("Teste");
		setVisible(true);
		setSize(300, 300);
		getContentPane().add(gui);
		
		
	}

	public static void main(String[] args) {
		new Teste();


	}

}
