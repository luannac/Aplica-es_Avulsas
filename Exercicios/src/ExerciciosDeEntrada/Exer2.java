package ExerciciosDeEntrada;

import java.util.Scanner;
public class Exer2 {

	public static void main(String[] args) {
		double salarioMensal,reajuste,novoSalario;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o salário atual:");
		salarioMensal=s.nextDouble();
		
		System.out.println("Digite a porcentagem de reajuste:");
		reajuste=s.nextDouble();
		
		novoSalario=salarioMensal+(salarioMensal*reajuste/100);
		
		System.out.println("O novo salário será: "+novoSalario);
		s.close();
	}

}