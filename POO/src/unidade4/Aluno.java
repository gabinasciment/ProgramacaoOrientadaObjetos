package unidade4;

public class Aluno extends Pessoa {
	private String matricula;

	public Aluno(String nome, int idade, Endereco endereco, String matricula) {
		super(nome, idade, endereco);
		this.matricula = matricula;
	}
	public Aluno(String nome, int idade, String matricula) {
		super(nome, idade);
		this.matricula = matricula;
	}
	public Aluno() {
		super();
		this.matricula = "";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@Override
	public String toString() {
		return super.toString() + " Matricula: " + matricula;
	}
	
	//a palavra super indica o superclasse
	//this inidica atributos da classe em si
	
	
	
	
	

}
