package unidade2;
import java.util.LinkedList;

public class FilaInteiro {
	
	private LinkedList<Integer> lista;
	
	public FilaInteiro() {
		lista = new LinkedList<Integer>();
	}
	
	
	public boolean eVazia() {
		return lista.isEmpty();
	}
	
	
	public void inserir(int num) {
		 lista.addLast(num);
	}
	
	public int remover() {
		if(this.lista.isEmpty()) {
			return 0;
		}
		return lista.removeFirst();
	}
	
	public int tamanho() {
		return lista.size();
	}
	
	public int primeiro() {
		if(lista.isEmpty()) {
			return 0;
		}
		return lista.getFirst();
	}
	

}
