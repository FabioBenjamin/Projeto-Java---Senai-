package com.SistemaVendas.Controller;

import com.SistemaVendas.Dao.VendaDAO;
import com.SistemaVendas.Model.Venda;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

public class VendaController {

    @FXML
    private TableView<Venda> tableVendas;

    @FXML
    private Label lblTotalVendas;

    private VendaDAO dao;

    public void initialize() {

        try {
            dao = new VendaDAO();
            load();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void load() throws Exception {

        var lista = dao.ListarVenda();
        tableVendas.getItems().setAll(lista);

        double totalVenda = lista.stream().mapToDouble(Venda::getTotalVenda).sum();

        lblTotalVendas.setText(String.format("%.2f", totalVenda));
    }

    // Abrir tela de venda
    @FXML
    public void novaVenda() {

    }
}
