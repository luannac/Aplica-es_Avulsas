package Conta2;

import javax.swing.JOptionPane;

public class Conta2 {
	private double saldo;
	private String nome;
	private double limite;
	private int numero;
	
	public Conta2(){
		
	}
	
	public Conta2(int num,double sal,String nom){
		setSaldo(sal);
		setNumero(num);
		setNome(nom);
		
	}
	
	//Metodos 
	public boolean sacar(double valor){
		if(getLimite()+getSaldo()<valor&&getLimite()+getSaldo()<0){
			return false;
		}else{
			setSaldo(getSaldo()-valor);
			defineLimite();
			return true;
		}
	}
	public void depositar(double valor){
		setSaldo(getSaldo()+valor);
		defineLimite();
	}
	private void defineLimite(){
		if(getSaldo()>0)
			setLimite(getSaldo()*0.15);
		else
			setLimite(0);
	}
	public void tranfere(Conta2 destino,double valor){
		if(!sacar(valor)){
			JOptionPane.showMessageDialog(null, "Saldo Insificiente.");
		}else
			destino.depositar(valor);
	}
	
	
	//Metodos Getters e Setters
	public double getSaldo() {
		return saldo;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
		defineLimite();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getLimite() {
		return limite;
	}
	private void setLimite(double limite) {
		this.limite = limite;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}
