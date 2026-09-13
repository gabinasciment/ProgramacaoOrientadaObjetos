package unidade2exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		System.out.println("Digite o tamanho da lista :");
		int tam = scan.nextInt();
		int num = 0;
		while (tam != lista1.size()) {
			num = (int) (Math.random() * 20);
			lista1.add(num);
		}

		inverteLista(lista1, lista2);

		System.out.println("Lista 1 : ");
		for (int a : lista1) {
			System.out.println(a);
		}
		System.out.println("Lista invertida: ");
		for (int a : lista2) {
			System.out.println(a);
		}

	}

	public static void inverteLista(ArrayList<Integer> list, ArrayList<Integer> listainvertida) {
		int n = 0;
		for (int i = 0; i < list.size(); i++) {
			listainvertida.addFirst(list.get(i));
			n = list.get(list.size() - 1 - i);
			listainvertida.add(n);
		}

	}

	// mais fácil- usar o add first
	public static void inverteListaOutraForma(ArrayList<Integer> list, ArrayList<Integer> listainvertida) {
		for (int i = 0; i < list.size(); i++) {
			// pois quando ele pegar o primeiro ele pega e coloca na frente do primeiro,
			// logo inverte
			listainvertida.addFirst(list.get(i));
		}
	}

}
