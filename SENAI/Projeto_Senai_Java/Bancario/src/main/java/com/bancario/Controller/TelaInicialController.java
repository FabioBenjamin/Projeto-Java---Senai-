package com.bancario.Controller;

import com.models.Conta;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class TelaInicialController {

    private Conta conta;

    @FXML
    private void telasInicias (ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(
            getClass().getResource("/views/telaOperadores.fxml")
        );

        Parent root = loader.load();

        TelaOperacionalController controller = loader.getController();
        controller.setConta(conta);


        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();


    }

}
