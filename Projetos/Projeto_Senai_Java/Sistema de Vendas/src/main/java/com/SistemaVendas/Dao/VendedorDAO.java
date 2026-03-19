package com.SistemaVendas.Dao;

import com.SistemaVendas.Config.ConnectionBank;
import com.SistemaVendas.Model.Vendedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class VendedorDAO {

    private Connection connection;

    // Construtor
    public VendedorDAO() throws SQLException {
        this.connection = new ConnectionBank().getConnection();
    }

    public ArrayList<Vendedor> ConsultaVendedor() throws SQLException {
        String SQL = "SELECT * FROM Vendedor";
        ArrayList<Vendedor> lista = new ArrayList<>();

        PreparedStatement Prent = connection.prepareStatement(SQL);
        ResultSet Result = Prent.executeQuery();

        while (Result.next()) {
            Vendedor vendedor = new Vendedor();

            vendedor.setId(Result.getInt("id_Vendedor"));
            vendedor.setNome(Result.getString("nome"));
            vendedor.setSexo(Result.getString("sexo"));
            vendedor.setDataNascimento(Result.getDate("dataVendedor").toLocalDate());
            vendedor.setDataContrato(Result.getDate("Data_Contrato").toLocalDate());

            lista.add(vendedor);
        }
        return lista;
    }

    public Boolean AtualizarVendedor(Vendedor vendedor) throws SQLException {
        String SQL = "UPDATE Vendedor SET nome = ?, sexo = ?, dataVendedor = ?, Data_Contrato = ? WHERE id_Vendedor = ?";

        try (PreparedStatement Prent = connection.prepareStatement(SQL)) {
            Prent.setString(1, vendedor.getNome());
            Prent.setString(2, vendedor.getSexo());
            Prent.setDate(3, java.sql.Date.valueOf(vendedor.getDataNascimento()));
            Prent.setDate(4, java.sql.Date.valueOf(vendedor.getDataContrato()));
            Prent.setInt(5, vendedor.getId());

            return Prent.executeUpdate() >= 1;
        }
    }

    public Boolean ExcluirVendedor(Vendedor vendedor) throws SQLException {
        String SQL = "DELETE FROM Vendedor WHERE id_Vendedor = ?";

        try (PreparedStatement Prent = connection.prepareStatement(SQL)) {
            Prent.setInt(1, vendedor.getId());

            int removido = Prent.executeUpdate();
            return removido >= 1;
        }
    }

    public Boolean ExcluirVendedor(Integer id) throws SQLException {
        String SQL = "DELETE FROM Vendedor WHERE id_Vendedor = ?";

        PreparedStatement Prent = connection.prepareStatement(SQL);
        Prent.setInt(1, id);

        int removido = Prent.executeUpdate();
        return removido >= 1;
    }
}