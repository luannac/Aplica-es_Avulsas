package ExercicioComentado;

import javax.swing.JOptionPane;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno[] aluno=new Aluno[5];
		String stri = "";
		
		for(int i=0;i<aluno.length;i++){
			aluno[i]=new Aluno(JOptionPane.showInputDialog("Digite o nome: ")
					,Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota"))
					,Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota")));
		}
		for (int i = 0; i < aluno.length; i++) {
			aluno[i].calularMedia();
			stri+="\n"+aluno[i].mostraStatus();
		}
		JOptionPane.showMessageDialog(null, stri);
		}
}