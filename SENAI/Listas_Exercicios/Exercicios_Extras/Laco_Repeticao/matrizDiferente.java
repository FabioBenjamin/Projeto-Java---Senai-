import java.util.Scanner;

public class matrizDiferente {
	public static void main(String[] args) {
        Scanner leituraNumero = new Scanner(System.in);
        
        int numero;
        int [][] matriz = new int [4][4];
        int linha = matriz.length;
        
        System.out.println("Digite um numero: ");
        numero = leituraNumero.nextInt();
        
        while(numero < linha) {
        	int coluna = 0; // Conta as colunas
        	
        	while (coluna < matriz[numero].length) {
        		System.out.print("Digite o valor para [" + numero + "][" + coluna + "]: "); // Exibição dos valores
                matriz[numero][coluna] = leituraNumero.nextInt();
        		coluna++;
        	}
        }

        int numero2 = 0;
        while (numero2 < linha) {
        	int coluna2 = 0;
            
            while (coluna2 < matriz[numero2].length) {
                System.out.print(matriz[numero2][coluna2] + " ");
                coluna2++;
            }
            
            System.out.println(); // Pula a linha
            numero2++;
        }
        
        
        leituraNumero.close();
	}
}
