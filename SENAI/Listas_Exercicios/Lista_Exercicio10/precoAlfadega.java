package Lista_Exercicio10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class produto {
    private String nome;
    private double preco;

    // construtor
    public produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

// Importado
class produtoImportado extends produto {

    private double taxaAlfandega;

    public produtoImportado(String nome, double preco, double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;  // Construtor
    }

    // Metodo taxa de alfandega
    public double precoTotal() {
        return getPreco() + taxaAlfandega;
    }

    // Get
    public double getTaxaAlfandega() {
        return taxaAlfandega;
    }
}

// Usado
class produtoUsado extends produto {

    private LocalDate dataFabricacao;

    // Construtor
    public produtoUsado(String nome, double preco, LocalDate dataFabricacao) {
        super(nome, preco);

        // Construtor
        this.dataFabricacao = dataFabricacao;
    }

    // Get
    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }
}

// Classe main
public class precoAlfadega {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        List<produto> listaProduto = new ArrayList<>();

        int contagem = 0;
        int valor1;
        String tipoProduto;
        String nome;
        double preco;

        // Importado
        double taxa;

        // Usado
        String dataInserida;
        DateTimeFormatter formato;
        LocalDate data;


        System.out.println("Insira a quantidade de colaboradores: ");
        contagem = user.nextInt();

        for (valor1 = 1; valor1 <= contagem; valor1++) {

            System.out.println("Comum, usado ou importado (c/u/i)?: ");
            tipoProduto = user.next();
            user.nextLine(); // limpar buffer

            System.out.println("Nome: ");
            nome = user.next();

            System.out.println("Preço: ");
            preco = user.nextDouble();

            // Caso seja Importado
            if (tipoProduto.equalsIgnoreCase("i")) {
                System.out.println("Taxa de alfândega: ");
                taxa = user.nextDouble();
                user.nextLine(); // limpa buffer

                listaProduto.add(new produtoImportado(nome, preco, taxa));

                // Caso seja Usado
            } else if (tipoProduto.equalsIgnoreCase("u")) {
                user.nextLine(); // limpar buffer

                System.out.println("Data de fabricação (dd/mm/yyyy): ");
                dataInserida = user.nextLine();

                // Formatado a data
                formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                data = LocalDate.parse(dataInserida, formato);

                listaProduto.add(new produtoUsado(nome, preco, data));

                // Caso seja Comum
            } else {
                listaProduto.add(new produto(nome, preco));

            }
        }

        // Exibicão para o usuário
        System.out.printf("%-20s %-15s %-30s%n", "Nome", "Tipo", "Detalhes");

        for (produto itemProduto : listaProduto) {

            String tipo;
            String detalhes;

            if (itemProduto instanceof produtoImportado) {

                produtoImportado imp = (produtoImportado) itemProduto;

                tipo = "Importado";
                detalhes = String.format("R$ %.2f (Taxa: %.2f)",
                        imp.precoTotal(),
                        imp.getTaxaAlfandega());
            } else if (itemProduto instanceof produtoUsado) {

                produtoUsado usado = (produtoUsado) itemProduto;

                DateTimeFormatter formatoSaida = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                tipo = "Usado";
                detalhes = String.format("R$ %.2f (Data: %s)",
                        usado.getPreco(),
                        usado.getDataFabricacao().format(formatoSaida));
            } else {

                tipo = "Comum";
                detalhes = String.format("R$ %.2f", itemProduto.getPreco());
            }

            System.out.printf("%-20s %-15s %-30s%n",
                    itemProduto.getNome(),
                    tipo,
                    detalhes);
        }

        user.close();
    }

}

