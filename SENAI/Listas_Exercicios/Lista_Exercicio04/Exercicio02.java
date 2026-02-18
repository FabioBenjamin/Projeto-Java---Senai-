import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner vestimenta = new Scanner(System.in);

        int temperatura;
        String clima;

        System.out.println("Qual a temperatura: ");
        temperatura = vestimenta.nextInt();
        vestimenta.nextLine(); // Limpa o buffer 

        System.out.println("Qual o clima: ");
        clima = vestimenta.nextLine();

        String resultado = (temperatura < 20) ? "Roupas quentes" : (temperatura <= 29) ? "Roupas confortáveis" : "Roupas leves"; 

        //  .equals() compara o texto digitado pelo usuário com a palavra que se enquandra
        String resposta = "chuvoso".equals(clima) ? "Leve um guarda-chuva" : "Use óculos de sol";

        System.out.printf("Sugestão: %s e %s", resultado, resposta);


        vestimenta.close(); 
    }
}
