package exemploJavaOpsEst_aula20072022;

import java.util.Scanner;

// utilização da estrutura de repetição "for" para ferramenta de adição com 10 números.

public class EstruturaRepeticaoForBasico {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int soma = 0;
		System.out.println("Insira 10 números:");
		for (int i = 1; i <= 10; i++) {
			soma += teclado.nextInt();
		}
		System.out.println("Resultado da soma é: " + soma);
		teclado.close();
	}
}