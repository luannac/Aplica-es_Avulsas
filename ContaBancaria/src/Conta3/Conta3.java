package Conta3;

import javax.swing.JOptionPane;

public class Conta3 {
	private double saldo;
	private double limite;
	private int numero;
	private Cliente titular;
	
	public Conta3(){
		
	}
	
	public Conta3(int num,double sal,Cliente titu){
		setSaldo(sal);
		setNumero(num);
		setTitular(titu);;
		
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
	public void tranfere(Conta3 destino,double valor){
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

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	

}
