package arquivos;

import javax.sql.rowset.serial.SerialException;

public class Contato extends SerialException {
	private String nome,endereco,telefone;
	
	public Contato(String modNome) {
		nome=modNome;
	}

	public Contato(String modnome, String modtelefone) {
		this.nome=modnome;
		setTelefone(modtelefone);
	}

	public Contato(String modnome, String modtelefone, String modendereco) {
		setNome(modnome);
		setTelefone(modtelefone);
		setEndereco(modendereco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
