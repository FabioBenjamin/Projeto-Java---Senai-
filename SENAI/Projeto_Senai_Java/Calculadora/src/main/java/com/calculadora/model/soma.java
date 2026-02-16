package main.java.com.calculadora.model;

public class soma extends operadores{
    public soma(double a, double b) {
        super(a, b);
    }

    public double executar() {
        return this.a + this.b;
    }
}
