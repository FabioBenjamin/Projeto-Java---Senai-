import java.util.Scanner;

public class saldo {
    public static void main(String[] args) {
        Scanner saldo = new Scanner(System.in);

        double valor;
        double reajuste = 0.01;
        double resultado;

        System.out.println("Digite um valor: ");
        valor = saldo.nextDouble();

        resultado = valor * reajuste;
        double resultadoFinal = valor - resultado;

        System.out.printf("O valor com reajuste %f", resultadoFinal);


        saldo.close();
    }
}
