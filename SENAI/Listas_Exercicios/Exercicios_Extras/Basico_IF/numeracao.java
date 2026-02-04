package Exercicios_Extras;
import java.util.Scanner;

public class numeracao {
    public static void main(String[] args) {
        Scanner idade = new Scanner (System.in);

        int Ano = 365;
        int Mes = 30; 
        int Dia = 1;
        

        System.out.println("Quantos anos você tem: ");
        int Anos = idade.nextInt();

        System.out.println("Quantos meses você tem após seu aniversario: ");
        int Meses = idade.nextInt();

        System.out.println("Quantos dias você tem apartir do mes que você está: ");
            Dia = idade.nextInt();

        
        int SomaTotal = ((Ano * Anos) + (Mes * Meses) + Dia);
            
            System.out.println("Sua idade em dias totais são: " + SomaTotal);
        
        
            idade.close();
        }
        
    }

