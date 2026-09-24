package unidade3;

public class Pessoa {
	private String name;
	private String cpf;
	private static int quant = 0;

	public Pessoa(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
		Pessoa.quant++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public static int getQuant() {
		return quant;
	}

	@Override
	public String toString() {
		return "Nome:" + name + "cpf: " + cpf + "";
	}
	
	
	
	

}
