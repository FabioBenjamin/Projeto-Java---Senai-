import java.util.Scanner;

public class desafioSenai {

    // Metodo soma dia
    public static int somaDia(int[][] matriz) {
        int soma = 0;

        for (int valor1 = 0 ; valor1 < matriz.length ; valor1++) {
            for (int valor2 = 0 ; valor2 < matriz[valor1].length ; valor2++) {
                soma += matriz[valor1][valor2];
            }
        }
        return soma;
    }

    // Metodo soma turno
    public static int somaTurno(int[][] matriz, int turno) {
        int soma = 0;

        for (int valor2 = 0 ; valor2 < matriz[turno].length ; valor2++) {
            soma += matriz[turno][valor2];
        }
        return soma;
    }

    // Metodo soma produto
    public static int somaProduto(int[][] matriz, int produto) {
        int soma = 0;

        for (int valor1 = 0 ; valor1 < matriz.length ; valor1++) {
            soma += matriz[valor1][produto];
        }
        return soma;
    }

    // Metodo de contagem de valor
    public static int contador(int[][] matriz, int valor) {
        int contador = 0;

        for (int valor1 = 0; valor1 < matriz.length ; valor1++) {
            for (int valor2 = 0; valor2 < matriz[valor1].length ; valor2++) {
                if (matriz[valor1][valor2] == valor) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {

        int[][] tabela = {
                {10, 5, 8, 6},
                {7, 9, 4, 10},
                {6, 3, 12, 5}
        };

        int linhas = tabela.length;
        int colunas = tabela[0].length;

        // Exibição da matriz
        for (int valor1 = 0; valor1 < linhas; valor1++) {
            for (int valor2 = 0; valor2 < colunas; valor2++) {
                System.out.printf("[%d]", tabela[valor1][valor2]);
            }
            System.out.println();
        }

        // Exibição dos dias
        System.out.println("\nTotal do dia: " + somaDia(tabela));

        // Exibição dos turnos
        for (int valor1 = 0; valor1 < tabela.length; valor1++) {
            System.out.printf("\nTotal turno %d: %d", valor1, somaTurno(tabela, valor1));
        }

        // Exibição dos produtos
        for (int valor2 = 0; valor2 < tabela[0].length; valor2++) {
            System.out.printf("\nTotal produto %d: %d", valor2, somaProduto(tabela, valor2));
        }

        // Contagem de quantas vezes aparece 10
        System.out.printf("\nO valor 10 aparece: %d vezes", contador(tabela, 10));

        // Entradas do usuario
        Scanner usuario = new Scanner(System.in);
        System.out.println("\nDigite o número do produto (0 a 3): ");
        int produto = usuario.nextInt();

        System.out.printf("Total do produto %d: %d", produto, somaProduto(tabela, produto));

        usuario.close();
    }
}
