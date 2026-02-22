package com.models;

// Classe principal 
public abstract class operacao {

    protected double valor;
    protected Conta conta;

    // Construtor
    public operacao(double valor, Conta conta) {
        this.valor = valor;
        this.conta = conta;
    }

    public abstract void executar();

}