package com.SistemaVendas.Controller;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class PainelController extends LoginController {

    @FXML
    private Label lblUsuario;

    @FXML
    private Label saida;

    @FXML
    private Label lblTotalClientes;

    @FXML
    private Label lblNovosHoje;

    @FXML
    private Label lblTotalVendas;

    @FXML
    private PieChart graficoClientes;

    // Inicialização
    public void initialize() {

        lblUsuario.setText("Bem-vindo, Fabio");

        lblTotalClientes.setText("10");
        lblNovosHoje.setText("2");
        lblTotalVendas.setText("5");

        graficoClientes.getData().addAll(
                new PieChart.Data("Masculino", 6),
                new PieChart.Data("Feminino", 4)
        );
    }

    private void trocarTela(ActionEvent event, String rota) {

        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource(rota)
            );

            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource())
                    .getScene()
                    .getWindow();

            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {
            System.out.println("Erro ao carregar: " + rota);
            e.printStackTrace();
        }
    }

    // BOTOES

    @FXML
    public void abrirDashboard(ActionEvent event) {
        trocarTela(event, "/views/home.fxml");
    }

    @FXML
    public void abrirClientes(ActionEvent event) {
        trocarTela(event, "/views/cliente.fxml");
    }

    @FXML
    public void abrirVendedores(ActionEvent event) {
        trocarTela(event, "/views/vendedor.fxml");
    }

    @FXML
    public void abrirRelatorios(ActionEvent event) {
        trocarTela(event, "/views/relatorio.fxml");
    }

    @FXML
    public void abrirConfiguracoes(ActionEvent event) {
        trocarTela(event, "/views/configuracao.fxml");
    }


    @FXML
    private void FinalizarPrograma() {
        Platform.exit();
    }
}