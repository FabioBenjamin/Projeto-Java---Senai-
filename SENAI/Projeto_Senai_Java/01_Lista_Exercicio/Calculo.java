package java2026;


import java.util.Scanner;

public class Calculo {

	public static void main(String[] args){
		Scanner calculo = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		int numero = calculo.nextInt();
		
		if (numero >= 50 ) {
			double numeroValor = (numero * 0.10; // Desconto de 10% sobre o produtos de 50+
			
			System.out.println("O valor com o desconto é: " + numeroValor);
		} else if (numero < 50){
			System.out.println("O Item não possui desconto");
		}
		
		calculo.close();

	}

}
