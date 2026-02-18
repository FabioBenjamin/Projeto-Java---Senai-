import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
		Scanner maiorMenor = new Scanner(System.in);
		
		int maior = 0;
		int menor = 0;
        int contagem;
        int numero; 
	
		for (contagem = 1; contagem <= 50; contagem++) {
			System.out.println("Digite um numero: ");
			numero = maiorMenor.nextInt();
		
            // 
            if (contagem == 0){
                maior = numero;
                menor = numero;

            } else {
                if (numero > maior) maior = numero; // Atualiza o maior numero
                if (numero < menor) menor = numero; // Atualiza o menor numero

            }

        }   

        System.out.printf("O maior numero é %d e o menor numero é %d", maior, menor);
		
		maiorMenor.close();
	}
}
