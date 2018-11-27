package exercicioDeAprendizagemMath;

import java.util.Scanner;

public class MathExer7 {
	public static void main(String args[]){
		
		Classe classe = new Classe(15);
		Aluno al;
		
		Scanner sc[] = new Scanner[classe.alunos.length];
		
		for(int i=0;i<classe.alunos.length;i++){
			sc[i] =new Scanner(System.in);
			System.out.println("Digite o nome:");
			classe.alunos[i].nome= sc[i].nextLine();
			System.out.println("Digite a media:");
			classe.alunos[i].media= sc[i].nextFloat();
		}
		
		al=classe.mediaMax();
		System.out.println("A maior media pertence a "+al.nome+"\n"
							+ "Sua media foi "+al.media);
		al=classe.mediaMin();
		System.out.println("A menor media pertence a "+al.nome+"\n"
							+ "Sua media foi "+al.media);
	}

	
}

	class Aluno{
	String nome;
	float media;
}
	class Classe{
		Aluno[] alunos;
		
		public Classe(int numero){
			alunos = new Aluno[numero];
			for(int i=0;i<numero;i++){
				alunos[i]= new Aluno();
			}
		}
		Aluno mediaMax(){
			Aluno al = null;
			for(int i =0; i<alunos.length;i++){
				if(i==0)
					al=alunos[i];
				else{
					if(alunos[i].media>al.media)
						al=alunos[i];
				}
			}
			return al;
		}
		Aluno mediaMin(){
			Aluno al = null;
			for(int i =0; i<alunos.length;i++){
				if(i==0)
					al=alunos[i];
				else{
					if(alunos[i].media<al.media)
						al=alunos[i];
				}
			}
			return al;
		}
	}