package unidade2exercicios;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class exercicio08 {
	public static void main(String[] args) {
		int tam = 6;
		int num;
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		ArrayList<Integer> lista3;
		
		while (tam != lista1.size()) {
			num = (int) (Math.random() * 20);
			lista1.add(num);

		}

		while (tam != lista2.size()) {
			num = (int) (Math.random() * 20);
			lista2.add(num);

		}
		
		System.out.println(lista1.toString());
		System.out.println(lista2.toString());
		lista3 = armazenaIguais(lista1, lista2);
		System.out.println(lista3.toString());
	}

	public static ArrayList<Integer> armazenaIguais(ArrayList<Integer> lista, ArrayList<Integer> lista2) {
		ArrayList<Integer> diferentes = new ArrayList<Integer>();

		for (Integer integer : lista) {
			if (!diferentes.contains(integer)) {
				diferentes.add(integer);
			}
		}
		
		for (Integer integer : lista2) {
			if (!diferentes.contains(integer)) {
				diferentes.add(integer);
			}
		}
		
		return diferentes;
	}
}
