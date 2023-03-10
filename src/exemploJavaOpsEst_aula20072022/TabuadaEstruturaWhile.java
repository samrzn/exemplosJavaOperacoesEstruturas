package exemploJavaOpsEst_aula20072022;

import java.util.Scanner;

// tabuada de multiplicação utilizando estrutura de repetição "while".

public class TabuadaEstruturaWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira um número:");
		int numero = teclado.nextInt();
		int i = 1;
		while (i <= 10) {
			System.out.println(i + " x " + numero + " = " + (i * numero));
			i++;
		}
		teclado.close();
	}
} 