package com.bancario.operacoes;

public class saque extends operacao {

    public saque(double valor, double saldo) {
        super(valor, saldo);
    }

    public void executar() {

        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}