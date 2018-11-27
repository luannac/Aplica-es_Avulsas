package SwingComponents;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TestJFrame {
	private JFrame frame;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;
	private JButton buttonLimpar;
	public TestJFrame() {
		frame = new JFrame("TestJFrame");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		final JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(labelFactory("Text 1:"));
		text1 = textFieldFactory();
		panel.add(text1);
		panel.add(labelFactory("Text 2:"));
		text2 = textFieldFactory();
		panel.add(text2);
		panel.add(labelFactory("Text 3:"));
		text3 = textFieldFactory();
		panel.add(text3);
		panel.add(labelFactory("Text 4:"));
		text4 = textFieldFactory();
		panel.add(text4);
		frame.getContentPane().add(panel);
		buttonLimpar = new JButton("Limpar");
		buttonLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				// limpa o texto dos JTextFields
				AllJFrame.cleanJTextFields(panel.getComponents());
			}
		});
		frame.getContentPane().add(buttonLimpar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(280, 210);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	private JTextField textFieldFactory() {
		JTextField txt = new JTextField(10);
		return txt;
	}
	private JLabel labelFactory(String text) {
		JLabel lbl = new JLabel(text, SwingConstants.RIGHT);
		return lbl;
	}
	public static void main(String[] args) {
		new TestJFrame();
	}
}
