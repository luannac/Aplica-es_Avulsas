package CarroEustaquio;

import javax.swing.JOptionPane;

public class Carro {
	
	private boolean booLigado;
	private byte bytVelocidade;
	private String strCor,strPlaca;
	private short shoAno;
	
	//Construtor
	public Carro(String strCor, String strPlaca, short shoAno) {
		super();
		this.strCor = strCor;
		this.strPlaca = strPlaca;
		this.shoAno = shoAno;
	}
	
	//Metodos
	public void acelerar(byte ac) {
		if(isBooLigado()) {
			if(getBytVelocidade()<120) 
				setBytVelocidade((byte)(getBytVelocidade()+ac));
			else
				JOptionPane.showMessageDialog(null, "Carro não aguenta mais");
			
		}else
			JOptionPane.showMessageDialog(null,"Carro está desligado");
	}
	public void frear(byte ac) {
		if(isBooLigado()) {
			if(getBytVelocidade()>0) 
				setBytVelocidade((byte)(getBytVelocidade()-ac));
			else 
				JOptionPane.showMessageDialog(null, "O Carro está parado");
		}else
			JOptionPane.showMessageDialog(null, "O Carro está desligado");
		
	}
	public void ligar() {
		if(isBooLigado()) {
			JOptionPane.showMessageDialog(null, "Carro já está ligado");
		}else {
			setBooLigado(true);
			SoundPLAY sp = new SoundPLAY("src/CarroEustaquio/Carro ligando.wav");
			sp.play();
		}
	}
	public void desligar() {
		if(isBooLigado()) {
			if(getBytVelocidade()>0)
				JOptionPane.showMessageDialog(null, "Carro em movimento não pode desligar.");
			else
				setBooLigado(false);
		}else
			JOptionPane.showMessageDialog(null, "Carro já está desligado");
	}
	public String status() {
		if(isBooLigado())
			return "src\\CarroEustaquio\\imagens\\onOff.jpg";
		else
			return "src\\CarroEustaquio\\imagens\\off.jpg";
	}
	
	//Getters e Setters

	public boolean isBooLigado() {
		return booLigado;
	}
	private void setBooLigado(boolean booLigado) {
		this.booLigado = booLigado;
	}
	public byte getBytVelocidade() {
		return bytVelocidade;
	}
	private void setBytVelocidade(byte bytVelocidade) {
		this.bytVelocidade = bytVelocidade;
	}
	public String getStrCor() {
		return strCor;
	}
	public void setStrCor(String strCor) {
		this.strCor = strCor;
	}
	public String getStrPlaca() {
		return strPlaca;
	}
	public void setStrPlaca(String strPlaca) {
		this.strPlaca = strPlaca;
	}
	public short getShoAno() {
		return shoAno;
	}
	public void setShoAno(short shoAno) {
		this.shoAno = shoAno;
	}
}
