import java.util.Scanner;

public class contagem {
    public static void main(String[] args) {
        Scanner ocorrencia = new Scanner(System.in);

        int linhas = 3;
        int colunas = 3;
        double[][] matriz = new double[linhas][colunas];
        int caixa;

        System.out.println("Digite o codigo de produto: ");
        caixa = ocorrencia.nextInt();

        for(int valor = 0 ; valor < linhas ; valor++) {
            for (int valor2 = 0 ; valor2 < colunas ; valor2++) {
                System.out.println("[" + valor + "][" + valor2 + "]: ");
                matriz[valor][valor2] = ocorrencia.nextInt();
            }
        }

        System.out.println("Insira o codigo do produto que você deseja achar: ");
        int codigo = ocorrencia.nextInt();

        int contagemTotal = 0;

        // Encontrar o codigo do usuário
        for (int valor = 0; valor < linhas; valor++) {
            int contagemProduto = 0; // Reinicia a soma para cada nova linha
            for (int valor2 = 0; valor2 < colunas; valor2++) {
                    
                // Encontra o codigo digitado pelo usuario
                if (matriz[valor][valor2] == codigo) {
                    contagemTotal++;
                }
            }
        }
        // Imprime os valores
        System.out.printf("\nO produto %d aparece %d vezes \n", codigo, contagemTotal);

        ocorrencia.close();
    }
}
