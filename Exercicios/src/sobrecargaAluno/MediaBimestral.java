package sobrecargaAluno;

public class MediaBimestral extends Aluno {
	private float media;
	
	//Construtor
	public MediaBimestral(String nome,String turma){
		this.nome= nome;
		this.tipoTurma= turma;
	}
	
	public float calculoMedia(float nota1,float nota2,float nota3,float nota4){
		return (nota1+nota2+nota3+nota4)/4;
	}
	public float calculoMedia(float nota1,float nota2,float nota3){
		return (nota1+nota2+nota3)/3;
	}
	public float calculoMedia(float nota1,float nota2){
		return (nota1+nota2)/2;
	}
	
	
	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}
	
}
