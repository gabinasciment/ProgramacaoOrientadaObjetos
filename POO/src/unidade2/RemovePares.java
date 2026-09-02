package unidade2;

import java.util.ArrayList;
/*
 * Exercício
 * Inserir 10 números aleatórios em um ArrayList.
 * Imprimir a lista na tela
 * Remover todos os pares da lista
 * Imprimir a lista novamente
 */

public class RemovePares {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for (int i=0; i<10; i++ ) {
			lista.add((int)(Math.random()*10)+1);
		}
		System.out.println(lista);
		
		for (int i=0; i<lista.size();) {
			if (lista.get(i)%2 == 0) {
				lista.remove(i);
			} else {
				i++;
			}
		}
		System.out.println(lista);

	}

}
