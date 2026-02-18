import java.util.Scanner;

public class vetores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nomes[] = new String[3]; // Vetor de tres valores 
		int idade[] = new int[3]; // Com [] sem valor ele nao fica definido na memoria

		nomes[0] = "SENAI";
		nomes[1] = "SESC";
		nomes[2] = "SENAC";
		
		System.out.println(nomes); // mostra no endereço da memoria
		System.out.println(nomes[1]); // Mostra o valor dele, que neste caso é "SESC"
		
		for(int indice = 0 ; indice < 3 ; indice++) {
			System.out.println(nomes[1]); // Repete o indice pelo valor indicado 
			System.out.println(nomes[indice]); //Mostra a lista por completo, com todos os valores 
		}
		
		// Leitura de dados do vetor
		for (int indice = 0; indice < 3 ; indice++) {
			System.out.printf("Digite o nome para a %d posição: ", (indice + 1));
			nomes[indice] = sc.next();
			System.out.printf("Digite a idade: ");
			idade[indice] = sc.nextInt();
		}
		
		// Saída de dados do vetor
		for (int indice = 0; indice < 3 ; indice++) {
			System.out.printf("Nome: %10s | Idade: %-20d %n", nomes[indice], idade[indice]); // Deixa o texto tabulado (%10 e %-20)
		}
		
	}
}
