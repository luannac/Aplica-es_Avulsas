package Exercicios_de_Sala;

import java.text.DecimalFormat; 
public class CalCombustivel {

	public static void main(String[] args) {
		double t=2,v=100,s=12,c;
		
		c=(t*v)/s;
		
	    DecimalFormat df = new DecimalFormat (); 

	    df.applyPattern("##.#");  
		System.out.println("Gastou-se "+df.format(c)+" litros.");
	}

}
