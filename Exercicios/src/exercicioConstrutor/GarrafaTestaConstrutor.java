package exercicioConstrutor;

import javax.swing.JOptionPane;

public class GarrafaTestaConstrutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garrafa garrafa[]= new Garrafa[4];
		garrafa[0]=new Garrafa();
		garrafa[1]=new Garrafa("Vidro");
		garrafa[2]=new Garrafa(1000);
		garrafa[3]=new Garrafa(JOptionPane.showInputDialog(null,"Digite o material da garrafa:"),Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a capacidade da garrafa:")));
		
		for(int i =0 ;i<4;i++){
			garrafa[i].mostrarConteudo();
		}
	}

}