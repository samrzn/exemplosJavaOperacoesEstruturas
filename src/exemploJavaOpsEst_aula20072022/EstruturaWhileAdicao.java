package exemploJavaOpsEst_aula20072022;

import java.util.Scanner;

// ferramenta básica para soma de valores utilizando estrutura de repetição "while".

public class EstruturaWhileAdicao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor = 0;
		int soma = 0;
		System.out.println("Informe um valor:");
		valor = teclado.nextInt();
		while (valor != 0) {
			soma += valor;
			System.out.println("Informe um valor | Digite 0 para obter o resultado.");
			valor = teclado.nextInt();
		}
		System.out.println("Resultado = " + soma);
		teclado.close();
	}
}