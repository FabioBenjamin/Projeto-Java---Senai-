package Lista_Exercicio08;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Metodos

// Titulo do filme
class titulo {
    private String nomeFilme;

    public void setNomeFilme(String nome) { // Metodo camelcase
        this.nomeFilme = nome;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }
}

// Descrição
class getDescricao { // Metodo get
    private String descricao;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}

// Genero
class genero {
    private List<String> generos; // Lista para genero de filme

    public genero() {
        this.generos = new ArrayList<>();
    }

    // Adicionar genero
    public void adicicaoGenero(String genero) {
        this.generos.add(genero);
    }

    public List<String> getGeneros() {
        return generos;
    }
}

// Duração
class duracao {
    private Duration duracao; // Tempo do filme (h em min)

    public duracao(int min) {
        this.duracao = Duration.ofMinutes(min);
    }

    // Formatação da duração
    public String getDuracaoFilmeFormatada() {
        long horas = duracao.toHours();
        long minutos = duracao.toMinutesPart();
        return String.format("%d h %dm", horas, minutos);
    }

    // Minutos totais
    public long getDuracaoFilme() {
        return duracao.toMinutes();
    }
}

// Disponibilidade
class disponivel {
    private int disponibilidade;
    private titulo tituloFilme;

    public disponivel(int disponibilidade, titulo tituloFilme) {
        this.disponibilidade = disponibilidade;
        this.tituloFilme = tituloFilme;
    }

    // Verificação se há copias
    public boolean verificacaoDisponibilidade() {
        return disponibilidade > 0;
    }

    // Exibição
    public void exibir() {
        if (verificacaoDisponibilidade()) {
            System.out.println("O filme " + tituloFilme.getNomeFilme() +
                    " está disponivel.\n Total de copias: " + disponibilidade);
        } else {
            System.out.println("O filme " + tituloFilme.getNomeFilme() +
                    " está indisponivel.");
        }
    }
}


// Classe main
public class filme {
    public static void main(String[] args) {
        Scanner filme = new Scanner(System.in);

        titulo tituloFilme = new titulo();
        getDescricao descricaoFilme = new getDescricao();
        genero generoFilme = new genero();

        System.out.println("Digite o nome do filme: ");
        tituloFilme.setNomeFilme(filme.nextLine());

        System.out.println("Digite a duracao do filme (em minutos): ");
        int minutos = filme.nextInt();
        filme.nextLine();

        duracao duracaoFilme = new duracao(minutos);

        System.out.println("Digite o genero: ");
        generoFilme.adicicaoGenero(filme.nextLine());

        System.out.println("Digite uma descrição: ");
        descricaoFilme.setDescricao(filme.nextLine());

        System.out.println("Digite quantidade de copias: ");
        int copias = filme.nextInt();

        disponivel disponivelFilme = new disponivel(copias, tituloFilme);

        // Exibição para o usuario
        System.out.println("\n--Dados do Filme--");
        System.out.println("Titulo: " + tituloFilme.getNomeFilme());
        System.out.println("Descrição: " + descricaoFilme.getDescricao());
        System.out.println("Genero(s): " + generoFilme.getGeneros());
        System.out.println("Duração: " + duracaoFilme.getDuracaoFilmeFormatada());

        disponivelFilme.exibir();
    }
}
