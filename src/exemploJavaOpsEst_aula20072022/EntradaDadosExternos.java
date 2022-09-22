package exemploJavaOpsEst_aula20072022;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

// exemplo entrada de dados com Scanner através de arquivo externo.

public class EntradaDadosExternos {

	public static void main(String[] args) throws IOException {
		File arq = new File("C:\\Users\\Remakker\\Documents\\Repositórios\\exemplosJava"
				+ "\\exemplosJavaOperadoresEstruturas\\valoresExemplo.txt");
		FileInputStream arqIn = new FileInputStream(arq);
		Scanner entrada = new Scanner(arqIn);
		int soma = 0;
		while (entrada.hasNext()) {
			soma += entrada.nextInt();
		}
		System.out.println(soma);
		entrada.close();
		arqIn.close();
	}
}