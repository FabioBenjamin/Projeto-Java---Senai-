import java.util.Scanner;

// Classe Filme
class Filme {

    private String titulo;
    private String genero;
    private int duracao; // em minutos
    private int anoLancamento;
    private boolean disponivel;

    // Construtor
    public Filme(String titulo, String genero, int duracao, int anoLancamento, boolean disponivel) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.disponivel = disponivel;
    }

    // Metodo para reproduzir o filme
    public void reproduzir() {
        if (disponivel) {
            System.out.println("Reproduzindo o filme: " + titulo);
        } else {
            System.out.println("O filme não está disponível no catálogo.");
        }
    }

    // Metodo para exibir detalhes
    public void exibirDetalhes() {
        System.out.println("\n--- Detalhes do Filme ---");
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }
}

// Classe principal (main)
public class filme {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o título do filme: ");
        String titulo = entrada.nextLine();

        System.out.print("Digite o gênero do filme: ");
        String genero = entrada.nextLine();

        System.out.print("Digite a duração do filme (em minutos): ");
        int duracao = entrada.nextInt();

        System.out.print("Digite o ano de lançamento: ");
        int ano = entrada.nextInt();

        System.out.print("O filme está disponível? (true/false): ");
        boolean disponivel = entrada.nextBoolean();

        // Criação do objeto Filme
        Filme filme = new Filme(titulo, genero, duracao, ano, disponivel);

        // Exibição
        filme.exibirDetalhes();
        filme.reproduzir();

        entrada.close();
    }
}
