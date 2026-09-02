package unidade2;

import java.util.ArrayList;

public class PrimeiroArrayList {

	public static void main(String[] args) {
		/*
		 * 1 - Preencher um ArrayList com 10 inteiros
		 * 2 - Imprimir na tela todos os numeros
		 * 3 - Remover o elemento da posicao 0
		 * 4 - Imprimir na tela
		 * 5 - Trocar o elemento da posicao 4 por 100
		 * 6 - Preencher outro ArrayList com 5 numeros
		 * 7 - juntar as duas listas
		 * 8 - imprimir na tela
		 *
		 */
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>(5);
		ArrayList<Integer> uniao;
		ArrayList<Integer> lista3= new ArrayList<Integer>();
		
		preencher (lista, 10);
		System.out.println(lista);
		int aux = lista.remove(0);
		System.out.println(" O ELEMENTO REMOVIDO FOI = "+aux);
		System.out.println(lista);
		
		lista.set(4, 100);
		System.out.println(lista);
		
		preencher (lista2, 5);
		
		// juntar as duas listas
		uniao = new ArrayList<Integer>(lista);
		uniao.addAll(lista2);
		System.out.println(lista);
		System.out.println(lista2);
		System.out.println(uniao);
		
		
		preencher(lista3, 10);
		removerPares(lista3);
		for(int num : lista3) {
			System.out.println(num);
		}

	}

	private static void preencher(ArrayList<Integer> lista, int quant) {
		int aux;
		for (int i=0; i<quant; i++) {
			aux = (int)(Math.random()*20)+1;
			lista.add(aux);
		}
	}
		
	private static void removerPares(ArrayList<Integer> lista) {
		int tam = lista.size();
		for(int i = 0; i < tam; i++ ) {
			if(lista.get(i) %  2 == 0){
				lista.remove(i);
				i --;
			}
		}
		
	}
}
