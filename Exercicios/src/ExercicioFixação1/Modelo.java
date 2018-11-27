package ExercicioFixação1;

public class Modelo {
	private String nome;
	private String masculino;
	
	public String direcionarCandidato(int senha){
		if(masculino.equals("masculino")){
			if(senha%2==0)
				return getNome()+" ira para sala 1";
			else
				return getNome()+" ira para sala 3";
		}else{
			if(senha%2==0)
				return getNome()+" ira para sala 2";
			else
				return getNome()+" ira para sala 4";
		}
	}
	
	
	//Metodos Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMasculino() {
		return masculino;
	}
	public void setMasculino(String object) {
		this.masculino = object;
	}
	
	
}
