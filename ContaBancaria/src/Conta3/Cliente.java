package Conta3;

public class Cliente {
	private String nome;
	private String sobrenome;
	private String cpf;
	
	//Construtor
	Cliente(String nome,String sobrenome){
		setNome(nome);
		setSobrenome(sobrenome);
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
