import java.util.Scanner;

public class fabrica { 
	public static void main(String[] args) {
		Scanner pecas = new Scanner(System.in);
		
		int linhas = 3;
        int colunas = 3;
        int[][] matriz = new int[linhas][colunas];
		int testeResistencia;
		
		System.out.println("Insira os resultados dos testes: ");
		testeResistencia = pecas.nextInt();
		
		for (int valor1 = 0 ; valor1 < linhas ; valor1++) {
			for (int valor2 = 0 ; valor2 < colunas ; valor2 ++) {
			System.out.print("Elemento [" + valor1 + "][" + valor2 + "]: ");
            matriz[valor1][valor2] = pecas.nextInt();
			}
		}
	
		for (int valor1 = 0 ; valor1 < linhas ; valor1++) {
			for (int valor2 = 0 ; valor2 < colunas ; valor2++) {
				System.out.printf("[%d]", matriz[valor1][valor2]);
			}
			System.out.println();
		}
		
		pecas.close();
	}
}