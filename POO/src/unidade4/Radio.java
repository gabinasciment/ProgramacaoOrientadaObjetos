package unidade4;

public class Radio extends Eletrodomestico {
	private int banda;
	private int volume;
	private double sintonia;
	private static final int FM = 1;
	private static final int AM = 2;

	public Radio(int voltagem) {
		super(voltagem);
	}

	public int getBanda() {
		return banda;
	}

	public void setBanda(int banda) {
		this.banda = banda;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public double getSintonia() {
		return sintonia;
	}

	public void setSintonia(double sintonia) {
		this.sintonia = sintonia;
	}

	public static int getFm() {
		return FM;
	}

	public static int getAm() {
		return AM;
	}

	public void desligar() {
		this.sintonia= 0;
		this.volume= 0;
		this.setLigado(false);
	}

	public void ligar() {
		this.setBanda(FM);
		this.setSintonia(88.1);
		this.setVolume(10);
		this.setLigado(true);
	}

	@Override
	public String toString() {
		return "Radio [banda=" + banda + ", volume=" + volume + ", sintonia=" + sintonia + "]";
	}
	
	

}
