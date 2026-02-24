package Lista_Exercicio12.Contribuentes;

import java.util.Scanner;

// Class main
public class Aplication {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int contador;
        String escolha;
        String nome;
        double rendaAnual;

        // Individual
        double gastoSaude;

        // Empresa
        int funcionarios;


        System.out.println("Digite o número de contribuintes: ");
        contador = user.nextInt();

        arya[] contri = new arya[contador];

        for (int valor = 0; valor < contador; valor++) {

            System.out.println("Individual ou empresa (i/e)? - ");
            escolha = user.next();

            System.out.println("Nome: ");
            nome = user.next();

            System.out.println("Renda anual: ");
            rendaAnual = user.nextDouble();

            // Caso seja individual
            if (escolha.equalsIgnoreCase("i")) {

                System.out.println("Gastos com saúde: ");
                gastoSaude = user.nextDouble();

                arya[valor] = new individuo(nome, rendaAnual, gastoSaude);

            }
            // Caso seka empresa
            else if (escolha.equalsIgnoreCase("e")) {

                System.out.println("Número de funcionários: ");
                funcionarios = user.nextInt();

                arya[valor] = new empresa(nome, rendaAnual, funcionarios);

            }

            System.out.printf("%-15s %-10s %-15s %-15s%n",
                    "Tipo", "nome", "renda Anual", "Gasto com saúde");

            for (Contribuente contribuente : contri) {

                String tipo = contribuente.getClass().getSimpleName();

                System.out.printf("%-15s %-10s %-15.2f %-15.2f%n",
                        tipo,
                        contribuinte.nome,
                        contribuinte.rendaAnual,
                        contribuinte.calculoImposto());
            }
        }
    }
}
