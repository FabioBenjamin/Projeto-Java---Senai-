package com.SistemaVendas.Controller;

import com.SistemaVendas.Dao.ProdutoDAO;
import com.SistemaVendas.Model.Produto;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class ProdutoController {

    @FXML
    private TableView<Produto> tblProduto;

    private ProdutoDAO dao;

    public void initialize() {

        try {
            dao= new ProdutoDAO();
            tblProduto.getItems().setAll(dao.listarProdutos());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void atualizar() {}

    @FXML
    public void excluir() throws Exception {
        Produto produto = tblProduto.getSelectionModel().getSelectedItem();

        if (produto != null) {
            dao.ExcluirProduto(produto.getIdProduto());
            tblProduto.getItems().remove(produto);
        }
    }
}