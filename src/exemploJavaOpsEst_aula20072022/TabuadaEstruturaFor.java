package exemploJavaOpsEst_aula20072022;

import java.util.Scanner;

// tabuada de multiplicação utilizando estrutura de repetição "for".

public class TabuadaEstruturaFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira um número:");
		int numero = teclado.nextInt();
		for (int i = 1; i <= 10; i++) {
		System.out.println(i + " x " + numero + " = " + (i * numero));
		}
		teclado.close();
	}
}
