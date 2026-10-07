package unidade4;

public class Tv001  extends TV implements iControleRemoto{

	public Tv001(int voltagem, int tamanho) {
		super(voltagem, tamanho);
	}
	
	public void mudarCanal(int novoCanal) {
		super.setCanal(novoCanal);
	}
	
	public void aumentarVolume(int unidade) {
		super.setVolume(this.getVolume() + unidade);
	}
	
	public void diminuirVolume(int unidade) {
		super.setVolume(this.getVolume() - unidade);
	}
	
	public void ligar() {
		if (!super.isLigado()) {
			super.setLigado(true);
		}
	}
	public void desligar() {
		if (super.isLigado()) {
			super.setLigado(false);
		}
	}

	

	
	
	

}
