import java.util.Scanner;

public class industria {
	public static void main(String[] args) {
		Scanner resultados = new Scanner(System.in);
		
		int linhas = 3;
        int colunas = 3;
        int[][] matriz = new int[linhas][colunas];
		int testeResistencia;
		
		System.out.println("Insira os resultados dos testes: ");
		testeResistencia = resultados.nextInt();
		
		for (int valor1 = 0 ; valor1 < linhas ; valor1++) {
			for (int valor2 = 0 ; valor2 < colunas ; valor2 ++) {
			System.out.print("Elemento [" + valor1 + "][" + valor2 + "]: ");
            matriz[valor1][valor2] = resultados.nextInt();
			}
		}
		
		System.out.println("Insira o codigo do produto que você deseja achar: ");
		int codigo = resultados.nextInt();
	
		// Encontrar o valor na matriz
		for (int valor1 = 0 ; valor1 < linhas ; valor1++) {
			for (int valor2 = 0 ; valor2 < colunas ; valor2++) {
				if (matriz[valor1][valor2] == codigo) {
					System.out.println("Encontrado! Linha: " + valor1 + ", Coluna: " + valor2);
				}
			}
			System.out.println();
		}
		
		resultados.close();
	}
}

