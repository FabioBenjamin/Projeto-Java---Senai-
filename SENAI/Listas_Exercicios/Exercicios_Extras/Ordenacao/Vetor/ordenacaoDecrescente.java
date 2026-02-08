package Vetor;

import java.util.Arrays;
import java.util.Collections;

public class ordenacaoDecrescente {
    public static void main(String[] args) {

        Integer[] numeros = {5, 10, 7, 6, 16, 3, 9, 2, 5, 1}; // Lista sem ordem

        // Ordenação decrescente
        Arrays.sort(numeros, Collections.reverseOrder());
            System.out.printf(Arrays.toString(numeros));
    }
}
