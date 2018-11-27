package Conta1;

public class TesteConta1 {

	public static void main(String[] args) {
		int i;

		Conta1[] conta= new Conta1[3];
		for(i=0;i<3;i++){
			conta[i]= new Conta1();
		}

		conta[0].setNome("Josenildo");
		conta[0].setNumero(123);
		conta[0].setSaldo(200.45);
		
		conta[1].setNumero(133);
		conta[1].setNome("Helioheleno");
		conta[1].setSaldo(20098.87);
		
		conta[2].setNome("Malba");
		conta[2].setNumero(224);
		conta[2].setSaldo(1260.45);
		
		for(i=0;i<3;i++){
			System.out.println("\n\nInformação do Cliente "+conta[i].getNumero());
			System.out.println("Nome: "+conta[i].getNome());
			System.out.println("Saldo: "+conta[i].getSaldo());
			System.out.println("Limite: "+conta[i].getLimite());
		}
			

	}

}
