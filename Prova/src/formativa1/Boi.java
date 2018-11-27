package formativa1;

public class Boi {
	//Atributos
	private static int total=0;
	private String identificacao;
	private String status;
	private float peso;
	
	
	//Construtor
	public Boi( float modPeso){
		peso=modPeso;
		total++;
		identificacao="Boi"+total;
		if(modPeso<500)
			status= "RPR";
		else
			status="CRT";
	}
	
	// Metodos
	public double calcularVenda(double arroba){
		if(peso>=500){
			return arroba*peso/15;
		}
		return 0;
	}
	public String testaBoi(){
		if(status.equals("CRT")){
			return "Para Curral de corte!";
		}
		return "Para Curral de Reprodução";
	}
	
	//Metodos Getters e Setters
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Boi.total = total;
	}
}