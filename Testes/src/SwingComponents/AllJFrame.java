package SwingComponents;

import java.awt.Component;
import javax.swing.JTextField;
	
	public class AllJFrame {
		public static void cleanJTextFields(Component[] components) {
			for (Component c : components) {
				if (c instanceof JTextField) {
					((JTextField) c).setText("");
				}
			}
		}
	}
	