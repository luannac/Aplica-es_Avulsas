package Conta2;

public class TesteConta2Teste1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta2 c1 = new Conta2();
		c1.depositar(600);
		Conta2 c2=new Conta2();
		c2.depositar(400);
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
	}

}
