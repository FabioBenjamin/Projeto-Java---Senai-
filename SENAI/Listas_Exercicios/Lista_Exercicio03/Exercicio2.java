import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
		Scanner sequencia = new Scanner(System.in);
		

		int somaDosPares = 0;
		double mediaDaSoma = 0;
		int qtdePares = 0; 
		
		for(int numero = 1 ; numero <= 5;) {
			
			System.out.println("Digite o numero: ");
			numero = sequencia.nextInt();
			
			if (numero == 0 ) {
				System.out.println("Acabou");
				break;
			}
			
			
			if (numero % 2 == 0 ) {
				somaDosPares += numero;
				qtdePares++;
			
			}
		
		}
		
		mediaDaSoma = somaDosPares / qtdePares;
		
		System.out.println("Media dos numeros: " + mediaDaSoma);
		
		sequencia.close();
	}
}
