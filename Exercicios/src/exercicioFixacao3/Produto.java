package exercicioFixacao3;

public class Produto {
	private String codigo;
	private double preco;
	
	public Produto buscar(String cod,Produto[] ob){
		for (int i = 0; i < ob.length; i++) {
			if(ob[i].codigo.equals(cod)){
				return ob[i];
			}
		}
		return null;
	}
	public double total(int quant,Produto p){
		return p.getPreco()*quant;
	}
	
	//Construtor
	public Produto(String cod,double prec){
		setCodigo(cod);
		setPreco(prec);
	}
	
	//Metodos Getters e Setters
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
