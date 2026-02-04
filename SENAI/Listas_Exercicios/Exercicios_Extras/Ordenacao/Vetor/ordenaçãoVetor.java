import java.util.Arrays;

public class ordenaçãoVetor {   
	public static void main(String[] args) {
		Integer[] ordenacao = new Integer[10];
		
		int[] numeros = {5, 10, 7, 6, 16, 3, 9, 2, 5, 1}; // Lista sem ordem
		
        // Ordenação crescente 
		Arrays.sort(numeros); // Método de organização crescente dos elementos
		for (int valor = 0 ; valor < numeros.length ; valor++) {
			System.out.println(numeros[valor] + " ");
		}
		ordenacao.clone();
	}
}