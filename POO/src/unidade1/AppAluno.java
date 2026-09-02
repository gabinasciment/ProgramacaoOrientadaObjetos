package unidade1;
import java.util.Scanner;

public class AppAluno {
	// variável de controle deve ser static
	private static int quant = 0;
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// o vetor deve ser variavel local
		Aluno[] cadAluno = new Aluno[5];
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

	public static void cadastrar(Aluno[] cadAluno) {
		if (quant==cadAluno.length) {
			System.err.println("Vetor cheio");
		} else {
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
			cadAluno[quant] = aluno;
			quant++;
		}
	}
	
	public static void mostraAluno(Aluno[] cadAluno) {
		System.out.print("NOME: ");
		scan.nextLine();
		String nome = scan.nextLine();
		int pos = pesquisa(cadAluno, nome);
		
		if (pos==-1) {
			System.err.println("ERRO\n" + nome + "  nao cadastrado");
		} else {
			System.out.println("REGISTRO\n" + "NOME = " + cadAluno[pos].getNome()+
					"     MEDIA = "+cadAluno[pos].getMedia());
		}
	}

	public static void imprimeTodos(Aluno[] cadAluno) {
		for (int i=0; i<quant; i++){
			System.out.println (cadAluno[i].toString());
		}
	}
	
	public static int pesquisa (Aluno[] cadAluno, String nome) {
		for (int i=0; i<quant; i++) {
			if (cadAluno[i].getNome().equalsIgnoreCase(nome)) {
				return i;
			}
		}
		return -1;
	}

	private static void alteraNota1(Aluno[] cadAluno) {
		System.out.print("NOME: ");
		scan.nextLine();
		String nome = scan.nextLine();
		int pos = pesquisa(cadAluno, nome);
		double nota;
		
		if (pos!=-1) {
			Aluno aluno = cadAluno[pos];
			System.out.println("NOME: "+aluno.getNome()+
					"     NOTA 1: "+aluno.getNota1());
			System.out.print("Entre com a nova nota 1: ");
			nota = scan.nextDouble();
			scan.nextLine();
			aluno.setNota1(nota);
		} else {
			System.err.println("ERRO\n" + nome + "  nao cadastrado");
		}
	}
	
	private static void alteraNota2(Aluno[] cadAluno) {
		System.out.print("NOME: ");
		String nome = scan.nextLine();
		int pos = pesquisa(cadAluno, nome);
		scan.nextLine();
		double nota;
		
		if (pos!=-1) {
			System.out.println("NOME: "+cadAluno[pos].getNome()+
					"     NOTA 2: "+cadAluno[pos].getNota2());
			System.out.print("Entre com a nova nota 2: ");
			nota = scan.nextDouble();
			scan.nextLine();
			cadAluno[pos].setNota2(nota);
		} else {
			System.out.println("ERRO\n" + nome + "  nao cadastrado");
		}
	}

}
