package exemploJavaOpsEst_aula20072022;

import java.util.Scanner;

// aplicação de vetor para armazenar valores em posições e exibir no console.

public class ArmazenamentoDadosVetor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] dados = new double[7];
		for (int i = 0; i < 7; i++) {
			System.out.println("Informe " + (i + 1) + "º valor:");
			dados[i] = teclado.nextDouble();
		}
		System.out.println("==> Dados armazenados no vetor <==");
		for (int i = 0; i < 7; i++) {
			System.out.println("Valor na posição " + i + " = " + dados[i]);
		}
		teclado.close();
	}
} 