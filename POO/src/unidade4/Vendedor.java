package unidade4;

public class Vendedor extends Funcionario {
	private double comissao;

	public Vendedor(String nome, int matricula, double comissao) {
		super(nome, matricula);
		this.comissao = comissao;
		// TODO Auto-generated constructor stub
	}
	public double getComissao() {
		return comissao;
	}


	public void setComissao(double comissao) {
		this.comissao = comissao;
	}


	@Override
	public String toString() {
		return "Vendedor [getNome()=" + getNome() + ", getMatricula()=" + getMatricula() + "]";
	}
	
	public double calculaSalario() {
		return Funcionario.getSalario_base() +  this.comissao;
	}
	

}
