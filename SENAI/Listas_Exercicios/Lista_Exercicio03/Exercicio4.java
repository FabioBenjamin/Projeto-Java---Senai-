import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner tabuada = new Scanner(System.in);

		int contagem;
		int numero;
		int resultado;

		for (contagem = 1; contagem <= 10; contagem++) {
			System.out.printf("\n Digite o numero %d: ", contagem);
			numero = tabuada.nextInt();

			for (resultado = 1; resultado <= numero; resultado++) {

				System.out.printf("%d x %d = %d \n", numero, resultado, (numero * resultado));

			}

		}
		
		tabuada.close();
	}
}
