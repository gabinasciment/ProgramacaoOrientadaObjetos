package unidade2exercicios;

import java.util.ArrayList;

public class JuntarOrdenadarRetirarRepetido {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		ArrayList<Integer> lista3 = new ArrayList<Integer>();
		int num = 10;
		int n = 0;

		while (num != lista.size()) {
			n = (int) (Math.random() * 20) + 1;
			lista.add(n);

		}

		while (num != lista2.size()) {
			n = (int) (Math.random() * 20) + 1;
			lista2.add(n);

		}

		System.out.println(lista.toString());
		System.out.println(lista2.toString());
		juntaOrdenaRepetido(lista, lista, lista3);
		System.out.println(lista3.toString());

	}

	public static void juntaOrdenaRepetido(ArrayList<Integer> lista1, ArrayList<Integer> lista2,
			ArrayList<Integer> listaordenada) {
		int aux;
		// vpara cada elemento de da lista verifico - verifico se ele já existe na lista
		// 3
		for (int a : lista1) {
			if (!listaordenada.contains(a)) {
				listaordenada.add(a);
			}

		}

		// mesma coisa para lista 2
		for (int b : lista2) {
			if (!listaordenada.contains(b)) {
				listaordenada.add(b);
			}
		}

		// para ordenar o arry usa o sort
		for (int i = 0; i < listaordenada.size() - 1; i++) {

			int menor = i;

			for (int j = i + 1; j < listaordenada.size(); j++) {

				if (listaordenada.get(j) < listaordenada.get(menor)) {
					menor = j;
				}
			}

			aux = listaordenada.get(i);
			listaordenada.set(i, listaordenada.get(menor));
			listaordenada.set(menor, aux);
		}
	}

	///

}
