package Somativa;

public class Animal {
	
	/************************Atributos**************************/
	private static float fValorTotal=0;
	private static byte bQuantTosa=0;
	private static byte bQuantbanho=0;
	
	private String sDonoNme;
	private String sAnimalNome;
	private int iTipo;//  0- para gato / 1 para cahorro
	private int iTamanho;// 0-pequeno,1-medio,2-grande
	private float fValorServico=0;
	
	/************************Construtores******************************/
	public Animal(String sModDonoNome,String sModAnimalNome){//****************Construtor Gato
		sDonoNme=sModDonoNome;
		sAnimalNome=sModAnimalNome;
		iTipo=0;
	}
	public Animal(String sModDonoNome,String sModAnimalNome,int iModTamanho){//*Construtor Cachorro
		sDonoNme=sModDonoNome;
		sAnimalNome=sModAnimalNome;
		iTipo=1;
		iTamanho=iModTamanho;
	}
	
	/************************Metodos******************************/
	public float banho(int iQuantidade){//*********Banho para Gatos
		float valor = iQuantidade*30;
		fValorTotal+=valor;
		fValorServico+=valor;
		bQuantbanho+=1;
		return valor;
	}
	public float banho(){//************************Banho para Cachorros
		float valor;
		if(iTamanho==0){
			valor = 22;
			fValorTotal+=valor;
			fValorServico+=valor;
			bQuantbanho+=1;
			return valor;
		}
		if(iTamanho==1){
			valor = 25;
			fValorTotal+=valor;
			fValorServico+=valor;
			bQuantbanho+=1;
			return valor;
		}
		valor = 28;
		fValorTotal+=valor;
		fValorServico+=valor;
		bQuantbanho+=1;
		return valor;
	}
	public float tosa(int iQuantidade){//**********Tosa para gatos
		float valor = iQuantidade*37;
		fValorTotal+=valor;
		fValorServico+=valor;
		bQuantTosa+=1;
		return valor;
	}
	public float tosa(){//*************************Tosa para cachorros
		float valor;
		if(iTamanho==0){
			valor = 27;
			fValorTotal+=valor;
			fValorServico+=valor;
			bQuantTosa+=1;
			return valor;
		}
		if(iTamanho==1){
			valor = 30;
			fValorTotal+=valor;
			fValorServico+=valor;
			bQuantTosa+=1;
			return valor;
		}
		valor = 33;
		fValorTotal+=valor;
		fValorServico+=valor;
		bQuantTosa+=1;
		return valor;
	}
	
	/************************Getters e Setters**************************/
	public String getsDonoNme() {
		return sDonoNme;
	}
	public void setsDonoNme(String sDonoNme) {
		this.sDonoNme = sDonoNme;
	}
	public String getsAnimalNome() {
		return sAnimalNome;
	}
	public void setsAnimalNome(String sAnimalNome) {
		this.sAnimalNome = sAnimalNome;
	}
	public int getsTipo() {
		return iTipo;
	}
	public void setsTipo(int iTipo) {
		this.iTipo = iTipo;
	}
	public int getsTamanho() {
		return iTamanho;
	}
	public void setsTamanho(int iTamanho) {
		this.iTamanho = iTamanho;
	}
	public float getfValorServico() {
		return fValorServico;
	}
	public void setfValorServico(float fValorServico) {
		this.fValorServico = fValorServico;
	}
	public static byte getbQuantTosa() {
		return bQuantTosa;
	}
	public static byte getbQuantbanho() {
		return bQuantbanho;
	}
	public static float getfValorTotal() {
		return fValorTotal;
	}
	public static void setfValorTotal(float fValorTotal) {
		Animal.fValorTotal = fValorTotal;
	}
}