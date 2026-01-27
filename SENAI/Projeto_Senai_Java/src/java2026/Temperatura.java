package java2026;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner temperature = new Scanner(System.in);

        System.out.println("Digite uma temperatura em celsius: ");
        double convertor = temperature.nextDouble();

        double fah = (convertor * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fah);
    
        temperature.close();
    } 

}
