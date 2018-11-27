package conta4;

import javax.swing.JOptionPane;

public class Conta4 extends Cliente4 {
	private double saldo;
	private double limite;
	private int numero;
	//private Cliente4 titular;
	private static int total;
	
	public Conta4(){
		Conta4.setTotal(getTotal()+1);
	}
	
	public Conta4(int num,String nome,String sobrenome,String cpf,double saldoPass,double limitespass){
		//titular = new Cliente4(nome,sobrenome,cpf);
		setSaldo(saldoPass);
		setLimite(limitespass);
		Conta4.setTotal(getTotal()+1);
	}
	
	//Metodos 
	public boolean sacar(double valor){
		if(getLimite()+getSaldo()<valor&&getLimite()+getSaldo()<0){
			return false;
		}else{
			setSaldo(getSaldo()-valor);
			//defineLimite();
			return true;
		}
	}
	public void depositar(double valor){
		setSaldo(getSaldo()+valor);
		//defineLimite();
	}
	/*
	 private void defineLimite(){
		if(getSaldo()>0)
			setLimite(getSaldo()*0.15);
		else
			setLimite(0);
	}*/
	public void tranfere(Conta4 destino,double valor){
		if(!sacar(valor)){
			JOptionPane.showMessageDialog(null, "Saldo Insificiente.");
		}else
			destino.depositar(valor);
	}
	
	
	//Metodos Getters e Setters
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		//defineLimite();
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/*
	public Cliente4 getTitular() {
		return titular;
	}

	public void setTitular(Cliente4 titular) {
		this.titular = titular;
	}
*/
	
	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Conta4.total = total;
	}
	
	
	

}
