package conta4;

public class TestaConta4{

	public static void main(String[] args) {

		Conta4 conta = new Conta4(1,"Josenildo","Silva","01204622545",3000.00,1200.00);
		
		System.out.println(conta.getTitular().getNome()+" "+conta.getTitular().getSobrenome()+" "+conta.getTitular().getCpf());
		System.out.println("Saldo: R$"+conta.getSaldo());
		System.exit(0);
	}

}
