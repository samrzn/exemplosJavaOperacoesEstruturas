package exemploJavaOpsEst_aula20072022;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	static class Peca{
		int codigo;
		int quantidade;
		double preco;
	}
	
	public static void main(String[] args) {
		ArrayList<Peca> pecas = new ArrayList<>();	
		Scanner teclado = new Scanner(System.in);
		boolean parar = false;
		while(!parar) {
			System.out.println("Incluir peça? (S/N)");
			String resposta = teclado.nextLine();
			resposta = resposta.toUpperCase();
			if(resposta.equals("S")) {
				Peca p = new Peca();
				System.out.println("Código:");
				p.codigo = teclado.nextInt();
				System.out.println("Quantidade:");
				p.quantidade = teclado.nextInt();
				System.out.println("Preço:");
				p.preco = teclado.nextDouble();
				pecas.add(p);
			}
			else {
				parar = true;
			}
		}
		teclado.close();
		
	}

}
