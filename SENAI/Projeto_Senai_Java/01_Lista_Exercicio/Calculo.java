package java2026;


import java.util.Scanner;

public class Calculo {

	public static void main(String[] args){
		Scanner calculo = new Scanner(System.in);
		
		int desconto = 10 / 100; //Desconto 
		
		
		System.out.print("Digite o valor do produto: ");
		int numero = calculo.nextInt();
		
		if (numero >= 50 ) {
			double numeroValor = (numero / desconto) * 100;
			
			System.out.println("O valor com o desconto é: " + numeroValor);
		} else {
			System.out.println("O Item não possui desconto");
		}
		
		calculo.close();

	}
}