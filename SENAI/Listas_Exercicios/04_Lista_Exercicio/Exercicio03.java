import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner point  = new Scanner(System.in);

        int pontuacao;
        int tempo;

        System.out.println("Digite sua pontuação: ");
        pontuacao = point.nextInt();

        System.out.println("Digite seu tempo de jogo (min): ");
        tempo = point.nextInt();

        String verificacao = (pontuacao < 500) ? "Iniciante" 
            : (pontuacao <= 999 && tempo < 60) ? "Intermediário Rápido" 
            : (pontuacao <= 999 && tempo >= 60) ? "Intermediário" 
            : (pontuacao >= 1000 && tempo < 60) ? "Pro Player" : "Veterano";


            System.out.printf("Sua classificação é %s", verificacao);

            point.close();
        
    }
}
