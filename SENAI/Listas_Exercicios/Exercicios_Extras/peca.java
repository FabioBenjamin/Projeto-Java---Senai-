import java.util.Scanner;

public class peca {
    public static void main(String[] args) {
        Scanner pecas = new Scanner(System.in);

        double valor1, valor2; 
        double quant, quant2;
        double api = 14.3;
        double somaTotal;
        
        System.out.println("Digite o valor unitario do produto 1: ");
        valor1 = pecas.nextDouble();

        System.out.println("Digite o valor unitario do produto 2: ");
        valor2 = pecas.nextDouble();

        System.out.println("Digite a quantidade do produto 1: ");
        quant = pecas.nextDouble();

        System.out.println("Digite a quantidade do produto 2: ");
        quant2 = pecas.nextDouble();
 

        somaTotal = (valor1 * quant + valor2 * quant2) * (api / 100 + 1);

        System.out.println("O valor total a ser pago é " + somaTotal);

        pecas.close();
    }
}
