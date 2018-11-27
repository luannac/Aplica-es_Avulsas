package Conta1;

import javax.swing.JOptionPane;

public class Conta1 {
	//Atributos
	private int numero;
	private String nome;
	private double saldo,limite;
	
	//metodos 
	public void sacar(double valor){
		if(valor<saldo){
			saldo-=valor;
			defineLimite();
		}else{
			JOptionPane.showMessageDialog(null,"Saldo Insuficiente");
		}
	}
	public void depositar(double valor){
		saldo+=valor;
		defineLimite();
	}
	private void defineLimite(){
		if(saldo>0){
			limite=saldo*0.20;
		}
	}
	
	//Metodos Getters Setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		defineLimite();
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	

}
