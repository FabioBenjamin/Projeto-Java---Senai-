package com.models;

public class Conta {

    private static double saldo  = 0;

    public double getSaldo() {
        return saldo;
    }

    public static void depositar(double valor) {
        saldo += valor;
    }

    public static boolean sacar(double valor) {
        
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
