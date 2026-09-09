package unidade2exercicios;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import unidade2.FilaInteiro;

public class exercicio06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FilaInteiro fila = new FilaInteiro();
		System.out.println("Digite o tamanho: ");
		int tam = scan.nextInt();
		while (tam != fila.size()) {
			System.out.println("Digite um número inteiro: ");
			int num = scan.nextInt();
			fila.enqueue(num);
		}
		
		retirarIguais(fila);

	}

	public static void retirarIguais(FilaInteiro fila) {
		ArrayList<Integer> aux = new ArrayList();
		int t = fila.size();
		int num;
		while (!fila.isEmpty()) {
			num = fila.dequeue();
			if (!aux.contains(num)) {
				aux.add(num);
			}

		}
		System.out.println("Lista : " + aux.toString());

		for (Integer integer : aux) {
			fila.enqueue(integer);

		}
	}
}
