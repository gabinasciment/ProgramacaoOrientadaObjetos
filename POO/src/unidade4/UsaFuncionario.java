package unidade4;

import java.util.ArrayList;

public class UsaFuncionario {

	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		adicionar(funcionarios);
		calcularSalario(funcionarios);

	}

	public static void adicionar(ArrayList<Funcionario> f) {
		f.add(new Gerente("Gabriela", 11));
		f.add(new Vendedor("Erika", 14, 500));
		f.add(new Assistente("Garibalda", 18));
	}

	 public static void calcularSalario(ArrayList<Funcionario> f) {
	        double soma = 0;

	        for (Funcionario funcionario : f) {
	            soma += funcionario.calculaSalario();
	        }

	        System.out.println("A soma total é igual a " + soma);
	    }

}
