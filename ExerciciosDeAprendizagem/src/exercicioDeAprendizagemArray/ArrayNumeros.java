package exercicioDeAprendizagemArray;

public class ArrayNumeros {

	public static void main(String[] args) {
		float[] numeros = new float[10];
		for (int i=0;i<10;i++){
			numeros[i]=(int)(Math.random()*10);
			System.out.println(numeros[i]);
		}
		System.exit(0);
	}
}
