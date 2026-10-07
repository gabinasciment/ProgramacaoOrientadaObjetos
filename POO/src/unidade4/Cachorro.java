package unidade4;

public class Cachorro extends Animal{

	public Cachorro(String nome, String raca) {
		super(nome, raca);
	}
	
	public String caminha() {
		return "O " + this.getNome()  + " esta correndo";
	}

	public String comunica() {
		return "Au au";
	}
	
	

}
