package unidade4;

//boa prática começar com o i para identificar que é uma interface
public interface iControleRemoto {
	//Interface não tem atributos nem métodos concretos, terá apenas métodos abstratos
	public void mudarCanal(int novoCanal);
	public void aumentarVolume(int unidade);
	public void diminuirVolume(int unidade);
	public void ligar();
	public void desligar();
	

}
