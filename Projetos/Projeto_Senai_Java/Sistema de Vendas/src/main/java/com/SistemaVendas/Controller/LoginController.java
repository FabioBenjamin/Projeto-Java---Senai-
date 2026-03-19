package com.SistemaVendas.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class LoginController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private TextField txtSenha;

    @FXML
    private TextField lblErro;

    @FXML
    public void entrar(ActionEvent event) {

        String user = txtUsuario.getText();
        String senha = txtSenha.getText();

        if (user.equals("adm") && senha.equals("123")) {
            abrirPainel();
        } else {
            lblErro.setText("Não dá mano, tenta denovo");
        }
    }

    private void abrirPainel() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/View/Painel.fxml"));
            Stage stage = (Stage) txtUsuario.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
