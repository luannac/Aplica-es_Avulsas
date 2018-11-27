package arquivos;

import java.util.ArrayList;

public class Agenda extends ArrayList<Contato> {

	
	// Metodos para adicionar Contatos
	public void novoContato(String nome) {
		Contato novoContato= new Contato(nome);
		this.add(novoContato);
	}
	public void novoContato(String nome,String telefone) {
		Contato novoContato= new Contato(nome,telefone);
		this.add(novoContato);
	}
	public void novoContato(String nome,String telefone,String endereco) {
		Contato novoContato= new Contato(nome,telefone,endereco);
		this.add(novoContato);
	}
	
}
