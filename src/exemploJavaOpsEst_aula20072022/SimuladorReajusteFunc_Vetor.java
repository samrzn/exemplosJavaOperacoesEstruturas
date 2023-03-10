package exemploJavaOpsEst_aula20072022;

import java.util.Scanner;

// simulação de sistema para cálculo reajuste de pagamentos utilizando vetor e estrutura "for".

public class SimuladorReajusteFunc_Vetor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final int size = 5;
		String[] nome = new String[size];
		double[] salario = new double[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Nome do " + (i + 1) + "º funcionário:");
			nome[i] = teclado.next();
			System.out.println("Remuneração mensal:");
			salario[i] = teclado.nextDouble();
		}
		System.out.println("Informe a porcentagem do reajuste:");
		double reajuste;
		reajuste = teclado.nextDouble();
		for (int i = 0; i < size; i++) {
			System.out.println("Nome: " + nome[i] + " - Nova remuneração mensal: " + 
					(salario[i] += salario[i] * reajuste / 100));
		}
		teclado.close();
	}
} 