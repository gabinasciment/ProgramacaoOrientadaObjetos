package unidade2exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio05 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int tam, num;
		float media;
		System.out.println("Digite o tamanho da lista: ");
		tam = scan.nextInt();
		
		while (tam != lista.size()) {
			num = (int) (Math.random() * 20);
			lista.add(num);
			
		}
		
		media = media(lista);
		System.out.println(lista.toString());
		System.out.println(media);
		
	}
	
	public static int media(ArrayList<Integer> l){
		int soma = 0;
		int tam = l.size();
		for (int i = 0; i < l.size(); i++) {
			soma += l.get(i);
		}
		
		return soma / tam;
	}

}
