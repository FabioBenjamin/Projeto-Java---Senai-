import java.util.Scanner;

public class Exec1 {
    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);
        
        int pessoa;


        System.out.println("Digite sua idade: ");
        pessoa = idade.nextInt();

        if (pessoa < 12){
            System.out.println("Você é criança");

        } else if (pessoa <= 17) {
            System.out.println("Você é um adolescente");

        } else {
            System.out.println("Você é adulto");

        }

        idade.close();

    }
}
