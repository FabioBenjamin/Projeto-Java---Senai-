    import java.util.Scanner;

    // Metodo de calculo
    public class ManutencaoIndustrial {  
        public static double calcularCustoManutencao(int peca, double custo) {
            return (peca + custo);
        }

        // Metodo vazio
        public static void exibirDetalhesManutencao() {
                Scanner industrias = new Scanner(System.in);

                System.out.println("qual o nome da maquina: ");
                String maquina = industrias.nextLine();

                System.out.println("Qual a data: ");
                String dataMaquina = industrias.nextLine();

                System.out.println("Quantidade das pecas: ");
                int peca = industrias.nextInt();

                System.out.println("Custo das pecas: ");
                double custo = industrias.nextDouble();

                double valor = calcularCustoManutencao(peca, custo);
 
                System.out.println("Máquina: " + maquina);
                System.out.println("Data: " + dataMaquina);
                System.out.println("Custo total da manutenção: R$ " + valor);

                industrias.close();
        }

        public static void main(String[] args) {
            exibirDetalhesManutencao();
        }
    }
