import java.util.Scanner;

public class soma {
	public static void main(String[] args) {
		Scanner resultados = new Scanner(System.in);
		
		int linhas = 3;
        int colunas = 3;
        int[][] matriz = new int[linhas][colunas];
        int[][] soma = new int[3][3];
		int testeResistencia;
		
		System.out.println("Insira os registros de temperatura: ");
		testeResistencia = resultados.nextInt();
		
		for (int valor1 = 0 ; valor1 < linhas ; valor1++) {
			for (int valor2 = 0 ; valor2 < colunas ; valor2 ++) {
			System.out.print("Elemento [" + valor1 + "][" + valor2 + "]: ");
            matriz[valor1][valor2] = resultados.nextInt();
			}
		}
		
		//Soma das colunas
		for (int valor1 = 0 ; valor1 < linhas ; valor1++) {
			for (int valor2 = 0 ; valor2 < colunas ; valor2++) {
				soma[valor1][valor2] = matriz[valor1][valor2] + matriz[valor1][valor2] + matriz[valor1][valor2];
			}
		}
		
		// Encontrar o valor na matriz
		for (int valor1 = 0 ; valor1 < linhas ; valor1++) {
			for (int valor2 = 0 ; valor2 < colunas ; valor2++) {
				System.out.println("A soma das colunas são: \n" + soma[valor1][valor2]);
			}
			System.out.println();
		}
		
		resultados.close();
	}
}