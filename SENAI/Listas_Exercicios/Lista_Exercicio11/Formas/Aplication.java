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

        System.out.println("Digite o número de figuras: ");
        contador = user.nextInt();

        for (int valor = 1; valor <= contador; valor++) {

            System.out.println("Retângulo, Círculo ou Trapézio (r/c/t)?: ");
            tipoForma = user.next();
            user.nextLine(); // limpar buffer

            System.out.println("Cor (PRETO/AZUL/VERMELHO): ");
            respostaCor = user.next();

            // Caso seja retângular
            if (tipoForma.equalsIgnoreCase("r")) {

                System.out.println("Largura: ");
                largura = user.nextDouble();

                System.out.println("Altura: ");
                altura = user.nextDouble();

            }
            // Caso seja Circulo
            else if (tipoForma.equalsIgnoreCase("c")){

                System.out.println("Raio: ");
            }

        }
    }
}
