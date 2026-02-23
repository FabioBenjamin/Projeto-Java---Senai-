import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {
    @O
    public static void main(String[] args) {

        LocalDate d1 = LocalDate.now();
        LocalDate d2 = d1.plusDays(15); // Pega a data daqui a 15 dias
        LocalDate d3 = d1.plusMonths(3); // Acrescenta 3 meses
        LocalDate d4 = d1.minusDays(15); // Pega a data de 15 atras
        LocalDate d7 = LocalDate.parse("2026-02-28"); // Transformar data em texto

        Instant d5 = Instant.now(); // Horario exato baseado no horario de londres

        // Formatar o mes é "MM" mes
        // D = contagem de dias no ano
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/m/y"); // Formar em abnt
        System.out.println(dtf.format(d1));

        LocalDateTime d6 = LocalDateTime.now();

    }
}
