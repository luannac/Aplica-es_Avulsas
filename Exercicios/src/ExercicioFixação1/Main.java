package ExercicioFixação1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modelo[] modelo=	new Modelo[5];
		String[] opcao= {"masculino","feminino"};
	
		for (int i = 0; i <modelo.length; i++) {
			modelo[i]= new Modelo();
			modelo[i].setNome(JOptionPane.showInputDialog("Digite o nome: "));
			modelo[i].setMasculino((String) JOptionPane.showInputDialog(null,"Qual o sexo?" ,"Questão" , JOptionPane.QUESTION_MESSAGE,null, opcao,"masculino"));
			
		}
		
		for (int i = 0; i < modelo.length; i++) {
			JOptionPane.showMessageDialog(null, modelo[i].direcionarCandidato(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a senha do(a)"+modelo[i].getNome()))));
		}
	}

}
