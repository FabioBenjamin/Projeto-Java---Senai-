package java2026;

import java.util.Scanner;

public class Solitacao {
	public static void main(String[] args){
		Scanner positivo = new Scanner(System.in);
		
		System.out.print("Digite um numero positivo: ");
		int numero = positivo.nextInt();
		
		// Operação lógica
		if (numero > 0 && numero != 0 ) {
		System.out.println("O número digitado posivo");
		} else if (numero < 0) {
			System.out.println("O numero é negativo");
		} else {
			System.out.println("O numero é neutro");
		}
		
		positivo.close();

	}
}