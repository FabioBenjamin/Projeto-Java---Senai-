package com.models;

public class saldo extends operacao {

    public saldo(Conta conta) {
        super(0, conta);
    }

    @Override
    public void executar(){

        System.out.println("Saldo atual - " + conta.getSaldo());

    }
}

