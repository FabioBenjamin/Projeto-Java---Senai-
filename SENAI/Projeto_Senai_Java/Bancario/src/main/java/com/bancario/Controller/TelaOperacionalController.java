package com.bancario.Controller;

// Models
import com.models.Conta;
import com.models.deposito;
import com.models.saque;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;


public class TelaOperacionalController extends TelaInicialController{

    @FXML
    private TextField Valor;

    @FXML
    private Label Saldo;

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    // Trocador de telas
    private Conta conta;

    // Deposito
    @FXML
    private void depositar() {
        double valor = Double.parseDouble(Valor.getText());

        // Operação de deposito
        deposito dep = new deposito(valor, conta);

        atualizarSaldo();
        Valor.clear();
    }

    // Saque
    @FXML
    private void sacar() {
        double valor = Double.parseDouble(Valor.getText());

        // Operação de saque
        new saque(valor, conta);

        atualizarSaldo();
        Valor.clear();
    }

    @FXML
    private void saldo() {
        double valor = Double.parseDouble(Valor.getText());

        // Operação de saldo
        atualizarSaldo();
    }

    // Saldo
    @FXML
    private void ExibirSaldo() {
        atualizarSaldo();
    }

    // Atualização do saldo da conta pós operação
    private void atualizarSaldo() {
        Saldo.setText("Saldo: R$ " + conta.getSaldo());
    }

    // Metodo de implementação
    private void trocarTela(ActionEvent event, String trocasTelas) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource(trocasTelas));
        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource())
                .getScene()
                .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    // CONECTIVIDADE DAS TELAS

    // DEPOSITO
    @FXML
    private void abrirDeposito(ActionEvent event) throws IOException {
        trocarTela(event, "/views/telaDeposito.fxml");
    }

    // SAQUE
    @FXML
    private void abrirSaque(ActionEvent event) throws IOException {
        trocarTela(event, "/views/telaSaque.fxml");
    }

    // SALDO
    @FXML
    private void abrirSaldo(ActionEvent event) throws IOException {
        trocarTela(event, "/views/telaSaldo.fxml");
    }
}
