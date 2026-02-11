import java.util.Scanner;

class colaborador {

    private String nome;
    private int hora;
    private double valorHora;

    // Construtor
    public colaborador(String nome, int hora, double valorHora) {
        this.nome = nome;
        this.hora = hora;
        this.valorHora = valorHora;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getHora() {
        return hora;
    }

    public double getValorHora() {
        return valorHora;
    }

    // Metodo para pagamento
    public double pagamento() {
        return valorHora * hora;
    }
}

class colaboradoTercerizado extends colaborador {

    private double custoAdicional;

    public colaboradoTercerizado(String nome, int hora, double valorHora, double custoAdicional) {
        super(nome, hora, valorHora);
        // Construtor
        this.custoAdicional = custoAdicional;
    }

    @Override
    // Metodo de adicional
    public double pagamento() {

        double total = super.pagamento() + custoAdicional; // Chamando o metodo pagamento
        return total * 1.10; // Adicionando os 10%
    }

    // Get
    public double getCustoAdicional() {
        return custoAdicional;
    }
}

// Classe main
public class calculoPagamento {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int contagem = 0;
        int valor1;
        String pergunta;
        String nome;
        int horas;
        double valorTrabalho;


        System.out.println("Insira a quantidade de colaboradores: ");
        contagem = user.nextInt();

        for (valor1 = 1; valor1 <= contagem; valor1++) {

            System.out.println("Colaborador terceirizado (s/n): ");
            pergunta = user.next();
            user.nextLine(); // limpar buffer

            System.out.println("Nome: ");
            nome = user.next();

            System.out.println("Horas trabalhada: ");
            horas = user.nextInt();

            System.out.println("Valor da hora: ");
            valorTrabalho = user.nextDouble();

            listaColaboradores.add(colaborador);

            // Caso seja tercerizado
            if (pergunta.equalsIgnoreCase("s")) {

                System.out.print("Custo adicional: ");
                double custoAdicional = user.nextDouble();

                Colaborador = new colaboradoTercerizado
                        (nome, horas, valorTrabalho, custoAdicional);

            } else {

                Colaborador = new colaborador
                        (nome, horas, valorTrabalho);

                for (colaborador c : listaColaboradores) {
                    System.out.printf("%-15s %-10d %-12.2f %-15.2f %-10.2f%n",
                            c.getNome(),
                            c.getHora(),
                            c.getValorHora(),
                            c.getCustoAdicional(),
                            c.pagamento());
                }

            }
        }
        user.close();
    }
}
