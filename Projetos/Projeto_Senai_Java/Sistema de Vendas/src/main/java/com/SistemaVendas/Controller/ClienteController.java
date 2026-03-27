package com.SistemaVendas.Controller;

import com.SistemaVendas.Dao.ClienteDAO;
import com.SistemaVendas.Model.Cliente;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class ClienteController {

    @FXML private TextField tfNome;
    @FXML private DatePicker DtNascimento;
    @FXML private ComboBox<String> cbSexo;

    @FXML private TableView<Cliente> tblCliente;
    @FXML private TableColumn<Cliente, String> colNome;
    @FXML private TableColumn<Cliente, LocalDate> colNascimento;
    @FXML private TableColumn<Cliente, String> colSexo;

    private ClienteDAO dao;

    // inicialização
    public void initialize() {

        try {

            dao = new ClienteDAO();

            cbSexo.getItems().addAll("Masculino", "Feminino");

            colNome.setCellValueFactory(new PropertyValueFactory<>("nomeCompleto"));
            colNascimento.setCellValueFactory(new PropertyValueFactory<>("dataNascimento"));
            colSexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));

            atualizarTabela();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // atualizar tabela
    private void atualizarTabela() throws Exception {

        tblCliente.setItems(
                FXCollections.observableArrayList(dao.listarClientes())
        );
    }

    // salvar
    @FXML
    public void salvar() {

        try {

            Cliente cliente = new Cliente();
            cliente.setNomeCompleto(tfNome.getText());
            cliente.setDataNascimento(DtNascimento.getValue());
            cliente.setSexo(cbSexo.getValue());

            dao.inserirCliente(cliente);

            atualizarTabela();
            limpar();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // editar
    @FXML
    public void editar() {

        try {

            Cliente cliente = tblCliente.getSelectionModel().getSelectedItem();

            if (cliente == null) return;

            cliente.setNomeCompleto(tfNome.getText());
            cliente.setDataNascimento(DtNascimento.getValue());
            cliente.setSexo(cbSexo.getValue());

            dao.atualizarCliente(cliente);

            atualizarTabela();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // excluir
    @FXML
    public void excluir() {

        try {

            Cliente cliente = tblCliente.getSelectionModel().getSelectedItem();

            if (cliente == null) return;

            dao.excluirCliente(cliente.getIdCliente());

            atualizarTabela();
            limpar();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // limpar
    private void limpar() {
        tfNome.clear();
        DtNascimento.setValue(null);
        cbSexo.setValue(null);
    }

    // fechar
    @FXML
    public void fechar() {
        tblCliente.getScene().getWindow().hide();
    }
}