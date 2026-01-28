package java2026;


import java.util.Scanner;

public class Calculo {

	public static void main(String[] args){
		Scanner calculo = new Scanner(System.in);
		
		
		System.out.print("Digite o valor do produto: ");
		int numero = calculo.nextInt();
		
		// Logica 
		if (numero > 50 ) {
			double numeroValor = numero * 0.90;
			
			System.out.println("O valor com o desconto é: " + numeroValor);
		} else {
			System.out.println("O Item não possui desconto");
		}
		
		calculo.close();

	}
}