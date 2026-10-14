package unidade4;

public class Circulo extends ElementoGeometrico {
	private double raio;

	public Circulo(double x, double y, double raio) {
		super(x, y);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}


	@Override
	public void redimensionar(double fator) {
		this.raio *= fator;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(this.raio, 2);
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * this.raio;
	}

	@Override
	public String toString() {
		return "Círculo - " + super.toString() + ", Raio: " + raio;
	}
}
