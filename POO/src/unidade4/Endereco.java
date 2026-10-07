package unidade4;

public class Endereco {

	private String logradouro,complemento,bairro,cidade, estado,CEP;
	private int numero;
	
	public Endereco(String logradouro, int numero,String complemento, String bairro, String cidade,String estado, String CEP ) {
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.CEP = CEP;
		this.numero = numero;
	}
	
	public Endereco( ) {
		this.logradouro = "";
		this.complemento = "";
		this.bairro = "";
		this.cidade= "";
		this.estado = "";
		this.CEP = "";
		this.numero =  0;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Endereco: logradouro= " + logradouro + ", complemento= " + complemento + ", bairro= " + bairro
				+ ", estado= " + estado + ", CEP= " + CEP + ", numero= " + numero + "]";
	}
	
	
	
	
	
}
