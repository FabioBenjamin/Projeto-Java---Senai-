package com.SistemaVendas.Dao;

import com.SistemaVendas.Config.ConnectionBank;
import com.SistemaVendas.Model.Categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CategoriaDAO {

    private Connection connection;

    // Construtor
    public CategoriaDAO() throws SQLException {
        this.connection = new ConnectionBank().getConnection();
    }

    public ArrayList<Categoria> ListarCategorias() throws SQLException {

        String SQL = "SELECT * FROM categoria";
        ArrayList<Categoria> categorias = new ArrayList<>();

        // Consulta ao banco
        PreparedStatement Prent = connection.prepareStatement(SQL);
        ResultSet Result = Prent.executeQuery();

        while (Result.next()) {
            Integer idCategoria = Result.getInt("id_Categoria");
            String NomeCategoria = Result.getString("Nome");
            String DescricaoCategoria = Result.getString("Descricao");

            categorias.add(new Categoria(idCategoria, NomeCategoria, DescricaoCategoria));
        }
        return categorias;
    }

    public Boolean AtualizarCategoria(Categoria categoria) throws SQLException {
        String SQL = "UPDATE Categoria SET Nome = ?, Descricao = ? WHERE id_Categoria = ?";

        try (PreparedStatement Prent = connection.prepareStatement(SQL)) {

            Prent.setString(1, categoria.getNomeCategoria());
            Prent.setString(2, categoria.getDescricaoCategoria());
            Prent.setInt(3, categoria.getIdCategoria());

            Integer Atualizado = Prent.executeUpdate();
            return Atualizado >= 1;
        }
    }

    public Boolean ExcluirCategoria(Categoria categoria) throws SQLException {

        String SQL = "DELETE FROM Categoria WHERE id_Categoria = ?";
        PreparedStatement Prent = connection.prepareStatement(SQL);

        Prent.setInt(1, categoria.getIdCategoria());
        Integer Removido = Prent.executeUpdate();
        return Removido >= 1;
    }

    public Boolean ExcluirCategoria(Integer idCategoria) throws SQLException {

        String SQL = "DELETE FROM Cliente WHERE id_Categoria = ?";
        PreparedStatement Prent = connection.prepareStatement(SQL);

        Prent.setInt(1, idCategoria);
        Integer Removido = Prent.executeUpdate();

        return Removido >= 1;
    }
}