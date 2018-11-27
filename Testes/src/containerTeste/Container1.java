package containerTeste;

import java.awt.*;

import javax.swing.*;

public class Container1 extends Container {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9169073844434390986L;
	JLabel jl = new JLabel("oi");
	JTextField fl= new JTextField();
	public Container1() {
		jl.setBounds(10, 10, 100, 100);
		fl.setBounds(120, 120, 100, 100);
		//Color cl = new Color(555,000,000);
		//this.setBackground(cl);
		//jl.setBackground(getForeground());
		//fl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		
		this.add(new Scrollbar());
		this.add(fl);
		this.add(jl);
		this.setVisible(true);
		
		
		
	}
}
