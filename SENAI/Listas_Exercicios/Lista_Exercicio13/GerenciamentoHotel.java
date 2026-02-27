package Lista_Exercicio13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class GerenciamentoHotel {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Número do quarto: ");
        int numeroQuarto = user.nextInt();
        user.nextLine(); // limpa buffer

        System.out.print("Data de entrada (dd/MM/aaaa): ");
        String entradaData1 = user.nextLine();

        System.out.print("Data de saída (dd/MM/aaaa): ");
        String saidaData1 = user.nextLine();

        LocalDate entrada = LocalDate.parse(entradaData1, formatter);
        LocalDate saida = LocalDate.parse(saidaData1, formatter);

        LocalDate hoje = LocalDate.now();

        // Validação de erros
        if (entrada.isBefore(hoje) || saida.isBefore(hoje)) {
            System.out.println("Erro: Datas devem ser futuras.");
            return;
        }

        if (saida.isAfter(entrada)) {
            System.out.println("Erro: Data de saída deve ser posterior à entrada.");
            return;
        }

        long dias = ChronoUnit.DAYS.between(entrada, saida);

        System.out.println("\nReserva: Quarto " + numeroQuarto + ", entrada: " + entrada.format(formatter) + ", saída: " + saida.format(formatter) + ", " + dias + " noites");

        // Atualização na reserva da pessoa
        System.out.println("\nAtualizar reserva");

        System.out.print("Nova data de entrada (dd/MM/aaaa): ");
        entradaData1 = user.nextLine();

        System.out.print("Nova data de saída (dd/MM/aaaa): ");
        saidaData1 = user.nextLine();

        entrada = LocalDate.parse(entradaData1, formatter);
        saida = LocalDate.parse(saidaData1, formatter);

        // Revalidação
        if (entrada.isBefore(hoje) || saida.isBefore(hoje)) {
            System.out.println("Erro: Datas devem ser futuras.");
            return;
        }

        if (saida.isAfter(entrada)) {
            System.out.println("Erro: Data de saída deve ser posterior à entrada.");
            return;
        }

        dias = ChronoUnit.DAYS.between(entrada, saida);

        System.out.println("\nReserva Atualizada: Quarto " + numeroQuarto + ", entrada: " + entrada.format(formatter) + ", saída: " + saida.format(formatter) + ", " + dias + " noites");

        user.close();
    }
}