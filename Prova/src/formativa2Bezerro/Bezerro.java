package formativa2Bezerro;

public class Bezerro {
	private static int total;
	private float peso;
	private String id;
	private boolean mamando;
	
	//Construtor
	public Bezerro(float peso,boolean mamando){
		total++;
		id = "Bez"+(total);
		this.peso=peso;
		this.mamando=mamando;
	}
	
	//metodos
	public String status(){
		if(peso>300)
			return "Para engorda";
		else
			return "Pronto para Venda";
	}
	public double calcularVenda(double valorPeso){
		if(!mamando && peso<=300)
			return	peso*valorPeso;
		else
			return 0;
	}
	
	//Getters e Setters
	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		Bezerro.total = total;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isMamando() {
		return mamando;
	}
	public void setMamando(boolean mamando) {
		this.mamando = mamando;
	}
	
}
