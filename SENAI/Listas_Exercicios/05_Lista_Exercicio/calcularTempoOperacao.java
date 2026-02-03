import java.util.Scanner;
import java.time.Duration;

public class calcularTempoOperacao { 	    

    public static int calcularTempoOperacao(int dia, int hora){
            return ((dia * 24 )+ hora);
        }

     public static void exibirAlerta(int dia, int hora) {
        int tempoTotal = calcularTempoOperacao(dia, hora);

        if (tempoTotal <= 100) {
            System.out.printf("Tempo de operação dentro do limite.%nO tempo foi: %d horas", tempoTotal);
        } else {
            System.out.println("Alerta: Tempo de operação excedido!");
        }
    }

    public static void main(String[] args) {
        Scanner trabalho = new Scanner(System.in);

        int hora = 0;
        int dia;

        System.out.println("Quantas horas trabalhou: ");
        hora = trabalho.nextInt();

        System.out.println("Quantos dias você trabalhou: ");
        dia = trabalho.nextInt();

        exibirAlerta(dia, hora);

        trabalho.close();
        }
    }
