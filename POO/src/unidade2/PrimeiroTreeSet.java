package unidade2;

import java.util.TreeSet;

public class PrimeiroTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> conjunto = new TreeSet<>();
		int num, tamanho = 10;
		
		for(int i = 0; i<10; i++) {
			num = (int) (Math.random() * 20) +1;
			conjunto.add(num);
		}
		
		//assim é melhor 
		while(tamanho != conjunto.size()) {
			num = (int) (Math.random() * 20) +1;
			conjunto.add(num);
		}
		
		System.out.println(conjunto);
		
		for(int a : conjunto) {
			System.out.println(a);
		}
		
		
		/** Se eu quiser ordenar o vetor e tirar os repetidos = pode colocar num TreeSet e depois jogar de volta no vetor:
		 * conjunto = new TreeSet<Integer>(vetor);
		 * vetor = new ArrayList<Integer>(conjunto);
		 * 
		 */
		
	}

}
