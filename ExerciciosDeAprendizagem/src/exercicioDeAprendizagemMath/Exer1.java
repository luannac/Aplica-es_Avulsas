package exercicioDeAprendizagemMath;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sorte = (int) (Math.random()*9),usu;
		Scanner s =  new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		usu= s.nextInt();
		s.close();
		if(sorte==usu)
			System.out.println("Voce Ganhou.");
		else
			System.out.println("Voce perdeu \n o valor foi "+sorte);
		
	}

}
