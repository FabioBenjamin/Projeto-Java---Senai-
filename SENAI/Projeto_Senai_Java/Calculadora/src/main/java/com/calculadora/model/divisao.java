package main.java.com.calculadora.model;

public class divisao extends operadores{
    public divisao(double a, double b) {
        super(a, b);
    }

    public double executar() {
        if (this.b == 0) // Evita dividir por 0;
            return 0;

        return this.a / this.b;
    }
}

