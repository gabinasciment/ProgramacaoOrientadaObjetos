package unidade4;

public class Retangulo extends ElementoGeometrico {
	private double lado1, lado2;

	public Retangulo(double x, double y, double lado1, double lado2) {
		super(x, y);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}



	@Override
	public void redimensionar(double fator) {
		this.lado1 *= fator;
		this.lado2 *= fator;
	}

	@Override
	public double calcularArea() {
		return this.lado1 * this.lado2;
	}

	@Override
	public double calcularPerimetro() {
		return (2 * this.lado1) + (2 * this.lado2);
	}

	@Override
	public String toString() {
		return "Retângulo - " + super.toString() + ", Lado1: " + lado1 + ", Lado2: " + lado2;
	}
}
