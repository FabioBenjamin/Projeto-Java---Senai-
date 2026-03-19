package com.SistemaVendas.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class PainelController {

    @FXML
    private Label lblTotalVendas;

    public void initialize() {
        carregarDados();
    }

    private void carregarDados() {
        lblTotalVendas.setText("R$ 0.00"); // Tela inicial, após puxa do banco
    }
}

