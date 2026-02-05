import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner moveis = new Scanner(System.in);

        int linhas = 3;
        int colunas = 3;
        double[][] matriz = new double[linhas][colunas];
        double produto;

        System.out.println("Digite os resultados dos testes de qualidade: ");
        produto = moveis.nextInt();

        for(int valor = 0 ; valor < linhas ; valor++) {
            for (int valor2 = 0 ; valor2 < colunas ; valor2++) {
                System.out.println("[" + valor + "][" + valor2 + "]: ");
                matriz[valor][valor2] = moveis.nextInt();
            }
        }

        // Media das linhas
        for (int valor = 0; valor < linhas; valor++) {
            double mediaLinha = 0; // Reinicia a soma para cada nova linha
            for (int valor2 = 0; valor2 < colunas; valor2++) {
                mediaLinha += matriz[valor][valor2] / 3; // Soma os elementos da linha
            }
            // Aparece a media das linhas
            System.out.println("A media das linhas é: \n" + mediaLinha);
                }
                System.out.println();

        moveis.close();
    }


}


