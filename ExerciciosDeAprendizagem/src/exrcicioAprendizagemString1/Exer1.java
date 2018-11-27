package exrcicioAprendizagemString1;

import javax.swing.JFrame;

public class Exer1{
		public static void main(String args[]){
			javax.swing.SwingUtilities.invokeLater(
					new Runnable(){
						public void run(){
							Janela jl = new Janela();
							jl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						}
					});
		}
	}