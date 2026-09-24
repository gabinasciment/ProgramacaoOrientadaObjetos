package unidade3;

import java.util.Scanner;

import util.Conversao;

public class ConversaoMain {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int option;
		do {

			option = menu();
			double conversao;
			double num;
			switch (option) {
			case 1:
				System.out.println("Digite o número de Km: ");
				num = scan.nextDouble();
				conversao = Conversao.quilometrosMilhas(num);
				System.out.println("Km: " + num + "\n" + "Milhas: " + conversao);
				break;
			case 2:
				System.out.println("Digite o número de Milhas: ");
				num = scan.nextDouble();
				conversao = Conversao.milhasQuilometros(num);
				System.out.println("Milhas: " + num + "\n" + "Km: " + conversao);
				break;
			case 3:
				System.out.println("Digite o número de Pés: ");
				num = scan.nextDouble();
				conversao = Conversao.pesCentimetros(num);
				System.out.println("Pés: " + num + "\n" + "Cm: " + conversao);
				break;
			case 4:
				System.out.println("Digite o número de Cm: ");
				num = scan.nextDouble();
				conversao = Conversao.centimetrosPes(num);
				System.out.println("Cm: " + num + "\n" + "Pés: " + conversao);
				break;
			case 5:
				System.out.println("Digite o número de Polegadas: ");
				num = scan.nextDouble();
				conversao = Conversao.polegadasCentimetros(num);
				System.out.println("Polegadas: " + num + "\n" + "Cm: " + conversao);
				break;
			case 6:
				System.out.println("Digite o número de Cm: ");
				num = scan.nextDouble();
				conversao = Conversao.centimetrosPolegadas(num);
				System.out.println("Cm: " + num + "\n" + "Polegadas: " + conversao);
				break;
			case 7:
				System.out.println("Fechando sistema....");
				break;
			default:
				System.out.println("Opcao inválida, tente novamente.");
				break;
			}

		} while (option != 7);

	}

	public static int menu() {
		System.out.println("-- SISTEMA DE CONVERSÃO --");
		System.out.println("1- Km ---------------> Milhas");
		System.out.println("2- Milhas -----------> Km");
		System.out.println("3- Pés --------------->Cm");
		System.out.println("4- Cm ----------------> Pés");
		System.out.println("5- Pol ---------------> Cm");
		System.out.println("6- Cm ---------------> Pol");
		System.out.println("7- Sair");
		int opcao = scan.nextInt();
		return opcao;

	}

}
