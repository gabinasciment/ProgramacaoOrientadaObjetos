
package unidade2;

import java.util.LinkedList;

public class PrimeiroLinkedList {

	public static void main(String[] args) {
		/*
		 * 1 - Preencher um LinkedList com 10 inteiros
		 * 2 - Imprimir na tela todos os numeros
		 * 3 - Remover o elemento da posicao 0
		 * 4 - Imprimir na tela
		 * 5 - Trocar o elemento da posicao 4 por 100
		 * 6 - Preencher outro ArrayList com 5 numeros
		 * 7 - juntar as duas listas
		 * 8 - imprimir na tela
		 *
		 */
		
		LinkedList<Integer> lista = new LinkedList<Integer>();
		LinkedList<Integer> lista2 = new LinkedList<Integer>();
		LinkedList<Integer> uniao;
		
		preencher (lista, 10);
		System.out.println(lista);
		int aux = lista.remove(0);
		System.out.println(" O ELEMENTO REMOVIDO FOI = "+aux);
		System.out.println(lista);
		
		lista.set(4, 100);
		System.out.println(lista);
		
		preencher (lista2, 5);
		
		// juntar as duas listas
		uniao = new LinkedList<Integer>(lista);
		uniao.addAll(lista2);
		System.out.println(lista);
		System.out.println(lista2);
		System.out.println(uniao);
		
		

	}

	private static void preencher(LinkedList<Integer> lista, int quant) {
		int aux;
		for (int i=0; i<quant; i++) {
			aux = (int)(Math.random()*20)+1;
			lista.add(aux);
		}
		
	}
}

