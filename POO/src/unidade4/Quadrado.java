package unidade4;

public class Quadrado extends Retangulo {

	public Quadrado(double x, double y, double lado) {
		super(x, y, lado, lado);
	}

	@Override
	public String desenhar() {
		return "O Quadrado está sendo desenhado";
	}

	@Override
	public void redimensionar(double fator) {
		double novoLado = getLado1() * fator;
		setLado1(novoLado);
		setLado2(novoLado);
	}

	@Override
	public String toString() {
		return "Quadrado - " + "Posição: (" + getX() + ", " + getY() + "), Lado: " + getLado1();
	}
}
