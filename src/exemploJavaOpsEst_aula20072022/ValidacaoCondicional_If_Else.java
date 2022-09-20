package exemploJavaOpsEst_aula20072022;

import java.util.Scanner;

public class ValidacaoCondicional_If_Else {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual é a sua idade?");
		int idade = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Qual o seu gênero?");
		String genero = teclado.nextLine();
		if (idade > 18 && genero.equals("Feminino")) {
			System.out.println("Próxima etapa liberada!");
		} else {
			System.out.println("Acesso negado.");
		}
	}
}
