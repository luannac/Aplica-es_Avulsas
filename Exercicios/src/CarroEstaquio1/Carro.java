package CarroEstaquio1;

import javax.swing.JOptionPane;

public class Carro {
	
	//Atributos
	private boolean ligado;
	private float velocidade;
	private String cor;
	private short ano = 1976 ;
	private String placa;
	
	//Construtor
	public Carro(){
		setCor("Amarelo");
		setAno((short)1976);
		setPlaca("UDM-1114");
	}
	
	
	//Metodos
	public boolean ligar(){
		if(isLigado()){
			JOptionPane.showMessageDialog(null, "Carro já está Ligado.");
			return false;
		}
		setLigado(true);
		return true;
	}
	
	
	public boolean Desligar(){
		if(isLigado()){
			if(getVelocidade()>0){
				JOptionPane.showMessageDialog(null, "Você não pode Desligar com o carro em movimento.");
				return false;
			}
			setLigado(false);
			return true;
		}
		JOptionPane.showMessageDialog(null, "Carro já está desligado.");
		return false;
	}
	
	public void acelerar(short v){
		if(this.isLigado()){
			if(getVelocidade()<130)
				setVelocidade(getVelocidade()+v);
			else
				JOptionPane.showMessageDialog(null, "O carro não aguenta mais.");
		}else{
			JOptionPane.showMessageDialog(null, "O Carro Desligado.");
		}
	}
	
	public void desacelerar(short v){
		if(isLigado()){
			if(getVelocidade()>0)
				setVelocidade(getVelocidade()-v);
			else
				JOptionPane.showMessageDialog(null, "O carro já está parado.");
		}else{
			JOptionPane.showMessageDialog(null, "O Carro Desligado.");
		}
	}
	
	//Metodos Setters e Getters
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public float getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public short getAno() {
		return ano;
	}
	public void setAno(short ano) {
		this.ano = ano;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	
}
