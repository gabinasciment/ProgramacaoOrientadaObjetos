package unidade2exercicios;

import java.util.Scanner;

import unidade2.FilaInteiro;

public class exercicio10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FilaInteiro fila = new FilaInteiro();
		int tam;
		System.out.println("Informe o tamanho da fila: ");
		tam = scan.nextInt();
		int n = 0;
		while (tam != fila.size()) {
			n = (int) (Math.random() * 20);
			fila.enqueue(n);
		}

		System.out.println("Fila original : ");

		// quando for print pode jogar utilizar sem uma fila auxiliar, agora quando for
		// um método tem que usar uma fila auxiliar para não modificar o valor do size
		// na pilha não posso
		for (int x = 0; x < fila.size(); x++) {
			int num = 0;
			num = fila.dequeue();
			System.out.println(num);
			fila.enqueue(num);
		}
		
		removerPares(fila);
		System.out.println("Fila sem pares : ");
		for (int x = 0; x < fila.size(); x++) {
			int num = 0;
			num = fila.dequeue();
			System.out.println(num);
			fila.enqueue(num);
		}
		
		

	}

	public static void removerPares(FilaInteiro fila) {
		// tem que salvar o valor pois conforme desinfileira vc vai desifelerando, para
		// não acontecer erro de lógica,salvamos o valor do tamanho numa variável
		int tam = fila.size();
		int num;
		if (!fila.isEmpty()) {
			for (int i = 0; i < tam; i++) {
				num = fila.dequeue();
				if (num % 2 != 0) {
					fila.enqueue(num);
				}
			}
		}

	}
	
	
	public static void printarFila(FilaInteiro fila) {
		for (int x = 0; x < fila.size(); x++) {
			int num = 0;
			num = fila.dequeue();
			System.out.println(num);
			fila.enqueue(num);
		}
	}

}
