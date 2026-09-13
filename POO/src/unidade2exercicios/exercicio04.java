package unidade2exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		ArrayList<Integer> lista3 = new ArrayList<Integer>();
		int tam;
		int num;
		System.out.println("Digite o tam da lista: ");
		tam = scan.nextInt();
		
		while (tam != lista.size()) {
			num = (int)  (Math.random() * 20);
			lista.add(num);
		}
		
		preencherMetade(lista,lista2,lista3);
		
	}
	
	public static void preencherMetade(ArrayList<Integer> lista, ArrayList<Integer> metade1, ArrayList<Integer> metade2) {
		int metade = (int) lista.size() / 2;
		
		for (int i = 0; i < metade ; i++) {
			metade1.add(lista.get(i));
		}
		
		for (int i = metade; i < lista.size(); i++) {
			metade2.add(lista.get(i));
			
		}
		
		System.out.println(lista.toString());
		System.out.println(metade1.toString());
		System.out.println(metade2.toString());
		
	}
	
	

}
