import java.util.Scanner;

public class penal {
    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int anos = idade.nextInt();

        // Parte logica

        if (anos >= 18){
            System.out.println("Você é penalmente responsável");

        } else {
            System.out.println("Você não é penalmente responsável");
        }

        idade.close();
    }
}
