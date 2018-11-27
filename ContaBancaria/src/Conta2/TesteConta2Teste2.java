package Conta2;

public class TesteConta2Teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta2 c1 = new Conta2();
		c1.setNome("Patolino");
		c1.depositar(400);
		Conta2 c2=new Conta2();
		c2.setNome("Patolino");
		c2.depositar(400);
		if(c1==c2){
			System.out.println("São iguais.");
		}else
			System.out.println("Que Doideira");

	}

}
