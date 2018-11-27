package exercicioFixacao2;

public class Pessoa {
	private String nome;
	private double altura;
	private String sexo;
	
	public double calculoPesoIdeal(){
		if(sexo.equals("Masculino")){
			return (72.7*altura)-58;
		}else{
			return (62.1*altura)-44.7;
		}
	}
	
	
	//Metodos Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

}
