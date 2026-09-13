package unidade2exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		ArrayList<Integer> lista3; 
		int tam, tam2;
		int n;
		System.out.println("Digite o tamanho da lista 1: ");
		tam = scan.nextInt();
		

		System.out.println("Digite o tamanho da lista 2: ");
		tam2 = scan.nextInt();
		
		while (tam != lista.size()) {
			n = (int) (Math.random() * 20 );
			lista.add(n);
		}
		
		
		while (tam2 != lista2.size()) {
			n = (int) (Math.random() * 20);
			lista2.add(n);
		}
		
		lista3 = intercalarLista(lista, lista2);
		
		
		System.out.println("LISTA 1 : " + lista.toString());
		System.out.println("LISTA 2: " + lista2.toString());
		System.out.println("LISTA 3: " + lista3.toString());
		
	}
	
	
	public static ArrayList<Integer> intercalarLista(ArrayList<Integer> lista1,ArrayList<Integer> lista2){
		int tam = lista1.size() + lista2.size();
		int tamMenor = Math.min(lista1.size(), lista2.size());
		ArrayList<Integer> listaintercalada = new ArrayList<Integer>(tam);
		for (int i = 0; i < tamMenor; i++) {
			listaintercalada.add(lista1.get(i));
			listaintercalada.add(lista2.get(i));
		}
		
		for (int i = tamMenor; i < lista1.size(); i++) {
			listaintercalada.add(lista1.get(i));
			
		}
		
		for (int i = tamMenor; i < lista2.size(); i++) {
			listaintercalada.add(lista2.get(i));
			
		}
		
		return listaintercalada;
	}

}
