package unidade4;

import java.util.Scanner;

public class UsaTv {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Tv001 tv1 = new Tv001(110, 21);
		TvSDK tv2 = new TvSDK(110, 42);
		System.out.println("TVs criadas!");
		System.out.println("Digite o canal: ");
		int canal = scan.nextInt();
		ligarTVS(tv1,tv2,canal);
		aumentarVolume(tv2,5);
		desligarTV001(tv1);
		verificarLigadas(tv1,tv2);
		

	}

	public static void ligarTVS(Tv001 tv1, TvSDK tv2, int canal) {
		tv1.ligar();
		tv2.ligar();
		tv1.mudarCanal(canal);
	}

	public static void aumentarVolume(TvSDK tv, int uni) {
		tv.aumentarVolume(uni);
	}

	public static void desligarTV001(Tv001 tv) {
		tv.desligar();
	}

	public static void verificarLigadas(Tv001 tv1, TvSDK tv2) {
		if (tv1.isLigado()) {
			System.out.println("A tv do modelo 001 está ligada!");
			tv1.desligar();
		} else {
			System.out.println("A tv do modelo 001 está desligada!");
		}
		if (tv2.isLigado()) {
			System.out.println("A tv do modelo SDX está ligada!");
			tv2.desligar();
		} else {
			System.out.println("A tv do modelo SDX está desligada!");
		}

		{

		}

	}
}
