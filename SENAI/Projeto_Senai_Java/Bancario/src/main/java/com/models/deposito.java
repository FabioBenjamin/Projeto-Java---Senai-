package com.bancario.operacoes;

public class deposito extends operacao {

    public deposito(double valor, double saldo) {
        super(valor, saldo);
    }

    public double executar() {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado.", valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
        return saldo;
    }
}
