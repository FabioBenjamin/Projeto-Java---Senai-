package Matriz;

import java.util.Scanner;

public class matrizPula2 {
    public static void main(String[] args) {
        Scanner leituraNumero = new Scanner(System.in);

        int numero;
        int[][] matriz = new int[8][4];
        int linha = 0;

        System.out.println("Digite um numero: ");
        numero = leituraNumero.nextInt();

        int valorAtual = numero;

        // Prencher a matriz
        while (linha < matriz.length) {
            int coluna = 0;

            while (coluna < matriz[linha].length) {
                matriz[linha][coluna] = valorAtual;
                valorAtual += 2;
                coluna++;
            }
            linha++;
        }

        // Exibição da matriz 8x4
        System.out.println("Resultado da matriz");
        linha = 0;

        while (linha < matriz.length) {
            int coluna = 0;

            while (coluna < matriz[linha].length) {
                System.out.print(matriz[linha][coluna] + " ");
                coluna++;
            }
            System.out.println();
            linha++;
        }

        leituraNumero.close();

    }
}
