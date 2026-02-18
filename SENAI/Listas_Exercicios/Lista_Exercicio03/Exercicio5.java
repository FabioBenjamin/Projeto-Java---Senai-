import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner crescimento = new Scanner(System.in);

		double ze = 1.10;
		double chico = 1.50;
		int anos = 0;

		for (; ze <= chico; anos++) {
			ze += 0.03;
			chico += 0.02;
			
			System.out.printf("Chico %f - Zé %f - Ano %d \n", chico, ze, anos);

		}

		System.out.printf("\n O Chico passará a altura de Zé em %d anos", anos); 
		crescimento.close();

	}

}
