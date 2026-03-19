package com.SistemaVendas.Dao;

import com.SistemaVendas.Config.ConnectionBank;
import com.SistemaVendas.Model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class ClienteDAO {

    private Connection connection;

    // Construtor
    public ClienteDAO() throws SQLException {
        this.connection = new ConnectionBank().getConnection();
    }

    public ArrayList<Cliente> listarClientes() throws SQLException {

        String SQL = "SELECT * FROM Cliente";
        ArrayList<Cliente> clientes = new ArrayList<>();

        // Consultas no banco
        PreparedStatement Prent = connection.prepareStatement(SQL);
        ResultSet Resul = Prent.executeQuery();

        while (Resul.next()) {
            Integer idCliente = Resul.getInt("id_Cliente");
            String nomeCompleto = Resul.getString("nome_Cliente");
            String data = Resul.getString("Data_Nascimento");
            LocalDate dataNascimento = LocalDate.parse(data); // Converte String para LocaDate

            Integer cpf = Resul.getInt("Cpf");
            Integer rg = Resul.getInt("Rg");
            String Email = Resul.getString("Email");
            String Sexo = Resul.getString("Sexo");

            clientes.add(new Cliente(idCliente, nomeCompleto, dataNascimento, cpf, rg, Email, Sexo));
        }
        return clientes;
    }

    public Boolean AtualizarCliente(Cliente cliente) throws SQLException {
        String SQL = "UPDATE Cliente SET nome_Cliente = ?, Email = ?, Data_Nascimento = ?, Sexo = ?, Cpf = ?, Rg = ? WHERE id_Cliente = ?";

        try (PreparedStatement Prent = connection.prepareStatement(SQL)) {

            Prent.setString(1, cliente.getNomeCompleto());
            Prent.setString(2, cliente.getEmail());
            Prent.setString(3, cliente.getDataNascimento().toString());
            Prent.setString(4, cliente.getSexo());
            Prent.setInt(5, cliente.getCpf());
            Prent.setInt(6, cliente.getRg());
            Prent.setInt(7, cliente.getIdCliente());

            Integer Atualizado = Prent.executeUpdate();

            return Atualizado >= 1;

        }
    }

    public Boolean ExcluirCliente(Cliente cliente) throws SQLException {

        String SQL = "DELETE FROM Cliente WHERE id_Cliente = ?";
        PreparedStatement Prent = connection.prepareStatement(SQL);

        Prent.setInt(1, cliente.getIdCliente());
        Integer Removido = Prent.executeUpdate();

        return Removido >= 1;
    }

    public Boolean ExcluirCliente(Integer idCliente) throws SQLException {

        String SQL = "DELETE FROM Cliente WHERE id_Cliente = ?";
        PreparedStatement Prent = connection.prepareStatement(SQL);

        Prent.setInt(1, idCliente);
        Integer Removido = Prent.executeUpdate();

        return Removido >= 1;
    }
}
