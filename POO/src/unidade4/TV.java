package unidade4;

public class TV extends Eletrodomestico {
	private int canal;
	private int volume;
	private int tamanho;

	public TV(int voltagem,int tamanho) {
		super(voltagem);
		this.tamanho = tamanho;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getTamanho() {
		return tamanho;
	}


	public void desligar() {
		this.canal =0;
		this.volume =0;
		this.setLigado(false);
	}

	public void ligar() {
		this.setCanal(1);
		this.setVolume(10);
		this.setLigado(true);
	}
}
