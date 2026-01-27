package java2026;

import java.util.Scanner;

public class Idade {
	
	public static void main(String[] args){
		Scanner idade = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int numero = idade.nextInt();

		if (numero >= 18) {
			System.out.println("Você pode dirigir!");
		} else {
			System.out.println("Você não pode dirigir");
		}

		idade.close();
	}
}
