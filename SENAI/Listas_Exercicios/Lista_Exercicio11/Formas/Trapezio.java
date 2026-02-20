package Lista_Exercicio11.Formas;

public class Trapezio extends Forma{
    private double baseMenor;
    private double baseMaior;
    private double altura;


    // Construtor
    public Trapezio(double baseMenor, double baseMaior, double altura, Cor cor) {
        super(cor);
        // Importe do construtor
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    // Getters
    public double getBaseMenor() {
        return baseMenor;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public double getAltura() {
        return altura;
    }

    // Setters
    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Importe da class Forma
    @Override
    public double area() {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    @Override
    public double perimetro() {

        // Encontrar o lado do trapezio
        double x = Math.abs(baseMenor - baseMaior) / 2; // Valor de X
        double lado = Math.sqrt(Math.pow(altura, 2) + Math.pow(x, 2));

        // Retorno
        return baseMaior + baseMenor + 2 * lado;
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
