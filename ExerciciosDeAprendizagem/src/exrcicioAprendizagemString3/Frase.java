package exrcicioAprendizagemString3;

public class Frase{
	String palavra,frase;
	
	int luannIndexOf(){
		int numero=0;
	    
	    int n = -1; 
	    do{ 
	    
	      n = frase.indexOf(palavra, n + 1);
	      if(n == -1) 
	        break; 
	      else 
	    	  numero++;
	    }while(true);
		return numero;
	}
}