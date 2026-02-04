import java.util.Scanner;

public class antecessor {
    public static void main(String[] args) {
        Scanner numeroAntes = new Scanner(System.in);

        int numero; 
        int antes;
        
        System.out.println("Digite um numero: ");
        numero = numeroAntes.nextInt();

        antes = numero - 1;

        System.out.println("O numero que é anterior ao seu é: " + antes);

        numeroAntes.close();
    }
}
