package unidade4;

public  abstract class ElementoGeometrico implements iCalculoGeometrico {
	private double x;
	private double y;
	public ElementoGeometrico(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public void desenhar() {}
	public void redimensionar(double r) {}
	public double calcularArea() {return 0.0;}
	public double calcularPerimetro() {return 0.0;}
	
	
	
	
	
	

}
