package unidade4;

public class Gerente extends  Funcionario{

	public Gerente(String nome, int matricula) {
		super(nome, matricula);
		// TODO Auto-generated constructor stub
	}

	
	public double calculaSalario() {
		return Funcionario.getSalario_base() * 2;
	}


	@Override
	public String toString() {
		return "Gerente [getNome()=" + getNome() + ", getMatricula()=" + getMatricula() ;
	}
	
	
	
	
	
	
	

}
