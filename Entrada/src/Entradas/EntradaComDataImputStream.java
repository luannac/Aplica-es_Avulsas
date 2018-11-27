package Entradas;

import java.io.*; //”*”importa todo pacote java.io
class EntradaComDataInputStream {
	public static void main(String[] args){
		String s= "";
		DataInputStream dado;
		try { //tratamento do erro 
			System.out.println("entre com um nome ");
			dado = new DataInputStream(System.in); // Objeto 
			s = dado.readLine(); // método que captura caractere do teclado
			System.out.println(s);
		}
		catch(IOException erro){ // tratamento para erros de entreda e saída
			System.out.println(erro.toString());
		}
	                catch(NumberFormatException erro){ // tratamento do formato do número
			System.out.println("conversão" + erro.toString());
		}
	}

}