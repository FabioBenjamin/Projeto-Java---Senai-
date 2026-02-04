import java.util.Scanner;

// Incompleto 

public class matrizValor {
	public static void main(String[] args) {
        Scanner leituraNumero = new Scanner(System.in);
        
        int numero;
        int [][] matriz = new int [4][4];
        int linha = 0;
        
        System.out.println("Digite um numero: ");
        numero = leituraNumero.nextInt();
        
        // Preencher a matriz
        while(linha < matriz.length) {
        	int coluna = 0; // Conta as colunas
        	
        	while (coluna < matriz[linha].length) {
        		matriz[linha][coluna] = numero + linha + coluna; // Soma o número digitado pelo usuário com os índices da linha e da coluna
        		coluna++;
        	}
        	linha++;
        }
        
        
        // Exibição da matriz 4x4
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
