package polimorfismoCalculadora;

import javax.swing.JOptionPane;

public class TesteCa {

	public static void main(String args[]){
		Calculadora cal= null;
		
		String opcoes[]={"Soma","Subtra��o","Divis�o","Multiplica��o"};
		
		byte resp = (byte)JOptionPane.showOptionDialog(null,"Deseja fazer que opera��o?","CALCULADORA",1,1,null,opcoes,"Soma");
		double x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro termo:"));
		double x2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo termo:"));
		
		if(resp == 0){
			cal = new Soma(x1,x2);
			JOptionPane.showMessageDialog(null, "O resultado da soma �\n"+cal.calcular());
		}
		if(resp == 1){
			cal = new Subtracao(x1,x2);
			JOptionPane.showMessageDialog(null, "O resultado da subtra��o �\n"+cal.calcular());
		}
		if(resp == 2){
			cal = new Divisao(x1,x2);
			JOptionPane.showMessageDialog(null, "O resultado da divis�o �\n"+cal.calcular());
		}
		if(resp == 3){
			cal = new Multiplicacao(x1,x2);
			JOptionPane.showMessageDialog(null, "O resultado da multiplica��o �\n"+cal.calcular());
		}
			
	}

}
