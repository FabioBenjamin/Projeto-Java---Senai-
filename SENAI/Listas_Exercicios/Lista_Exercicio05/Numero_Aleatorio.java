import java.util.Scanner;
import java.util.Random;

public class Numero_Aleatorio {
	public static void main(String[] args) {
		
		Scanner aleatorio = new Scanner(System.in);
		Random numeros = new Random();
		
		int numero = numeros.nextInt(10) + 1; // Gera um numero aleatorio de 1 a 10
		int tentativas = 0;
		int tentativaUsuario;
		int tentativaMaxima = 5;

		while (tentativas != numero) {
			System.out.println("Digite um numero de 1 a 10");
			tentativaUsuario = aleatorio.nextInt();
			tentativas++;
			
			if (tentativaUsuario < numero) {
				System.out.println("Numero muito baixo, tente novamente");

			} else if (tentativaUsuario > numero) {
				System.out.println("Numero muito alto, tente novamente");

			} else {
				System.out.println("Numero Certo" + tentativas);
				break;
				
			}

			if (tentativas == tentativaMaxima) {
				System.out.println("Excesso de tentativas, o número era: " + numero);
			}

			} 

			aleatorio.close();
			
	}
}

