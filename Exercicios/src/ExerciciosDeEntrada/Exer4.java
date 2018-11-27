package ExerciciosDeEntrada;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Exer4 {

	public static void main(String[] args) {
		float numero[]= new float[2];
		DecimalFormat df = new DecimalFormat();
		
		numero[0]=Float.parseFloat(JOptionPane.showInputDialog("Digite um numero:"));
		numero[1]=Float.parseFloat(JOptionPane.showInputDialog("Digite um numero:"));
		
		df.applyPattern("##");
		JOptionPane.showMessageDialog(null, numero[0]+" + "+numero[1]+" = "+df.format(numero[0]+numero[1])+"\n"+
											numero[0]+" - "+numero[1]+" = "+df.format(numero[0]-numero[1])+"\n"+
											numero[0]+" * "+numero[1]+" = "+(numero[0]*numero[1])+"\n"+
											numero[0]+" / "+numero[1]+" = "+(numero[0]/numero[1]));
	}

}
