package exercicioConstrutor;

import javax.swing.JOptionPane;

public class Garrafa {
	private String tipoMaterial;
	private int capacidade;
	
	//Construtores
	public Garrafa(){
		
	}
	public Garrafa(String tipo) {
		tipoMaterial=tipo;
	}
	public Garrafa(int i) {
		capacidade=i;
	}
	public Garrafa(String tipo, int capacidademe) {
		tipoMaterial=tipo;
		capacidade=capacidademe;
	}
	
	//Metodos
	public void mostrarConteudo(){
		JOptionPane.showMessageDialog(null,"Tipo de Material: "+tipoMaterial+"\nCapacidade: "+capacidade);
	}
	
	//Getters e Setters
	public String getTipoMaterial() {
		return tipoMaterial;
	}
	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	
}
