package unidade3;

import java.util.ArrayList;

public class ExercicioVendendor {
	public static void main(String[] args) {
		ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
		preenche(vendedores);
		mostraMaiorTempo(vendedores);
		mostraSalario(vendedores);
		Vendedor.setSalarioBase(2500);
		mostraSalario(vendedores);
		double totalVendas = calculaTotalVendas(vendedores);
		System.out.println("Total de vendas foi: " + totalVendas);

	}

	private static void preenche(ArrayList<Vendedor> v) {
		v.add(new Vendedor("Carlos", 2500.00, 15000.00, 5));
		v.add(new Vendedor("Mariana", 3000.00, 22000.00, 8));
		v.add(new Vendedor("João", 2000.00, 12000.00, 3));
		v.add(new Vendedor("Fernanda", 2800.00, 18000.00, 6));
		v.add(new Vendedor("Ricardo", 3500.00, 25000.00, 10));
	}

	private static void mostraMaiorTempo(ArrayList<Vendedor> v) {
		int maior = maiorTempo(v);
		System.out.println("Maior tempo de serviço é : " + maior);

	}

	private static int maiorTempo(ArrayList<Vendedor> v) {
		int maior = 0;
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).getTempoServico() > maior) {
				maior = v.get(i).getTempoServico();

			}

		}
		return maior;
	}
	
	private static void mostraSalario(ArrayList<Vendedor> v) {
		for (int i = 0; i < v.size(); i++) {
			System.out.println("Nome:" + v.get(i).getNome() + "|" + "Categoria:" + v.get(i).getCategoria() + 
			 "|" + "Salário:" + v.get(i).salario());
		}
	}
	
	private static double calculaTotalVendas(ArrayList<Vendedor> v) {
		double totalVendasVendedores = 0;
		for (int i = 0; i < v.size(); i++) {
			totalVendasVendedores =+ v.get(i).getTotalVendas();
		}
		return totalVendasVendedores;
	}
	
	

}
