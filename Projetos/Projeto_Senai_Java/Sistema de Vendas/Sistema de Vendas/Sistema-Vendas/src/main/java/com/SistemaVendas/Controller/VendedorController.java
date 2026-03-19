package com.SistemaVendas.Controller;

import com.SistemaVendas.Dao.VendedorDAO;
import com.SistemaVendas.Model.Vendedor;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

public class VendedorController {

    @FXML
    private TableView<Vendedor> tabela;

    @FXML
    private TableColumn<Vendedor, Integer> colunId;

    @FXML
    private TableColumn<Vendedor, String> colunNome;

    private VendedorDAO dao;

    public void inicializacao() {
        try {
            dao = new VendedorDAO();
            carregarTabela();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void carregarTabela() throws Exception {
        tabela.getItems().setAll(dao.ConsultaVendedor());
    }

    // Abrir tela de cadastro
    @FXML
    public void adicionar() {}

    // Excluir o usuário vendedor
    @FXML
    public void atualizar() throws Exception {
        Vendedor vendedor = tabela.getSelectionModel().getSelectedItem();

        if (vendedor != null) {
            dao.ExcluirVendedor(vendedor.getId());
            carregarTabela();
        }
    }
}