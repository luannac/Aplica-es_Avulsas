package exercicioFixacao2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] op={"Sim","Não"};
		int opcao;
		String[] sexo={"Masculino","Feminino"};
		Pessoa pessoa=new Pessoa();
		do{
			pessoa.setNome((String)JOptionPane.showInputDialog("Digite o nome"));
			pessoa.setSexo((String)JOptionPane.showInputDialog(null,"Qual o sexo de "+pessoa.getNome(),
							"Sexo",JOptionPane.INFORMATION_MESSAGE,null,sexo,"Masculino"));
			pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura de "+pessoa.getNome()+":")));
			JOptionPane.showMessageDialog(null, "O peso ideal de "+pessoa.getNome()+" é igual a "+pessoa.calculoPesoIdeal());
			opcao=JOptionPane.showOptionDialog(null,"Deseja fazer de novo?","Final",JOptionPane.DEFAULT_OPTION,
												JOptionPane.QUESTION_MESSAGE,null,op,"Sim");
		}while(opcao==0);
		
	}

}
