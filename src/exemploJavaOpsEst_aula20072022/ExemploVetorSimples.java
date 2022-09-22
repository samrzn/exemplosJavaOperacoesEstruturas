package exemploJavaOpsEst_aula20072022;

// exemplo simples de aplicação prática de vetor.

public class ExemploVetorSimples {

	public static void main(String[] args) {
		int vetor1[] = { 2, 4, 6, 8, 10 };
		int vetor2[] = new int[5];
		for (int i = 0; i < 5; i++) {
			vetor2[i] = vetor1[i] * 11;
		}
		System.out.println("==> Multiplicando por 11 <==");
		for (int i = 0; i < 5; i++) {
			System.out.println(vetor1[i] + " x 11 = " + vetor2[i]);
		}
	}
}