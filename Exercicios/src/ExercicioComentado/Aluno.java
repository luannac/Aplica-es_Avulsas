package ExercicioComentado;

public class Aluno {
	private String nome;
	private double[] nota=new double[2];
	private double media;
	private String status;
	
	//Metodos
	void calularMedia(){
		setMedia((getNota()[0]+getNota()[1])/2);
		
	}
	public String mostraStatus(){
		if (getMedia()>=5) {
			setStatus("Aprovado");
			return getNome()+" Aprovado";
		} else {
			setStatus("Reprovadp");
			return getNome()+" Reprovado";
		}
	}
	
	
	//Construtor
	public Aluno(String nom,double nota1,double nota2){
		setNome(nom);
		setNota(nota1,0);
		setNota(nota2,1);
	}
	
	//Metodos Getters e Setters
	public double[] getNota() {
		return nota;
	}
	public void setNota(double nota,int i) {
		this.nota[i] = nota;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
