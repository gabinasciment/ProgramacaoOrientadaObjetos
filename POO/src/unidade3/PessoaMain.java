package unidade3;

public class PessoaMain {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Ana Silva", "111.111.111-11");
        Pessoa p2 = new Pessoa("Bruno Costa", "222.222.222-22");
        Pessoa p3 = new Pessoa("Carla Souza", "333.333.333-33");
        Pessoa p4 = new Pessoa("Daniel Rocha", "444.444.444-44");
        Pessoa p5 = new Pessoa("Eduarda Lima", "555.555.555-55");
        Pessoa p6 = new Pessoa("Felipe Alves", "666.666.666-66");

        // Exemplo de uso
        System.out.println("Pessoa 1: " + p1.getName() + " - " + p1.getCpf());
        System.out.println("Pessoa 2: " + p2.getName() + " - " + p2.getCpf());
        System.out.println("Pessoa 3: " + p3.getName() + " - " + p3.getCpf());
        System.out.println("Pessoa 4: " + p4.getName() + " - " + p4.getCpf());
        System.out.println("Pessoa 5: " + p5.getName() + " - " + p5.getCpf());
        System.out.println("Pessoa 6: " + p6.getName() + " - " + p6.getCpf());
        
        System.out.println("Quantidade de pessoas: " + Pessoa.getQuant());
	}

}
