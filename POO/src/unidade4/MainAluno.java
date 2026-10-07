package unidade4;

import java.util.ArrayList;

public class MainAluno {
	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas =  new ArrayList<Pessoa>();
		pessoas.add(new Aluno ("Ana", 20, "123"));
		pessoas.add(new Pessoa("João", 44));
		pessoas.add(new Aluno("Fabio",18,"456"));
		pessoas.add(new Pessoa("Gabriela",21));
		
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.toString());
		}
		
		//se quiser imprimir nome e matricula se for aluno e somente nome se for pessoa;
		for (Pessoa pessoa : pessoas) {
			System.out.println("Nome: " + pessoa.getNome());
			if (pessoa instanceof Aluno) {
				Aluno a = (Aluno) pessoa; //casting para aluno
				System.out.println("Matricula: "  + a.getMatricula());
			}
		}
	
	
	}
}
