import java.util.Scanner;

class contaBancaria {

    private int numeroConta;
    private String titulo;
    private double saldo;
    public int agencia;
    private String tipoConta;
    private double limitePorOperacao;
    private double limiteDiario;
    private double totalSacadoHoje;

    // Construtor
    public contaBancaria(int numeroConta, String titulo, double saldo, int agencia, String tipoConta) {
        this.numeroConta = numeroConta;
        this.titulo = titulo;
        this.saldo = saldo;
        this.agencia = agencia;
        this.tipoConta = tipoConta;
        this.limitePorOperacao = 1000.00;
        this.limiteDiario = 5000.0;
        this.totalSacadoHoje = 0.0;
    }

    // Metodos de saque
    public void saque(double valor) {

        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado");

        } else {
            System.out.println("Saldo insuficiente, não é possivel realizar a ação");
        }
    }

    // Getters
    public int getnumero() {
        return numeroConta;
    }

    public String gettitulo() {
        return titulo;
    }

    public int getagencia() {
        return agencia;
    }

    public String gettipoConta() {
        return tipoConta;
    }

    public double getsaldo() {
        return saldo;
    }


    // Metodo de deposito
    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito realizado, valor adicionado: " + valor);
            System.out.println("Saldo atual: " + this.saldo);

        } else {
            System.out.println("Deposito cancelado, valor inválido");
        }
    }
}

public class bancario {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        int numero = user.nextInt();

        System.out.println("Digite o titulo da sua conta: ");
        String titulo = user.next();

        System.out.println("Digite o saldo atual da conta: ");
        double saldo = user.nextDouble();

        System.out.println("Digite sua agencia");
        int agencia = user.nextInt();

        System.out.println("Qual tipo da sua conta: ");
        String tipo = user.next();

        contaBancaria contaUser = new contaBancaria(numero, titulo, saldo, agencia, tipo);

        System.out.println("\n-");
        System.out.printf("\n",
                "Conta", "Título", "Agência", "Tipo", "Saldo");
        System.out.println("");

        System.out.printf("| %-15d | %-6s | %-7d | %-4s | %-8.2f |\n",
                contaUser.getnumero(),
                contaUser.gettitulo(),
                contaUser.getagencia(),
                contaUser.gettipoConta(),
                contaUser.getsaldo());

        System.out.println("-----------------------------------------------");

        contaUser.deposito(200);
        contaUser.saque(1500); // Teste de limite por operação
        contaUser.saque(6000); // Teste de limite diario

        user.close();

    }
}

