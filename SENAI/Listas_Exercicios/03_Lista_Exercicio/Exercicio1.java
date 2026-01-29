import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		
		int contagemNegativa = 0;
		
		// Repete a pergunta 5 vezes
		for (int repeticao = 1; repeticao <= 5; repeticao++) {
			System.out.println("Digite um valor: " + repeticao);
			double numero = valor.nextDouble();
			
			// Verificação
			
			if(!(numero > 0)) {
				contagemNegativa++;
			}
				
	}
		
		
		System.out.println("Quantidade de numeros negativos: " + contagemNegativa);
		
		
		
		valor.close();
		
	}
}
