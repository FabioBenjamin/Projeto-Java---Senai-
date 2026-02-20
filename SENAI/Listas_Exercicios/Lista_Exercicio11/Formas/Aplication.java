package Lista_Exercicio11.Formas;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int contador;
        String tipoForma;
        String respostaCor;

        // Retangulo
        double largura;
        double altura;

        // Circulo
        double raio;

        // Trapezio
        double baseMaior;
        double baseMenor;

        System.out.println("Digite o número de figuras: ");
        contador = user.nextInt();

        Forma[] formas = new Forma[contador];

        for (int valor = 0; valor < contador; valor++) {

            System.out.println("Retângulo, Círculo ou Trapézio (r/c/t)?: ");
            tipoForma = user.next();

            // Validação das cores
            Cor cor = null;

            while (cor == null) {
                System.out.println("Cor (PRETO/AZUL/VERMELHO): ");
                respostaCor = user.next();

                try {
                    cor = Cor.valueOf(respostaCor.toUpperCase());
                } catch (IllegalArgumentException e) {
                    System.out.println("Cor inválida! Digite novamente.");
                }
            }

            // Caso seja Retangulo
            if (tipoForma.equalsIgnoreCase("r")) {

                System.out.println("Largura: ");
                largura = user.nextDouble();

                System.out.println("Altura: ");
                altura = user.nextDouble();

                formas[valor] = new Retangulo(largura, altura, cor);

            }
            // Caso seja Circulo
            else if (tipoForma.equalsIgnoreCase("c")) {

                System.out.println("Raio: ");
                raio = user.nextDouble();

                formas[valor] = new Circulo(raio, cor);

            }
            // Caso seja Trapezio
            else if (tipoForma.equalsIgnoreCase("t")) {
                System.out.println("Base Maior: ");
                baseMaior = user.nextDouble();

                System.out.println("Base Menor: ");
                baseMenor = user.nextDouble();

                System.out.println("Altura: ");
                altura = user.nextDouble();

                formas[valor] = new Trapezio(baseMenor, baseMaior, altura, cor);

            }
        }

        System.out.printf("%-15s %-10s %-15s %-15s%n",
                "Tipo", "Cor", "Área", "Perímetro");

        for (Forma formatos : formas) {

            String tipo = formatos.getClass().getSimpleName();

            System.out.printf("%-15s %-10s %-15.2f %-15.2f%n",
                    tipo,
                    formatos.getCor(),
                    formatos.area(),
                    formatos.perimetro());
        }

        user.close();
    }
}
