package unidade4;

import java.util.ArrayList;

public class MainEletrodomestico {
	public static void main(String[] args) {
		ArrayList<Eletrodomestico> eletros = new ArrayList<Eletrodomestico>();
		eletros.add(new TV(true,110,4,25,29));
		eletros.add(new Radio(false,110,4,40,100.1));
		eletros.add(new MaquinaDeLavar(false,110,3));
		
		//ligar os automoveis
		for (Eletrodomestico eletrodomestico : eletros) {
			eletrodomestico.ligar();
		}
		for (Eletrodomestico eletrodomestico : eletros) {
			if(eletrodomestico instanceof Radio) {
				((Radio) eletrodomestico).setVolume(15);
				((Radio) eletrodomestico).setSintonia(101.5);
				eletrodomestico.setVoltagem(220);
			}
		}
		for (Eletrodomestico eletrodomestico : eletros) {
			if(eletrodomestico instanceof TV) {
				((TV) eletrodomestico).setCanal(12);
			}
		}
		for (Eletrodomestico eletrodomestico : eletros) {
			System.out.println(eletrodomestico.toString());
		}
		for (Eletrodomestico eletrodomestico : eletros) {
			if(eletrodomestico instanceof MaquinaDeLavar) {
				eletrodomestico.desligar();
			}
		}
		
		
	}

}
