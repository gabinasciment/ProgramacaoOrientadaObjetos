package unidade2;

import java.util.LinkedList;

public class PilhaInteiro {
	private LinkedList<Integer> pilha;
	
	public PilhaInteiro () {
		this.pilha = new LinkedList<Integer>();
	}
	
	// eVazia
	public boolean isEmpty() {
		return this.pilha.isEmpty();
	}
	
	// empilhar
	public void push (int num) {
		this.pilha.addFirst(num);
	}
	
	// desempilhar
	public Integer pop() {
		if (this.pilha.isEmpty()) {
			return null;
		}
		return this.pilha.removeFirst();
	}
	
	// topo da pilha
	public Integer top() {
		if (this.pilha.isEmpty()) {
			return null;
		}
		return this.pilha.getFirst();
	}
	
	// tamanho da pilha
	public int size() {
		return this.pilha.size();
	}

}
