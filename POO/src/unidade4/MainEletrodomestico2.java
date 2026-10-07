package unidade4;

import java.util.ArrayList;

public class MainEletrodomestico2 {
	public static void main(String[] args) {
		ArrayList<Eletrodomestico> eletros = new ArrayList<Eletrodomestico>();
		eletros.add(new TV(110,800));
		eletros.add(new Radio(110));
		eletros.add(new MaquinaDeLavar(110));
		
		
		//fazer de forma mais enxuta pegar os exercícios e transformar cada exercício em função
		//ligar os automoveis
		for (Eletrodomestico eletrodomestico : eletros) {
			eletrodomestico.ligar();// polimorfismo
		}
		for (Eletrodomestico eletrodomestico : eletros) {
			if(eletrodomestico instanceof Radio) {
				if(!eletrodomestico.isLigado()) {
					eletrodomestico.ligar();
				}
				((Radio) eletrodomestico).setVolume(15);
				((Radio) eletrodomestico).setSintonia(101.5);
				eletrodomestico.setVoltagem(220);
			}
		}
		for (Eletrodomestico eletrodomestico : eletros) {
			if(eletrodomestico instanceof TV) {
				if(!eletrodomestico.isLigado()) {
					eletrodomestico.ligar();
				}
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
