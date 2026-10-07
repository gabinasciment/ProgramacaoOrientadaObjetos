package unidade4;

public class Gato  extends Animal{

	public Gato(String nome, String raca) {
		super(nome, raca);
	}
	
	
	public String caminha() {
		return "O " + this.getNome()  + " esta saltando";
	}

	public String comunica() {
		return "Miau";
	}
	

}
