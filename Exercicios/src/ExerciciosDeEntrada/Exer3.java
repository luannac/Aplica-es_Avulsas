package ExerciciosDeEntrada;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Exer3 {

	public static void main(String[] args) {
		double area,raio=0;
		
		DecimalFormat df = new DecimalFormat();
		raio=Double.parseDouble(JOptionPane.showInputDialog("Digite o Raio"));
		
		area=3.14*Math.pow(raio, 2);
		
		df.applyPattern("##.#");
		JOptionPane.showMessageDialog(null,"A area é "+df.format(area));

	}

}
