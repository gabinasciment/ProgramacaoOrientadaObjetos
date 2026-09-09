package unidade2exercicios;

import java.util.ArrayList;

import unidade2.PilhaInteiro;

//quando for pilha tem que adicionar na auxiliar no primeiro elemento
public class exercicio07 {
	public static void main(String[] args) {
		PilhaInteiro pilha = new PilhaInteiro();
		int tam = 7;
		int num;
		while (tam != pilha.size()) {
			num = (int) (Math.random() * 20);
			pilha.push(num);
		}
		
		retirarIguais(pilha);
	}

	public static void retirarIguais(PilhaInteiro pilha) {
		ArrayList<Integer> aux = new ArrayList<Integer>(pilha.size());
		int num;
		while (!pilha.isEmpty()) {
			num = pilha.pop();
			if (!aux.contains(num)) {
				aux.addFirst(num);

			}
		}
		System.out.println("Lista :" + aux.toString());
		for (Integer i : aux) {
			pilha.push(aux.get(i));
		}

	}

}
