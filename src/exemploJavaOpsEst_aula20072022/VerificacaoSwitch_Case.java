package exemploJavaOpsEst_aula20072022;

import java.util.Scanner;

// identificador de meses do ano pelo número com aplicação do comando "switch/case".

public class VerificacaoSwitch_Case {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int teste;
		System.out.println("Informe o número do mês:");
		teste = teclado.nextInt();
		switch (teste) {
		case 1:
			System.out.println("Janeiro.");
			break;
		case 2:
			System.out.println("Fevereiro.");
			break;
		case 3:
			System.out.println("Março.");
			break;
		case 4:
			System.out.println("Abril.");
			break;
		case 5:
			System.out.println("Maio.");
			break;
		case 6:
			System.out.println("Junho.");
			break;
		case 7:
			System.out.println("Julho.");
			break;
		case 8:
			System.out.println("Agosto.");
			break;
		case 9:
			System.out.println("Setembro.");
			break;
		case 10:
			System.out.println("Outubro.");
			break;
		case 11:
			System.out.println("Novembro.");
			break;
		case 12:
			System.out.println("Dezembro.");
			break;
		default:
			System.out.println("Digite apenas números entre 1 e 12.");
		}
		teclado.close();
	}
}
