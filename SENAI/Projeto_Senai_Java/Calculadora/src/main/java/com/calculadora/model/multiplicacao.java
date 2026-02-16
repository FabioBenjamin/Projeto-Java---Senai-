package main.java.com.calculadora.model;

public class multiplicacao extends operadores{
    public multiplicacao(double a, double b) {
        super(a, b);
    }

    public double executar() {
        return this.a * this.b;
    }
}
