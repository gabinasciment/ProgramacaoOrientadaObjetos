package unidade4;

import java.util.ArrayList;

public class MainGeometrico {
	public static void main(String[] args) {
		ArrayList<ElementoGeometrico> formas = new ArrayList<ElementoGeometrico>();

		formas.add(new Circulo(0, 0, 5));
		formas.add(new Circulo(1, 2, 3));
		formas.add(new Retangulo(0, 0, 4, 6));
		formas.add(new Retangulo(2, 3, 8, 3));
		formas.add(new Quadrado(0, 0, 4));
		formas.add(new Quadrado(1, 1, 7));

		System.out.println("===== FIGURAS GEOMÉTRICAS =====");
		for (ElementoGeometrico forma : formas) {
			System.out.println(forma);
			System.out.printf("  Área: %.2f%n", forma.calcularArea());
			System.out.printf("  Perímetro: %.2f%n", forma.calcularPerimetro());
			System.out.println();
		}

		System.out.println("===== DOBRANDO DIMENSÃO DOS CÍRCULOS =====");
		for (ElementoGeometrico forma : formas) {
			if (forma instanceof Circulo) {
				Circulo c = (Circulo) forma;
				System.out.println("Raio antes: " + c.getRaio());
				c.redimensionar(2); // dobra o raio
				System.out.println("Raio depois: " + c.getRaio());
				System.out.println();
			}
		}

		System.out.println("===== DESENHANDO TODAS AS FIGURAS =====");
		for (ElementoGeometrico forma : formas) {
			System.out.println(forma.desenhar());
		}
	}
}
