package com.bancario.Controller;

import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;


public class TelaInicialController {

    @FXML
    private void telasInicias (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(
            getClass().getResource("/telaIntrodutoria.fmxl")
        );

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

}
