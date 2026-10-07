package unidade4;

public class TvSDK extends Tv001 implements iControleRemoto {

	public TvSDK(int voltagem, int tamanho) {
		super(voltagem, tamanho);
	}
	
	
	public void ligarModerno() {
		this.ligar();
		System.out.println("Olá");
	}
	
	public void desligarModerno() {
		this.desligar();
		System.out.println("Thau");
	}

}
