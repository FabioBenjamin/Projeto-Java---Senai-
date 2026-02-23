package Lista_Exercicio12.Contribuentes;

public abstract class Contribuente implements Imposto{
    private double rendaAnual;
    private String nome;

    // Construtor
    public Contribuente (String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    // Abistração ao imposto para quem for fazer a implementação
    abstract double imposto();

    // Getters
    public double getRendaAnual() {
        return rendaAnual;
    }

    public String getNome() {
        return nome;
    }


}
