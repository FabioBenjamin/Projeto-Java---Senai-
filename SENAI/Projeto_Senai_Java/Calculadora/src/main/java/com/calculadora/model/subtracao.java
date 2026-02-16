package main.java.com.calculadora.model;

public class subtracao extends operadores{
    public subtracao(double a, double b) {
        super(a, b);
    }

    public double executar() {
        return this.a - this.b;
    }
}

