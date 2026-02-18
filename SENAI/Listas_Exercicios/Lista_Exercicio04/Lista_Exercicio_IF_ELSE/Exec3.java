import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args) {
        Scanner point = new Scanner(System.in);

        int pontuacao;
        int tempo;


        System.out.println("Digite sua pontuação: ");
        pontuacao = point.nextInt();

        System.out.println("Digite seu tempo de jogo em minutos: ");
        tempo = point.nextInt();

        if (pontuacao < 500){
            System.out.println("Você é Iniciante");

        } else if (pontuacao <= 999 && tempo < 60) {
            System.out.println("Você é Intermediário Rápido");

        } else if (pontuacao <= 999 && tempo >= 60) {
            System.out.println("Você é Intermediario");

        } else if (pontuacao >= 1000 && tempo < 60) {
            System.out.println("Você é Pro Prayer");

        } else {
            System.out.println("Você é Veterano");

        }

        point.close();
    }
}
