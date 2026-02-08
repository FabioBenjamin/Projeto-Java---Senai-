package Matriz;

import java.util.Arrays;

public class ordenacaoDecrescente {
    public static void main(String[] args) {
        int[][] matriz = {
                {5, 2, 9},
                {1, 8, 3},
                {4, 7, 6}
        };

        // Ordenação da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
        Arrays.sort(matriz[linha]); // Ordem decrescente da matriz
            for (int coluna = matriz[linha].length - 1; coluna >= 0; coluna--) {
                System.out.printf(matriz[linha][coluna] + "");
            }
            System.out.println();
        }
    }
}
