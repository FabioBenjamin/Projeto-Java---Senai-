import java.util.Scanner;

public class Exercicio4_Extra {
	public static void main(String[] args) {
		Scanner tabuada = new Scanner(System.in);

		int contagem;
		int numero;
		int resultado;
		int calculo; 

		
			System.out.printf("\n Digite um numero: ");
			numero = tabuada.nextInt();
			
			System.out.println(" Digite ate quando deseja calcular: ");
			calculo = tabuada.nextInt();
			

			for (resultado = 1; resultado <= calculo; resultado++) {

				System.out.printf("%d x %d = %d \n", numero, resultado, (numero * calculo));

			}

		
		tabuada.close();
	}
}


