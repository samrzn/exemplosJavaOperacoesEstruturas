package exemploJavaOpsEst_aula20072022;

import java.util.Scanner;

// verificador de times por estado com utilização do comando "switch/case".

public class SwitchCase_Exemplo2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String time;
		System.out.println("Informe o nome do time:");
		time = teclado.nextLine();
		switch (time) {
		case "Cruzeiro":
		case "América":
		case "Atlético":
			System.out.println("Time de MG.");
			break;
		case "Botafogo":
		case "Flamengo":
		case "Fluminense":
		case "Vasco":
			System.out.println("Time do RJ.");
			break;
		case "Corinthians":
		case "Palmeiras":
		case "São Paulo":
		case "Santos":
			System.out.println("Time de SP.");
			break;
		default:
			System.out.println("Time fora do eixo Rio/Minas/Sampa.");
		}
		teclado.close();
	}
}