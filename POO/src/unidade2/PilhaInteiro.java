package unidade2;

import java.util.LinkedList;

public class PilhaInteiro {
	//corrigir sobre é vazia e validação
	private LinkedList<Integer> lista;
	
	//construtor
	public PilhaInteiro() {
		lista = new LinkedList<Integer>();
	}
	
	
	
	public boolean eVazia() {
		return lista.isEmpty();
	}
	
	
	
	public void empilhar(int valor) {
		lista.addLast(valor);
	}
	
	
	//topo está no final da lista 
	public int desempilhar() {
		return lista.removeLast();
	}
	
	
	public int tamanho() {
		return lista.size();
	}
	
	
	//como o topo fica por ultimo
	public int topo() {
		return lista.getLast();
	}
	
	
	
	

}
