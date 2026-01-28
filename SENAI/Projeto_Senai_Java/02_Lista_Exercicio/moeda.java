import java.util.Scanner;

public class moeda {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        double valorDolar;

        System.out.println("Digite um valor em reais: ");
        double reais = valor.nextDouble();

        System.out.println("Digite a cotação do dólar: ");
        double dolar = valor.nextDouble();

        // Logica 

        valorDolar = reais / dolar;
        System.out.printf("Valor do real em dólar: %.2f", valorDolar);


        valor.close();

    }
}
