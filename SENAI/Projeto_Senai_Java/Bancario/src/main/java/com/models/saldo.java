package com.bancario.operacoes;

public class saldo extends operacao {

    public saldo(double valor, double saldo) {
        super(valor, saldo);
    }

    public void verificacao(){

        System.out.println("Saldo atual - " + this.saldo);

    }

}

