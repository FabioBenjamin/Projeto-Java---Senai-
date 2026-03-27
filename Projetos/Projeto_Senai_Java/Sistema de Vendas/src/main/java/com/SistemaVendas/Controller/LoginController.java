package com.SistemaVendas.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtSenha;

    // Abrir painel
    @FXML
    public void abrirPainel(ActionEvent event) {

        try {

            // Validação simples
            if (txtUsuario.getText().isEmpty() || txtSenha.getText().isEmpty()) {
                System.out.println("Preencha os campos!");
                return;
            }

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/home.fxml")
            );

            Scene scene = new Scene(loader.load());

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}