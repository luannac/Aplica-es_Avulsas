package Conta3;

public class TestaConta3Teste1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente luann = new Cliente("Luann", "Campos");
		Conta3 conta1 = new Conta3(123,0,luann);
		
		conta1.depositar(300);
		if(conta1.sacar(400))
			System.out.println("Ok "+conta1.getSaldo());
		else
			System.out.println("Furou");
		
		System.out.println(conta1.getTitular().getNome());
	}

}
