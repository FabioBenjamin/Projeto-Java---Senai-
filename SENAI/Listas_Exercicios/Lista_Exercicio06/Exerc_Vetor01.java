import java.util.Scanner;

public class Exerc_Vetor01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero[] = new int[10];
		int somaTotal = 0;		
		
		// Leitura de dados do vetor
		for (int indice = 0; indice < 10 ; indice++) {
			System.out.printf("Digite o numero para a %d posição: ", (indice + 1));
			numero[indice] = sc.nextInt();
		}
		
		// Saída de dados do vetor
		for (int indice = 0; indice < 10 ; indice++) {
			somaTotal += numero[indice];
			System.out.printf("Soma total: %-20d %n", somaTotal); 
		
		}
		 Exerc_Vetor01.close();
	}
}
