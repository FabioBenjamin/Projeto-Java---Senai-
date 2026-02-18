import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner verificacao = new Scanner(System.in);

    

        System.out.println("Digite um numero: ");
        double valor = verificacao.nextDouble();
        
        // Parte logica 
 
        if (valor <= 0){

            System.out.println("Digite um numero POSITIVO!!");

            } else if (valor / 1 == 1 && valor / valor == 1 && valor != 1){

                System.out.println("Seu numero é primo");

            } else {

                System.err.println("Seu numero não é primo");

            }

            verificacao.close();

            }


        }