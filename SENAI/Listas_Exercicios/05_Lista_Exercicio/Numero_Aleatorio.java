import java.util.Scanner;
import java.util.Random;

public class Numero_Aleatorio {
	public static void main(String[] args) {
		
		Scanner aleatorio = new Scanner(System.in);
		Random numeros = new Random();
		
		int numero = 0;
		int tentativas = 0;
		
		numero = numeros.nextInt(10) + 1; // Gera um numero aleatorio de 1 a 10
		
		while (tentativas != numero) {
			System.out.println("Digite um numero de 1 a 10");
			tentativas = aleatorio.nextInt();
			tentativas++;
			
			if (tentativas < numero) {
				System.out.println("Numero muito baixo, tente novamente");
				
			} else if (tentativas > numero) {
				System.out.println("Numero muito alto, tente novamente");
				
			} else {
				System.out.println("Numero Certo");
				
			}
			
		}
		
		aleatorio.close();
	}
}
