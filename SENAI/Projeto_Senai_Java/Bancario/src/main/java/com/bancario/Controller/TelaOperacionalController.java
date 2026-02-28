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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;

public class TelaOperacionalController extends TelaInicialController {

    @FXML
    private TextField Valor;

    @FXML
    private Label Saldo;

    @FXML
    private TextArea txtExtrato;

    @FXML
    private Label lblMensagem;

    private static Conta conta = new Conta(00.00);

    private static ArrayList<String> valores = new ArrayList<>();

    // Inicialização automática da tela
    @FXML
    public void initialize() {
        atualizarSaldo();

        if (txtExtrato != null) {
            txtExtrato.setText(gerarExtrato()); // CORRIGIDO AQUI
        }
    }

    // Deposito
    @FXML
    protected void depositar() {

        try {
            double valor = Double.parseDouble(Valor.getText());

            if (valor <= 0) {

                System.out.println("Maior que 0 o valor seu cabeca");
                return;
            }

            conta.depositar(valor);
            valores.add("Depositado: R$ " + valor);

            atualizarSaldo();
            Valor.clear();

            lblMensagem.setVisible(true);

        } catch (NumberFormatException e) {
            System.out.println("Valor inválido");
        }
    }

    // Saque
    @FXML
    protected void sacar() {
        try {
            double valor = Double.parseDouble(Valor.getText());

            if (valor <= 0) {
                System.out.println("Maior que 0 o valor seu cabeca");
                return;
            }

            if (valor > conta.getSaldo()) {
                System.out.println("Saldo insuficiente");
                return;
            }

            conta.sacar(valor);
            valores.add("Sacado: R$ " + valor);

            atualizarSaldo();
            Valor.clear();

            lblMensagem.setVisible(true);

        } catch (NumberFormatException e) {
            System.out.println("Valor inválido!");
        }
    }

    // Saldo e Extrato
    @FXML
    protected void ExibirSaldo() {
        atualizarSaldo();

        if (txtExtrato != null) {
            txtExtrato.setText(gerarExtrato());
        }
    }

    // Gerar Extrato
    private String gerarExtrato() {
        StringBuilder extrato = new StringBuilder();
        extrato.append("--- EXTRATO ---\n");

        for (String operacao : valores) {
            extrato.append(operacao).append("\n");
        }

        extrato.append("---\nSaldo Atual: R$ ")
                .append(conta.getSaldo());

        return extrato.toString();
    }

    // Atualização do saldo da conta pós operação
    private void atualizarSaldo() {

        // Verificação e atualização do saldo
        if (Saldo != null) {
            Saldo.setText("Saldo: R$ " + conta.getSaldo());
        }
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

    // EXTRATO
    @FXML
    private void abrirExtrato(ActionEvent event) throws IOException {
        trocarTela(event, "/views/Extrato.fxml");
    }

    // SAIR
    @FXML
    private void abrirConclusao(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/views/telaConclusao.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource())
                .getScene()
                .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
}
