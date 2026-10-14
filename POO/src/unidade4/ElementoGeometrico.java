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
	
	///feito assim não precisa sobrescrever o método nas outras classes
	public String desenhar() {
		return this.getClass().getSimpleName() + " está sendo desenhado";
	}
	
}
