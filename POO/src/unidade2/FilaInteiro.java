package unidade2;

import java.util.LinkedList;

public class FilaInteiro {
	private LinkedList<Integer> fila;

	public FilaInteiro () {
		fila = new LinkedList<Integer>();
	}
	
	// eVazia
	public boolean isEmpty() {
		return fila.isEmpty();
	}
	
	// Enfileirar
	public void enqueue (int num) {
		fila.addLast(num);
	}
	
	// Desenfileirar
	public Integer dequeue () {
		if (fila.isEmpty()) {
			return null;
		}
		return fila.removeFirst();
	}
	
	// Primeiro da fila
	public Integer peek() {
		if (fila.isEmpty()) {
			return null;
		}
		return fila.getFirst();
	}
	
	// Tamanho da fila
	public int size () {
		return fila.size();
	}

}
