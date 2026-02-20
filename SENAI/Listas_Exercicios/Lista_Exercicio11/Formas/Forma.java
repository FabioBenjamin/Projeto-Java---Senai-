package Lista_Exercicio11.Formas;

public abstract class Forma {
    private Cor cor;

    public Forma(Cor cor){
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    // Metodos abstratos
    public abstract double area();
    public abstract double perimetro();
    public abstract double volume();
    public abstract double peso();


}
