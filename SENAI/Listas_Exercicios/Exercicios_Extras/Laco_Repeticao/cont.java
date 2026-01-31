import java.util.Scanner;

public class cont {
    public static void main(String[] args) {
        Scanner contador = new Scanner(System.in);

        int contagem;

        
        while (true) {
            System.out.println("Insira um numero: ");
            contagem = contador.nextInt();
            contagem++;

            if (contagem == 10) {
                System.out.println("Chegou ao fim");
                break;
            }

        }

        


        contador.close();
    }
}
