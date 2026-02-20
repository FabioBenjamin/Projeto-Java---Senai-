package Lista_Exercicio11.Formas;

public class Circulo extends Forma{
    private double raio;
    private double comprimento;

    // Construtor
    public Circulo(double raio, Cor cor) {
        super(cor);
        this.raio = raio;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {

        this.comprimento = comprimento;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double area(){
        return Math.pow(getRaio(), 2) * Math.PI;
    }

    @Override
    public double perimetro(){
        return Math.PI * (2 * getRaio());
    }

    @Override
    public double volume(){
        return area() * getComprimento();
    }

    @Override
    public double peso(){
        return volume() * 2600; // ALuminio
    }

}
