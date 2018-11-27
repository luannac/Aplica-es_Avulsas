package polimorfismoCalculadora;

public class Subtracao extends Calculadora {
	public Subtracao(double x1, double x2) {
		this.x1=x1;
		this.x2=x2;
	}
	public double calcular() {
		return x1-x2;
	}
	
}
