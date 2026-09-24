package util;

public class Conversao {

	public static double quilometrosMilhas(double km) {

		return km * 0.62;
	}

	public static double milhasQuilometros(double milha) {
		return milha / 0.62;
	}

	public static double pesCentimetros(double pes) {
		return pes * 30.48;
	}

	public static double centimetrosPes(double cm) {
		return cm / 30.48;
	}

	public static double polegadasCentimetros(double pol) {
		return pol * 2.54;

	}

	public static double centimetrosPolegadas(double cm) {
		return cm / 2.54;

	}

}
