import java.util.Scanner;

public class Par_ou_mul {
    public static void main(String[] args) {
        Scanner verificar = new Scanner(System.in);

        System.out.println("Digite um numero");
        double numero = verificar.nextDouble();

        // Parte logica 

        if (numero % 2 == 0 && numero % 5 == 0){
            System.out.println("O número é par e múltiplo de 5");

        } else {
            System.out.println("O número não atende aos críterios");

        }

        verificar.close();

    }
}
