import java.util.Scanner;

public class Exerc_Vetor03 {
    public static void main(String[] args) {
        Scanner media = new Scanner(System.in);

        int numero[] = new int[5];
        int nsoma[] = new int[5];
        int mediaVetor;
        int soma = 0;

        // Entrada de valores
        for (int valor = 0; valor < nsoma.length ; valor++) {
			System.out.printf("Digite um numero aleatorio para a %d posição: ", (valor + 1));
			numero[valor] = media.nextInt();
            soma += numero[valor];
        }

        //Media dos valores do usuário 
        mediaVetor = soma / nsoma.length;

        // Saída dos valores
        System.out.printf("A media dos valores fornecidos são: %d", mediaVetor);

        media.close();
    }
}
