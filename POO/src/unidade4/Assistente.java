package unidade4;

public class Assistente extends Funcionario {

	public Assistente(String nome, int matricula) {
		super(nome, matricula);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Assistente [getNome()=" + getNome() + ", getMatricula()=" + getMatricula() + "]";
	}
	
	public double calculaSalario() {
		return Funcionario.getSalario_base();
	}


}
