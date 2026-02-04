import java.util.Scanner;

public class Exerc_Vetor02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroAleatorio[] = new int[10];
				
		
		// Leitura de dados do vetor
		for (int indice = 0; indice < 10 ; indice++) {
			System.out.printf("Digite um numero aleatorio para a %d posição: ", (indice + 1));
			numeroAleatorio[indice] = sc.nextInt();
		}
		
		// Inversão do vetor 
		for (int indice = 0 ; indice < numeroAleatorio.length / 2 ; indice++ ) {
			int guardaValor = numeroAleatorio[indice]; 
			numeroAleatorio[indice] = numeroAleatorio[numeroAleatorio.length - 1 - indice];
			numeroAleatorio[numeroAleatorio.length - 1 - indice] = guardaValor;
		}
		
		// Saída de dados do vetor
		System.out.println("\nVetor em ordem inversa:");
        for (int indice = 0; indice < numeroAleatorio.length; indice++) {
            System.out.printf("Posição %d - %d%n", indice + 1, numeroAleatorio[indice]);
        }

		 sc.close();
	}
}
