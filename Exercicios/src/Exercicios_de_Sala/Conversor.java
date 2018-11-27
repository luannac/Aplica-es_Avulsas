package Exercicios_de_Sala;

import java.util.Scanner;
public class Conversor {

	public static void main(String[] args) {
		double f,c;
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("Digite o valor Em celsios para conversão:");
		c=scanner.nextDouble();

		f=(9*c+160)/5;
		System.out.println(c+" celsius é igual a "+f+" Fahrenheit");
		scanner.close();
	}

}
