package Entradas;

import java.io.*;
class EntradaComBufferedReader {
	public static void main(String[] args){
		String s = "";
		BufferedReader dado;
		try {
			System.out.println("entre com um nome ");
			dado = new BufferedReader( new InputStreamReader(System.in)); //Objeto
			s = dado.readLine();
			System.out.println(s);
		}
		catch(IOException erro){
			System.out.println(erro.toString());
		}
		catch(NumberFormatException erro){	
			System.out.println("conversão" + erro.toString());
		}
	}
} 
