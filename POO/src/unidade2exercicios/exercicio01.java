package unidade2exercicios;

import java.util.*;

/*
 * 1 - Faça um programa que preencha duas listas de inteiros 
 *     e preencha uma outra lista com todos os elementos 
 *     das duas listas originais, sem repetição e ordenados. 
 *     Ao final, mostre as três listas na tela. 
 *     Por exemplo: [3,6,5,3,7] [2,9,7,5,1] ==> [1,2,3,5,6,7,9]
 *     pode fazer com Trreset
 */
public class exercicio01 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> lista1 = new ArrayList<>();
		ArrayList<Integer> lista2 = new ArrayList<>();
		ArrayList<Integer> lista3;

		preencher(lista1);
		preencher(lista2);
		lista3 = unir(lista1, lista2);

		System.out.println("LISTA 1");
		System.out.println(lista1);
		System.out.println("LISTA 2");
		System.out.println(lista2);
		System.out.println("LISTA 3");
		System.out.println(lista3);

	}

	public static void preencher(ArrayList<Integer> lista) {
		int tam, num;

		System.out.println("Entre com o tamanho da lista");
		tam = scan.nextInt();
		for (int i = 0; i < tam; i++) {
			num = (int) (Math.random() * 20 + 1);
			lista.add(num);
		}
	}

	private static ArrayList<Integer> unir(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
		TreeSet<Integer> aux;
		ArrayList<Integer> lista;
		aux = new TreeSet<Integer>(lista1);
		aux.addAll(lista2);

		lista = new ArrayList<Integer>(aux);
		return lista;
	}

}