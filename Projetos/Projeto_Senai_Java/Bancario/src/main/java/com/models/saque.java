package com.models;

public class saque extends operacao {

    public saque(double valor, Conta conta) {
        super(valor, conta);
    }

    @Override
    public void executar() {

        if (valor <= conta.getSaldo()) {
            conta.setSaldo(conta.getSaldo() - valor);
        }
    }
}