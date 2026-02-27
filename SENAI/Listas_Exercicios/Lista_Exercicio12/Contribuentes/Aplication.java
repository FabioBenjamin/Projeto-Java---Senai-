package Contribuentes;

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

        Contribuente[] contri = new Contribuente[contador];

        for (int valor = 0; valor < contador; valor++) {

            System.out.println("Individual ou empresa (i/e)? - ");
            escolha = user.next();

            System.out.println("Nome: ");
            nome = user.next();

            System.out.println("Renda anual: ");
            rendaAnual = user.nextDouble();

            // Caso seja individual
            if (escolha.equalsIgnoreCase("i")) {

                System.out.print("Gastos com saúde: ");
                gastoSaude = user.nextDouble();

                contri[valor] = new Individual(nome, rendaAnual, gastoSaude);
            }
            // Se for empresa
            else {

                System.out.print("Número de funcionários: ");
                funcionarios = user.nextInt();

                contri[valor] = new Empresa(funcionarios, nome, rendaAnual);
            }
        }

        // Exibição dos impostos
        System.out.println("\nIMPOSTOS PAGOS:");

        for (Contribuente contribuente : contri) {

            System.out.println(
                    contribuente.getNome()
                    + " - R$ "
                    + String.format("%.2f", contribuente.calculoImposto())
            );
        }

        user.close();
    }
}

