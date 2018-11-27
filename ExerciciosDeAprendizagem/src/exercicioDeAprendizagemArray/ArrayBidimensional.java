package exercicioDeAprendizagemArray;

import javax.swing.JOptionPane;

public class ArrayBidimensional {

	public static void main(String[] args) {
		int[][] matriz = new int[2][3];
		matriz[0][0] = 1;        matriz[0][1] = 2;        matriz[0][2] = 3;
		matriz[1][0] = 4;        matriz[1][1] = 5;        matriz[1][2] = 6;
		int soma = 0; // zerando o somador
		for (int linha=0;linha<2;linha++){
			System.out.println(); //pula uma linha 
			for (int coluna=0;coluna<3;coluna++){
				System.out.print(matriz[linha][coluna]+"\t");
				soma += matriz[linha][coluna]; // somador
			}
		}
		JOptionPane.showMessageDialog(null, "Soma dos elementos da matriz: " + soma);
		System.exit(0);
	}
}	
