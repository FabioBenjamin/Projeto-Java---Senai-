import java.util.Scanner;

public class intervalo {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);

        int numero1;
        int numero2;
        int inter; 


        System.out.println("Digite o numero 1 - ");
        numero1 = pergunta.nextInt();

        System.out.println("Digite o numero 2 - ");
        numero2 = pergunta.nextInt();

        System.out.printf("O intervalo de numeros entre %d e o %d é - %n", numero1, numero2);

        for (inter = numero1; inter <= numero2; inter++) {
            System.out.print(inter + " "); // printar o intervalo 
        }

            

        pergunta.close();
    }
}
