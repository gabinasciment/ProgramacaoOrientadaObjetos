package unidade4;

public abstract class ElementoGeometrico implements iCalculoGeometrico {
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

	@Override
	public String toString() {
		return "Posição: (" + x + ", " + y + ")";
	}

	// Métodos da interface permanecem abstratos
	public abstract String desenhar();
	public abstract void redimensionar(double fator);
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
}
