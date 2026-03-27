package com.SistemaVendas.Dao;

import com.SistemaVendas.Config.ConnectionBank;
import com.SistemaVendas.Model.Vendedor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VendedorDAO {

    private Connection connection;

    // Construtor
    public VendedorDAO() throws SQLException {
        this.connection = new ConnectionBank().getConnection();

        if (this.connection == null) {
            throw new SQLException("Erro ao conectar com o banco!");
        }
    }

    public List<Vendedor> listar() throws SQLException {

        String SQL = "SELECT * FROM Vendedor";
        List<Vendedor> lista = new ArrayList<>();

        try (PreparedStatement PreState = connection.prepareStatement(SQL);
             ResultSet Resul = PreState.executeQuery()) {

            while (Resul.next()) {

                Vendedor vendedor = new Vendedor();

                vendedor.setId(Resul.getInt("id_Vendedor"));
                vendedor.setNome(Resul.getString("Nome_Vendedor"));
                vendedor.setSexo(Resul.getString("Sexo"));

                vendedor.setDataNascimento(
                        Resul.getDate("Data_Nascimento").toLocalDate()
                );

                vendedor.setDataContrato(
                        Resul.getDate("Data_Contrato").toLocalDate()
                );

                lista.add(vendedor);
            }
        }

        return lista;
    }

    public boolean inserir(Vendedor vendedor) throws SQLException {

        String SQL = "INSERT INTO Vendedor (Nome_Vendedor, Sexo, Data_Nascimento, Data_Contrato) VALUES (?, ?, ?, ?)";

        try (PreparedStatement PreState = connection.prepareStatement(SQL)) {

            PreState.setString(1, vendedor.getNome());
            PreState.setString(2, vendedor.getSexo());
            PreState.setDate(3, Date.valueOf(vendedor.getDataNascimento()));
            PreState.setDate(4, Date.valueOf(vendedor.getDataContrato()));

            int linhas = PreState.executeUpdate();

            return linhas > 0;
        }
    }

    public boolean atualizar(Vendedor vendedor) throws SQLException {

        String SQL = "UPDATE Vendedor SET Nome_Vendedor = ?, Sexo = ?, Data_Nascimento = ?, Data_Contrato = ? WHERE id_Vendedor = ?";

        try (PreparedStatement PreState = connection.prepareStatement(SQL)) {

            PreState.setString(1, vendedor.getNome());
            PreState.setString(2, vendedor.getSexo());
            PreState.setDate(3, Date.valueOf(vendedor.getDataNascimento()));
            PreState.setDate(4, Date.valueOf(vendedor.getDataContrato()));
            PreState.setInt(5, vendedor.getId());

            return PreState.executeUpdate() > 0;
        }
    }

    public boolean excluir(int id) throws SQLException {

        String SQL = "DELETE FROM Vendedor WHERE id_Vendedor = ?";

        try (PreparedStatement PreState = connection.prepareStatement(SQL)) {

            PreState.setInt(1, id);

            return PreState.executeUpdate() > 0;
        }
    }
}