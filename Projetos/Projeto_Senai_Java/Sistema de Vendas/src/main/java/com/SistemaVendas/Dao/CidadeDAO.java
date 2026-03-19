package com.SistemaVendas.Dao;

import com.SistemaVendas.Config.ConnectionBank;
import com.SistemaVendas.Model.Cidade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CidadeDAO {

    private Connection connection;

    // Construtor
    public CidadeDAO() throws SQLException {
        this.connection = new ConnectionBank().getConnection();
    }

    public ArrayList<Cidade> listarCidades() throws SQLException {

        String SQL = "SELECT * FROM cidade";
        ArrayList<Cidade> cidades = new ArrayList<>();

        // Consulta ao banco
        PreparedStatement Prent = connection.prepareStatement(SQL);
        ResultSet Result = Prent.executeQuery();

        while (Result.next()) {
            Integer idCidade = Result.getInt("id_Cidade");
            Integer idEstado = Result.getInt("id_Estado");
            String NomeCidade = Result.getString("Nome_Cidade");

            cidades.add(new Cidade(idCidade, idEstado, NomeCidade));
        }
        return cidades;
    }

    public Boolean AtualizarCidade(Cidade cidade) throws SQLException {
        String SQL = "UPDADE Cidade SET Nome_Cidade = ?, id_Estado = ? WHERE id_Cidade = ?";
        try (PreparedStatement Prent = connection.prepareStatement(SQL)) {

            Prent.setInt(1, cidade.getIdCidade());
            Prent.setInt(2, cidade.getIdEstado());
            Prent.setInt(3, cidade.getIdCidade());

            Integer Atualizado = Prent.executeUpdate();
            return Atualizado >= 1;
        }
    }

    public Boolean ExcluirCidade(Cidade cidade) throws SQLException {
        String SQL = "DELETE FROM Cidade WHERE id_Cidade = ?";
        PreparedStatement Prent = connection.prepareStatement(SQL);

        Prent.setInt(1, cidade.getIdCidade());
        Integer Removido = Prent.executeUpdate();
        return Removido >= 1;
    }

    public Boolean ExcluirCidade(Integer idCidade) throws SQLException {
        String SQL = "DELETE FROM Cidade WHERE id_Cidade = ?";
        PreparedStatement Prent = connection.prepareStatement(SQL);

        Prent.setInt(1, idCidade);
        Integer Removido = Prent.executeUpdate();

        return Removido >= 1;
    }
}
