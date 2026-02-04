import java.util.Arrays;

public class teste { // ordenaçãoMatriz
	public static void main(String[] args) {
        int[][] matriz = {
            {5, 2, 9},
            {1, 8, 3},
            {4, 7, 6}
        };
        	
        // Ordenação da matriz 
        for (int valor = 0 ; valor < matriz.length ; valor++) {
        	Arrays.sort(matriz[valor]); // Ordem crescente da matriz
        };
        
        // Exibição da matriz 
        for(int[] linha : matriz) {
        	System.out.println(Arrays.toString(linha)); // Arrays.toString - converte arrays unidimensionais em string legível
        }
	}
}