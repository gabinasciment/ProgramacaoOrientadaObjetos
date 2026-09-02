package unidade2;
import java.util.Scanner;
import java.util.ArrayList;
import unidade1.*;

// Refazer a classe AppAluno, utilizando ArrayList
public class UsaAluno {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Aluno> cadAluno = new ArrayList<Aluno>();
		int opcao;

		do {
			System.out.println("MENU\n"+
					" 1. Cadastrar    \n" + 
					" 2. Imprimir Aluno    \n" + 
					" 3. Imprime todos    \n" + 
					" 4. Alterar Nota 1    \n" + 
					" 5. Alterar Nota 2    \n" + 
					" 6. Sair");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1:
				cadastrar (cadAluno);
				break;
			case 2: 
				mostraAluno (cadAluno);
				break;
			case 3: 
				imprimeTodos (cadAluno);
				break;
			case 4:
				alteraNota1(cadAluno);
				break;
			case 5:
				alteraNota2(cadAluno);
				break;
			case 6:
				System.exit(0);
			default:
				System.err.println("ERRO       OPCAO INVALIDA");
			}
		}while (true);

	}

	public static void cadastrar(ArrayList<Aluno> cadAluno) {

		System.out.println("NOME: ");
		scan.nextLine();
		String nome = scan.nextLine();

		System.out.print("MATRICULA: ");
		int matr = scan.nextInt();
		scan.nextLine();

		System.out.print("NOTA 1: ");
		double nota1 = scan.nextDouble();
		scan.nextLine();

		System.out.print("NOTA 2: ");
		double nota2 = scan.nextDouble();
		scan.nextLine();

		Aluno aluno = new Aluno(nome, matr, nota1, nota2);
		cadAluno.add(aluno);
	}

	public static void mostraAluno(ArrayList<Aluno> cadAluno) {
		System.out.print("NOME: ");
		scan.nextLine();
		String nome = scan.nextLine();
		int pos = pesquisa(cadAluno, nome);

		if (pos==-1) {
			System.err.println("ERRO\n" + nome + "  nao cadastrado");
		} else {
			Aluno a = cadAluno.get(pos);
			System.out.println("REGISTRO\n" + "NOME = " + a.getNome()+
					"     MEDIA = "+a.getMedia());
		}
	}


	public static void imprimeTodos(ArrayList<Aluno> cadAluno) {
		// for each:
		// (Tipo_do_objeto nome_do_objeto : nome_da_lista)
		for (Aluno a: cadAluno){
			System.out.println (a);
		}
	}

	public static int pesquisa (ArrayList<Aluno> cadAluno, String nome) {
		for (int i=0; i<cadAluno.size(); i++) {
			Aluno a = cadAluno.get(i);
			if (a.getNome().equalsIgnoreCase(nome)) {
				return i;
			}
		}
		return -1;
	}
	
	private static void alteraNota1(ArrayList<Aluno> cadAluno) {
		System.out.print("NOME: ");
		scan.nextLine();
		String nome = scan.nextLine();
		int pos = pesquisa(cadAluno, nome);
		double nota;
		
		if (pos!=-1) {
			Aluno a = cadAluno.get(pos);
			System.out.println("NOME: "+a.getNome()+
					"     NOTA 1: "+a.getNota1());
			System.out.print("Entre com a nova nota 1: ");
			nota = scan.nextDouble();
			scan.nextLine();
			a.setNota1(nota);
		} else {
			System.err.println("ERRO\n" + nome + "  nao cadastrado");
		}
	}
	
	private static void alteraNota2(ArrayList<Aluno> cadAluno) {
		System.out.print("NOME: ");
		String nome = scan.nextLine();
		int pos = pesquisa(cadAluno, nome);
		scan.nextLine();
		double nota;
		
		if (pos!=-1) {
			Aluno a = cadAluno.get(pos);
			System.out.println("NOME: "+a.getNome()+
					"     NOTA 2: "+a.getNota2());
			System.out.print("Entre com a nova nota 2: ");
			nota = scan.nextDouble();
			scan.nextLine();
			a.setNota2(nota);
		} else {
			System.out.println("ERRO\n" + nome + "  nao cadastrado");
		}
	}
}
