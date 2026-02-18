import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner Imc = new Scanner(System.in);


        // Pergunta ao usuário

        System.out.println("Digite seu peso em quilos: ");
        double Peso = Imc.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        double Altura = Imc.nextDouble();


        // Parte lógica 

        double calculoPeso = (Peso / (Altura * Altura));

        if (calculoPeso < 18.5) {
            System.out.printf(" %.2f Você está abaixo do peso", calculoPeso);

        } else if (calculoPeso >= 18.5 && calculoPeso < 24.99){

            System.out.printf("%.2f Você está no peso normal", calculoPeso);

        } else if (calculoPeso >= 25.00 && calculoPeso < 29.99){

            System.out.printf("%.2f Você está sobrepeso", calculoPeso);

        } else{
            System.out.printf("%.2f Você está Obeso", calculoPeso);

        }

        Imc.close();

    }
}
