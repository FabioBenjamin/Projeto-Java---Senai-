package com.SistemaVendas.Controller;

import com.SistemaVendas.Dao.ClienteDAO;
import com.SistemaVendas.Model.Cliente;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class ClienteController {

    @FXML
    private TableView<Cliente> tblCliente;

    private ClienteDAO dao;

    public void initialize() {

        try {
            dao = new ClienteDAO();
            tblCliente.getItems().setAll(dao.listarClientes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Atualizar dados do cliente
    @FXML
    private void atualizar() {}

    @FXML
    public void excluir() throws Exception {
        Cliente cliente =  tblCliente.getSelectionModel().getSelectedItem();

        if (cliente != null) {
            dao.ExcluirCliente(cliente.getIdCliente());
            tblCliente.getItems().remove(cliente);
        }
    }

    // Editar dados do cliente
    @FXML
    public void editar() throws Exception {
        Cliente clienteSelecionado = tblCliente.getSelectionModel().getSelectedItem();

        if (clienteSelecionado != null) {

            // Atualiza os dados com base nos campos da tela
            clienteSelecionado.setNome(tfNome.getText());
            clienteSelecionado.setDataNascimento(DtNascimento.getValue());
            clienteSelecionado.setSexo(cbSexo.getValue().toString());

            // Atualiza no banco (você precisa ter esse método no DAO)
            dao.atualizarCliente(clienteSelecionado);

            // Atualiza a tabela
            tblCliente.refresh()
    }

    // Fechar "TelaDeCadastroPessoa"
    @FXML
    public void fechar() throws Exception {
            Stage stage = (Stage) tblCliente.getScene().getWindow();
            stage.close();
        }
    }
}
