import java.text.DecimalFormat;
import java.util.Scanner;

public class salario {
    public static void main(String[] args) {

        Scanner dinheiro = new Scanner(System.in);
        DecimalFormat simplificacao = new DecimalFormat("##.##");

        double salario_min = 788.00;
        double salario_user;
        double comparativo = 1;

        System.out.println("Digite seu salario: ");
        salario_user = dinheiro.nextDouble();

        comparativo = salario_user / salario_min;

        // DecimalFormat não pode ser usado com printf e tem que ser TUDO MINUSCULO SEU PORRA
        System.out.println("Você ganha "  + simplificacao.format(comparativo) + " de salários mínimos");



        dinheiro.close();
    }
}
