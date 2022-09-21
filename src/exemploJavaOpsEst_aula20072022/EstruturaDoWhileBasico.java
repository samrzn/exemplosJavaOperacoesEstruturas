package exemploJavaOpsEst_aula20072022;

import java.util.Scanner;

//ferramenta para divisão de valores utilizando a estrutura de repetição "do while".

public class EstruturaDoWhileBasico {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double v1 = 0, v2 = 0;
		double resultado = 1;
		System.out.println("Informe um valor:");
		v1 = teclado.nextInt();
		do {
			System.out.println("Informe um valor.");
			v2 = teclado.nextInt();
		} while (v2 == 0);
		resultado = v1 / v2;
		System.out.println("A divisão de " + v1 + " por " + v2 + " = " + resultado);
		teclado.close();
	}
}