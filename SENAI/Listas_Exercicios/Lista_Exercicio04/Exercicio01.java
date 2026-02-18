import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner idade = new Scanner(System.in);
		
		int pessoa;

		System.out.println("Insira sua idade: ");
		pessoa = idade.nextInt();
		
		String  resultado = (pessoa <= 12) ? "Criança" : (pessoa <= 17) ? "Adolescente" : "Adulto";
		
		System.out.println("Sua classificação é: " + resultado);
				
		idade.close();
		
		
	}
}
