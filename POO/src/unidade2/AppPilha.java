package unidade2;

import java.util.Scanner;

public class AppPilha {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PilhaInteiro pilha = new PilhaInteiro();
		int num;
		System.out.println("Bem- vindo ao App para criar pilhas!");
		
		do {
			System.out.println("Digite um número inteiro: ");
			System.out.println("Caso deseje finalizar digite zero.");
			num = scan.nextInt();
			
			if(num != 0) {
				pilha.empilhar(num);
			}
			
		}while(num != 0);
		
		
		if(!pilha.eVazia()) {
			System.out.println("Valor no topo da pilha: " + pilha.topo());
		}else {
			System.out.println("A pilha esta vazia ");
		}
		
		
		System.out.println("Elementos removidos: ");
		while(!pilha.eVazia()) {
			int remove = pilha.desempilhar();
			System.out.println(remove);
		}
		System.out.println("App encerrado!");
		
		scan.close();
		
	}

}
