package Orientacao_Objeto;

import Laco_Repeticao.cont;

import java.util.Scanner;

public class Contador {

    // Metodo de contagem
    public static int contagem (int valor1, int valor2) {
        int valor = 0;

        for (valor1 = 0 ; valor1 < valor2 ; valor1++) {
            valor++;
        }
        return valor;
    }

    public static void main(String[] args) {
        Scanner cont = new Scanner(System.in);

        int menu;
        int numero = 0;

        System.out.println("Digite um numero: ");
        numero = cont.nextInt();

        // Loop para as perguntas
        while(true) {
            // Perguntas iniciais para o usuário
            System.out.println("\n--Contador--");
            System.out.println("1 - Retornar o valor do contador");
            System.out.println("2 - Incrementar mais 1");
            System.out.println("3 - Zerar");
            System.out.println("4 - Encerrar programa");

            menu = cont.nextInt();

            // Acontecimento no numero escolhido pelo usuário.
            if(menu == 1){
                System.out.printf("O valor é %d", numero);

                // Incrimentação
            } else if (menu == 2) {
                numero++;
                System.out.printf("Incrimentação realizada, valor atual %d", numero);

            } else if (menu == 3) {
                numero = 0;
                System.out.println("O valor agora é: " + numero);

            } else if (menu == 4){
                System.out.println("Programama encerrado");
                break;

            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}

