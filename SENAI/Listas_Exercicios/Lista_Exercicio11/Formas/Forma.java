package Lista_Exercicio11.Formas;

public abstract class Forma {
    private String cor;

    public Forma(String cor){
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    // Metodos abstratos
    public abstract double area();
    public abstract double perimetro();
    public abstract double volume();
    public abstract double peso();


}
