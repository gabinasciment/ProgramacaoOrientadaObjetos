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
	
	public void desenhar() {
		System.out.println("A forma está sendo desenhada");
	}
	
	public void redimensionar(double r) { this.setRaio(r);}
	public double calcularArea() { return Math.PI * (Math.pow(this.getRaio(),2));}
	public double calcularPerimetro() {return  2 * (Math.PI) * this.getRaio();}
	
	

	

}
