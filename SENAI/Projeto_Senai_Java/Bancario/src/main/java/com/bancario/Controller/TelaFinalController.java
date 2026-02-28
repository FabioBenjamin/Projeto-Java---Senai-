package com.bancario.Controller;

import javafx.application.Platform;
import javafx.fxml.FXML;


public class TelaFinalController extends TelaInicialController {

    // Caso o usuário escolha encerrar o programa
    @FXML
    private void FinalizarPrograma() {
        Platform.exit(); // Fecha o JavaFX
    }
}}

