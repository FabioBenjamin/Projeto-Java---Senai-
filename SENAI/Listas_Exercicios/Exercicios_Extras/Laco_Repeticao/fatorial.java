import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner numeroReal = new Scanner(System.in);

        int numero, numeroGuardado;
        long numeroFatorial = 1;

        System.out.println("Insira um numero: ");
        numero = numeroReal.nextInt();

        numeroGuardado = numero; // Armazena o valor inserido para aparecer no primeiro %d

        while (numero > 0) {
            numeroFatorial *= numero;
            numero--;

        }

        System.out.printf("A fatoração do %d é de: %d", numeroGuardado, numeroFatorial);

        numeroReal.close();
    }
}
