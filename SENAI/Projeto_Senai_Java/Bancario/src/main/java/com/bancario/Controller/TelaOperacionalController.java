package com.bancario.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import com.models.Conta;


public class TelaOperacionalController {

    @FXML
    private TextField campoValor;

    @FXML
    private void depositar() {
        double valor = Double.parseDouble(campoValor.getText());
        Conta.depositar(valor);
    }

    @FXML
    private void sacar(){
        double valor = Double.parseDouble((campoValor.getText()));

        if(!Conta.sacar(valor)) {
            System.out.println("Saldo insuficiente");
        }
    }
}
