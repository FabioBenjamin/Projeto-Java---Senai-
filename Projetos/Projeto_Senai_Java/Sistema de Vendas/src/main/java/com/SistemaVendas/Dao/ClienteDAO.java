package com.SistemaVendas.Dao;

import com.SistemaVendas.Config.ConnectionBank;
import com.SistemaVendas.Model.Cliente;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private Connection connection;

    // conexão
    public ClienteDAO() {
        try {
            connection = new ConnectionBank().getConnection();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // INSERT
    public void inserirCliente(Cliente cliente) throws Exception {

        String SQL = "INSERT INTO Cliente (nome_Cliente, Data_Nascimento, Sexo, Email, Cpf, Rg) VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement preState = connection.prepareStatement(SQL);

        preState.setString(1, cliente.getNomeCompleto());
        preState.setString(2, cliente.getDataNascimento().toString());
        preState.setString(3, cliente.getSexo());
        preState.setString(4, "padrao@email.com");
        preState.setString(5, "000");
        preState.setString(6, "000");

        preState.execute();
        preState.close();
    }

    public List<Cliente> listarClientes() throws Exception {

        List<Cliente> lista = new ArrayList<>();

        String SQL = "SELECT * FROM Cliente";

        Statement state = connection.createStatement();
        ResultSet result = state.executeQuery(SQL);

        while (result.next()) {

            Cliente cliente = new Cliente();

            cliente.setIdCliente(result.getInt("id_Cliente"));
            cliente.setNomeCompleto(result.getString("nome_Cliente"));
            cliente.setDataNascimento(LocalDate.parse(result.getString("Data_Nascimento")));
            cliente.setSexo(result.getString("Sexo"));

            lista.add(cliente);
        }

        return lista;
    }

    public void atualizarCliente(Cliente cliente) throws Exception {

        String SQL = "UPDATE Cliente SET nome_Cliente=?, Data_Nascimento=?, Sexo=? WHERE id_Cliente=?";

        PreparedStatement preState = connection.prepareStatement(SQL);

        preState.setString(1, cliente.getNomeCompleto());
        preState.setString(2, cliente.getDataNascimento().toString());
        preState.setString(3, cliente.getSexo());
        preState.setInt(4, cliente.getIdCliente());

        preState.execute();
        preState.close();
    }

    public void excluirCliente(int idCliente) throws Exception {

        String SQL = "DELETE FROM Cliente WHERE id_Cliente=?";

        PreparedStatement preState = connection.prepareStatement(SQL);

        preState.setInt(1, idCliente);
        preState.execute();
        preState.close();
    }
}