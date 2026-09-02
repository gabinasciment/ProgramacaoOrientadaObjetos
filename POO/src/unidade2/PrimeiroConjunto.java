package unidade2;

import java.util.HashSet;

public class PrimeiroConjunto {
	public static void main(String[] args) {
		HashSet<Integer> conjunto = new HashSet<>();
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
		
		
	}

}
