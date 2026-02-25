package Lista_Exercicio13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class GerenciamentoHotel {
    public static void main(String[] args) {
    Scanner user = new Scanner(System.in);

    int numeroQuarto;
    String entrada;
    String saida; 

    System.out.println("Digite o número do seu quarto: ");
    numeroQuarto = user.nextInt();

    System.out.println("Data de entrada no hotel (dd/MM/aaaa): ");
    entrada = user.nextLine();

    System.out.println("Data de saída (dd/MM/aaaa): ");
    saida = user.nextLine();

    DateFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    LocalDate data = LocalDate.parse(entrada, formatter);

    }
}
