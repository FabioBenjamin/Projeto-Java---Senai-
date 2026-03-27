package com.SistemaVendas.Controller;

import com.SistemaVendas.Dao.VendedorDAO;
import com.SistemaVendas.Model.Vendedor;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class VendedorController {

    @FXML private TextField txtNome;
    @FXML private ComboBox<String> cbSexo;
    @FXML private DatePicker dpNascimento;
    @FXML private DatePicker dpContrato;

    @FXML private TableView<Vendedor> tabela;
    @FXML private TableColumn<Vendedor, Integer> colunId;
    @FXML private TableColumn<Vendedor, String> colunNome;
    @FXML private TableColumn<Vendedor, String> colunSexo;
    @FXML private TableColumn<Vendedor, LocalDate> colunNascimento;
    @FXML private TableColumn<Vendedor, LocalDate> colunContrato;

    private VendedorDAO dao;

    @FXML
    public void initialize() {
        try {
            dao = new VendedorDAO();

            cbSexo.getItems().addAll("Masculino", "Feminino");

            colunId.setCellValueFactory(new PropertyValueFactory<>("id"));
            colunNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
            colunSexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
            colunNascimento.setCellValueFactory(new PropertyValueFactory<>("dataNascimento"));
            colunContrato.setCellValueFactory(new PropertyValueFactory<>("dataContrato"));

            carregarTabela();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void carregarTabela() throws Exception {
        tabela.getItems().setAll(dao.listar());
    }

    @FXML
    private void salvarVendedor() {
        try {

            if (dao == null) {
                dao = new VendedorDAO();
            }

            Vendedor vendedor = new Vendedor();

            vendedor.setNome(txtNome.getText());
            vendedor.setSexo(cbSexo.getValue());
            vendedor.setDataNascimento(dpNascimento.getValue());
            vendedor.setDataContrato(dpContrato.getValue());

            dao.inserir(vendedor);

            carregarTabela();
            limparCampos();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void limparCampos() {
        txtNome.clear();
        cbSexo.setValue(null);
        dpNascimento.setValue(null);
        dpContrato.setValue(null);
    }

    @FXML
    private void cancelar() {
        limparCampos();
    }
}