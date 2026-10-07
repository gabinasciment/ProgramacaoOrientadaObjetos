package unidade4;

public class MaquinaDeLavar extends Eletrodomestico {
	private int opcaoDeLavagem;

	public MaquinaDeLavar( int voltagem) {
		super( voltagem);
	}
	

	public int getOpcaoDeLavagem() {
		return opcaoDeLavagem;
	}

	public void setOpcaoDeLavagem(int opcaoDeLavagem) {
		this.opcaoDeLavagem = opcaoDeLavagem;
	}

	public void desligar() {
		this.setOpcaoDeLavagem(0); // ou o this.atributo pois estava dentro da própria lavagem
		this.setLigado(false);

	}

	public void ligar() {
		this.setLigado(true);
		this.setOpcaoDeLavagem(1);
		
	}

	@Override
	public String toString() {
		return "MaquinaDeLavar [opcaoDeLavagem=" + opcaoDeLavagem + "]";
	}
	
	

}
