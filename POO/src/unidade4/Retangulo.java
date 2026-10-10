package unidade4;

public class Retangulo extends ElementoGeometrico {
	private double lado1,lado2;
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



	public void desenhar() {
		System.out.println("A forma está sendo desenhada");
	}
	
	public void redimensionar(double x) { this.setY(x);}
	public double calcularArea() { return this.getLado1() * this.getLado2();}
	public double calcularPerimetro() {return  (2 * this.getLado1()) + (2 * this.getLado2());}
	
	

	

}
