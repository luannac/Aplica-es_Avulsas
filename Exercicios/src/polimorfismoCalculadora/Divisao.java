package polimorfismoCalculadora;

public class Divisao extends Calculadora {
	public Divisao(double x1, double x2) {
		this.x1=x1;
		this.x2=x2;
	}
	public double calcular() {
			return x1/x2;
	}
	
}
