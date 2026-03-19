package com.SistemaVendas.Dao;

import com.SistemaVendas.Config.ConnectionBank;
import com.SistemaVendas.Model.Loja;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;

public class LojaDAO {

    private Connection connection;

    // Construtor
    public LojaDAO() throws SQLException {
        this.connection = new ConnectionBank().getConnection();
    }

    public ArrayList<Loja> listarLojas() throws SQLException {
        String SQL = "SELECT * FROM Loja";
        ArrayList<Loja> lojas = new ArrayList<>();

        // Consultar ao banco
        PreparedStatement Prent =  connection.prepareStatement(SQL);
        ResultSet Result = Prent.executeQuery();

        while (Result.next()) {
            Integer idLoja = Result.getInt("id_Loja");
            String NomeLoja = Result.getString("Nome_Loja");
            String Telefone = Result.getString("Telefone");

            lojas.add(new Loja(idLoja, NomeLoja, Telefone));
        }
        return lojas;
    }

    public Boolean AtualizarLoja(Loja loja) throws SQLException {
        String SQL = "UPDATE Loja SET Nome = ?, Telefone = ? WHERE id_Loja = ?";

        try (PreparedStatement Prent = connection.prepareStatement(SQL)) {
            Prent.setInt(1, loja.getIdLoja());
            Prent.setString(2, loja.getNomeLoja());
            Prent.setString(3, loja.getTelefone());

            Integer Atualizado = Prent.executeUpdate();
            return Atualizado >= 1;
        }
    }

    public Boolean ExcluirLoja(Loja loja) throws SQLException {
        String SQL = "DELETE FROM Loja WHERE id_Loja = ?";
        try (PreparedStatement Prent = connection.prepareStatement(SQL)) {

            Prent.setInt(1, loja.getIdLoja());

            Integer Removido = Prent.executeUpdate();
            return Removido >= 1;
        }
    }

    public Boolean ExcluirLoja(Integer idLoja) throws SQLException {
        String SQL = "DELETE FROM Loja WHERE id_Loja = ?";

        PreparedStatement Prent  = connection.prepareStatement(SQL);
        Prent.setInt(1, idLoja);

        Integer Removido = Prent.executeUpdate();
        return Removido >= 1;
    }
}
