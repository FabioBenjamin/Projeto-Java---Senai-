package com.bancario.operacoes;

public class operacao {

    protected double valor;
    protected static double saldo = 0;

    // Construtor
    public operacao(double valor, double saldo) {
        this.valor = valor;
        this.saldo = saldo;
    }

    public static double getSaldo() {
        return saldo;
    }

    public double getValor() {
        return valor;
    }
}