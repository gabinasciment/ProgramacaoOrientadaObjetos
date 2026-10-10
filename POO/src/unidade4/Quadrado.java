package unidade4;

public class Quadrado  extends Retangulo{

	public Quadrado(double x, double y, double lado1, double lado2) {
		super(x, y, lado1, lado2);
	}
	
	
	public void redimensionar(double x) { this.setY(x);}
	public double calcularArea() { return Math.sqrt(getX());}
	public double calcularPerimetro() {return  (4 * super.getX());}
	

}
