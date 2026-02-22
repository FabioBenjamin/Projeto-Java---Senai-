package com.models;

public class deposito extends operacao {

    public deposito(double valor, Conta conta) {
        super(valor, conta);
    }

    @Override
    public void executar() {
        conta.setSaldo(conta.getSaldo() + valor);{
    }
    }
}
