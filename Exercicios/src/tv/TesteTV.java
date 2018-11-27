package tv;

import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TesteTV {
		/**********************************Atributos********************/
		private static TV tv= new TV();
		
		/**********************************************Main*********************************/
		public static void main(String[] args) {
			int resp = 0;
			do{
				resp = menu();
				if(resp==0)
					tv.ligar();
				if(resp==1)
					tv.desligar();
				if(resp==2)
					volume();
				if(resp==3)
					canal();
				if(resp==4)
					status();
				
			}while(resp!=5);

		}
		/******************************Metodos Do Menu e suas Funcionalidades*****************/
		public static int menu(){
			String sOpcoes[]= {"Ligar","Desligar","Volume","Canal","Status","Sair"};
			ImageIcon img;
			if(tv.isbLigado())
				img = new ImageIcon("src/tv/imagensTv/jornal.jpg");
			else
				img = new ImageIcon("src/tv/imagensTv/desligada.jpg");
			return JOptionPane.showOptionDialog(null, null, "Menu", 1, 1, img, sOpcoes, "Ligar");
		}
		
		/*************************************/
		private static void volume() {
			byte resp;
			String opcoes[]= {"Aumentar","Diminuir","Voltar"};
			do{
				resp = (byte) JOptionPane.showOptionDialog(null,"Volume atual "+tv.getbVolume()+"\nDeseja aumentar o volume", "Volume", 1, 1, null, opcoes, "Aumentar");
				if(resp==0)
					tv.aumentaVolume();
				if(resp==1)
					tv.diminuirVolume();
			}while(resp!=2);
		}
		/*************************************/
		private static void canal() {
				tv.mudarCanal(Integer.parseInt(JOptionPane.showInputDialog("Digite o Canal que deseja(0-700)")));
		}
		/*************************************/
		private static void status(){
			JOptionPane.showMessageDialog(null, "Ligada: "+tv.isbLigado()+"\nCanal: "+tv.getiCanalAtual()+"\nVolume: "+tv.getbVolume());
		}
	

}
