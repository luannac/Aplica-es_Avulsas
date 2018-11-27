package tv;

import javax.swing.JOptionPane;

public class TV {
	//Atributos
	private boolean bLigado;
	private int iCanalAtual;
	private byte bVolume;
	
	//Construtor
	public TV(){
		bVolume=50;
		iCanalAtual=400;
		bLigado=false;
	}
	//Metodos
	public void aumentaVolume(){
		if(tvLigada()){
			if(bVolume<100)
				bVolume+=5;
			else
				JOptionPane.showMessageDialog(null, "Volume está no Máximo!");
		}
	}
	public void diminuirVolume(){
		if(tvLigada()){
			if(bVolume>0)
				bVolume-=5;
			else
				JOptionPane.showMessageDialog(null, "Volume está no Minimo!");
		}
	}
	public void ligar(){
		if(bLigado)
			JOptionPane.showMessageDialog(null, "TV já está Ligada!");
		else
			bLigado=true;
	}
	public void desligar(){
		if(bLigado)
			bLigado=false;
		else
			JOptionPane.showMessageDialog(null, "TV já está Desligada!");
	}
	public void mudarCanal(int canal){
		if(tvLigada()){
			if(canal>700 || canal<0)
				JOptionPane.showMessageDialog(null, "Canal selecionado não existe");
			else
				setiCanalAtual(canal);
		}
	}
	private boolean tvLigada(){
		if(bLigado)
			return true;
		else
			JOptionPane.showMessageDialog(null, "TV Desligada\nLigue");
		return false;
	}
	
	//Getters e Setters
	public boolean isbLigado() {
		return bLigado;
	}

	public void setbLigado(boolean bLigado) {
		this.bLigado = bLigado;
	}

	public int getiCanalAtual() {
		return iCanalAtual;
	}

	public void setiCanalAtual(int iCanalAtual) {
		this.iCanalAtual = iCanalAtual;
	}

	public byte getbVolume() {
		return bVolume;
	}

	public void setbVolume(byte bVolume) {
		this.bVolume = bVolume;
	}
}
