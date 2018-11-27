package ExerciciosDeEntrada;

import java.util.Scanner;
public class Exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero[]=new int[4];
		int i;
		Scanner s;
		
		for(i=0;i<4;i++){
			System.out.printf("Digite o %d numero:",i+1);
			s=new Scanner(System.in);
			numero[i]=s.nextInt();
		}
		System.out.printf("\nO produto do 1 e 3 numero é: %d\n",numero[0]*numero[2]);
		System.out.printf("A soma de 2 e 4 numero é: %d",numero[1]+numero[3]);
	}

}
