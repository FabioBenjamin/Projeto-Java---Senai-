package com.SistemaVendas.Dao;

import com.SistemaVendas.Config.ConnectionBank;
import com.SistemaVendas.Model.Estado;

import java.sql.*;
import java.util.ArrayList;
import java.sql.SQLException;

public class EstadoDAO {

    private Connection connection;

    // Construtor
    public EstadoDAO() throws SQLException {
        this.connection = new ConnectionBank().getConnection();
    }

    public ArrayList<Estado> ListarEstado() throws SQLException {
        String SQL = "SELECT * FROM Estado";
        ArrayList<Estado> ListaEstado = new ArrayList<>();

        // Consulta ao banco
        PreparedStatement Prent = connection.prepareStatement(SQL);
        ResultSet Result = Prent.executeQuery();

        while (Result.next()) {
            Integer idEstado = Result.getInt("id_Estado");
            String nomeEstado = Result.getString("Nome");

            ListaEstado.add(new Estado(idEstado, nomeEstado));
        }
        return ListaEstado;
    }

    public Boolean AtualizarEstado(Estado estado) throws SQLException {
        String SQL = "UPDATE Estado SET Nome = ? WHERE id_Estado = ?";

        try (PreparedStatement Prent = connection.prepareStatement(SQL)) {
            Prent.setString(1, estado.getNomeEstado());
            Prent.setInt(2, estado.getIdEstado());

            return Prent.executeUpdate() >= 1;
        }
    }

    public Boolean ExcluirEstado(Estado estado) throws SQLException {
        String SQL = "DELETE FROM Estado WHERE id_Estado = ?";

        try (PreparedStatement Prent = connection.prepareStatement(SQL)) {
            Prent.setInt(1, estado.getIdEstado());

            Integer Removido = Prent.executeUpdate();
            return Removido >= 1;
        }
    }

    public Boolean ExcluirEstado(Integer idEstado) throws SQLException {
        String SQL = "DELETE FROM Estado WHERE id_Estado = ?";
        PreparedStatement Prent = connection.prepareStatement(SQL);

        Prent.setInt(1, idEstado);

        Integer Removido = Prent.executeUpdate();
        return Removido >= 1;
    }
}