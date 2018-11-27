package Conta2;

public class TesteConta2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		Conta2[] conta=new Conta2[3]; 
		conta[0]= new Conta2(123,200.45,"Josenildo");
		conta[1]=new Conta2(224,1260.45,"Malba");
		conta[2]=new Conta2(133,20098.87,"Helioheleno");
		
		System.out.println(conta[0].getLimite());
		System.out.println(conta[0].getSaldo());
		
		if(conta[0].sacar(120)){
			System.out.println("To ostentando");
		}else{
			System.out.println("Empresta ai");
		}
		
		conta[0].tranfere(conta[2], 80);
		
		System.out.println(conta[0].getSaldo());
		
		conta[2].sacar(3500);
		conta[1].depositar(40);
		
		for(i=0;i<3;i++){
			System.out.println("\nInformações do Cliente "+conta[i].getNumero());
			System.out.println("Nome: "+conta[i].getNome());
			System.out.println("Saldo: "+conta[i].getSaldo());
			System.out.println("Limite: "+conta[i].getLimite());
		}
	}

}
