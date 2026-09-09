package unidade2;

import java.util.Scanner;

public class AppFila {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FilaInteiro fila = new FilaInteiro();
		int num;
		
		System.out.println("Bem- vindo ao AppFila!");
		
		do {
			System.out.println("Digite um valor inteiro: ");
			System.out.println("ou digite zero para parar o programa");
			num = scan.nextInt();
			
			if(num != 0) {
				fila.enqueue(num);
			}
			
		}while(num != 0);
		
		
		if(!fila.isEmpty()) {
			System.out.println("Primeiro elemento da fila: " + fila.peek());
		}else {
			System.out.println("A fila está vazia ");
		}
		
		System.out.println("Itens removidos da fila");
		while(!fila.isEmpty()) {
			int remove = fila.dequeue();
			System.out.println(remove);
		}
		
		if(fila.isEmpty()) {
			System.out.println("A fila se encontra vazia!");
		}else {
			System.out.println("O fila ainda possui elementos");
		}
		
		System.out.println("Programa encerrado! Volte sempre =)");
		
		scan.close();
		
	}

}
