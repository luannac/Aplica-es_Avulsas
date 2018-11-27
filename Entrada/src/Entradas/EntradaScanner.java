package Entradas;

import  java.text.DecimalFormat;
import  java.util.*;
class EntradaScanner{
	public static void main(String[] args){
		String nome;
		int idade;
		float altura;
		DecimalFormat df = new DecimalFormat();//df acessa método que trata as casa decimais
		Scanner s = new Scanner(System.in);
		System.out.println();
		System.out.println("Entre com seu nome: ");
		nome = s.next(); // método que recebe conjunto de caractere do teclado
		System.out.println("Entre com sua idade: ");
		idade = s.nextInt(); // método que recebe numero inteiro do teclado
		System.out.println("Entre com sua altura: ");
		altura = s.nextFloat(); // método que recebe numero real do teclado
		System.out.println();
		System.out.println("nome: "+ nome);
		System.out.println(" idade: " + idade + " anos");
		df.applyPattern("0.00"); // defini quantas casas decimais 
		System.out.println(" altura: " + df.format(altura));
		s.close();
	}
}
