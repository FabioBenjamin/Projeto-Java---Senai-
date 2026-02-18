package java2026;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner verificacao = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int ver = verificacao.nextInt();

        if (ver % 2 == 0 ){
            System.out.println("O numero: " + ver  + " 2é par");
        } else {
          System.out.println("O numero: " + ver  + " é impar");  
        }


        verificacao.close();
    }
}
