package Lista_Exercicio14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.io.File;
public class Leitura {

    public static void main(String[] args) throws Exception {
   /*     String txt = " SENAI  SESC  ";
        String txt2 = "SENAI";

        System.out.println(txt.strip());
        System.out.println(txt.repeat(3));
        System.out.println(txt.contains("SESC"));*/


        File arquivo = new File("src/arquivos/clientes.csv");
        Scanner scanner = new Scanner(arquivo);

        while (scanner.hasNext()){
            String[]linha = scanner.nextLine().strip().split(",");

            DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("yyyy/M/d");
            DateTimeFormatter formatoABNT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate data = LocalDate.parse(linha[1],formatacao);
            data = data.withYear(2026);

            System.out.println(linha[0] + " | " + formatoABNT.format(data));
        }

        scanner.close();

    }
}

