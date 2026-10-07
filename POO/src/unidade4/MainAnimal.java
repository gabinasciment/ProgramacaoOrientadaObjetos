package unidade4;

import java.util.ArrayList;

public class MainAnimal {

	public static void main(String[] args) {
		ArrayList<Animal> animais = new ArrayList<Animal>();
		animais.add(new Gato("Felpudo", "Vira-Lata"));
		animais.add(new Cachorro("Toto", "Vira-Lata"));
		animais.add(new Papagaio("Loro José", "Africano"));
		animais.add(new Animal("Floquinho", "Desconhecida"));

		for (Animal animal : animais) {
			if ((animal instanceof Cachorro) || (animal instanceof Gato)) {
				System.out.println(animal.comunica());
			}
		}
		for (Animal animal : animais) {
			System.out.println(animal.caminha());
		}
	}

}
