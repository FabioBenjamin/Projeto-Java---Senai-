import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner vestimentas = new Scanner(System.in);

        int temperatura;
        String clima;
        

        System.out.println("Insira a temperatura: ");
        temperatura = vestimentas.nextInt();

        System.out.println("Insira o clima");
        clima = vestimentas.next();

        if (temperatura < 20) {
            System.out.println("Roupas quentes");

        } else if (temperatura <= 29) {
            System.out.println("Roupas confortaveis");

        } else {
            System.out.println("Roupas leves");

        }

        if (clima == "chuvoso") {
            System.out.println(" Leve um guarda-chuva");

        } else {
            System.out.println(" Use óculos de sol");

        }

       

        vestimentas.close();

    }
}
