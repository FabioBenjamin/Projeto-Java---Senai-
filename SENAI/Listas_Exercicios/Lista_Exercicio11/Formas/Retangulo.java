package Lista_Exercicio11.Formas;

public class Retangulo extends Forma {

    private double largura;
    private double altura;

    // Construtor
    public Retangulo(double largura, double altura, Cor cor) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    // Getters
    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    // Setters
    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return largura * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (largura + altura);
    }

    // Figura 2D
    @Override
    public double volume() {
        return 0;
    }

    // Figura 2D
    @Override
    public double peso() {
        return 0;
    }
}
