package unidade4;

public class Papagaio extends Animal{

	public Papagaio(String nome, String raca) {
		super(nome, raca);
	}
	
	
	public String caminha() {
		return "O " + this.getNome()  + " esta voando";
	}

	public String comunica() {
		return "Loro";
	}

}
