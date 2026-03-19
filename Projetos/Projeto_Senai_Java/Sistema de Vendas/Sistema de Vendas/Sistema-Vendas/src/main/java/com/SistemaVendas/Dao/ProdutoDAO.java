package com.SistemaVendas.Dao;

import com.SistemaVendas.Config.ConnectionBank;
import com.SistemaVendas.Model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDAO {

    private Connection connection;

    // Contrutror
    public ProdutoDAO() throws SQLException {
        this.connection = new  ConnectionBank().getConnection();
    }

    public ArrayList<Produto> listarProdutos() throws SQLException {
        String SQL = "SELECT * FROM produto";
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        // Consulta ao banco
        PreparedStatement Prent = connection.prepareStatement(SQL);
        ResultSet Result = Prent.executeQuery();

        while (Result.next()) {
            Integer idProduto = Result.getInt("id_Produto");
            Integer idCliente = Result.getInt("id_Categoria");
            String nomeProduto = Result.getString("Nome_Produto");
            String descricao = Result.getString("Descricao");
            double ValorCusto = Result.getDouble("Valor_Custo");
            double ValorVenda = Result.getDouble("Valor_Venda");

            listaProdutos.add(new Produto(idProduto, nomeProduto, descricao, ValorCusto, ValorVenda));
        }
        return listaProdutos;
    }

    public Boolean AtualizarProduto(Produto produto) throws SQLException {
        String SQL = "UPDATE Produto SET id_Categoria = ?, Nome_Produto = ?, Descricao = ?, Valor_Custo = ?, Valor_Venda = ? WHERE id_Produto = ?";

        try (PreparedStatement Prent = connection.prepareStatement(SQL)) {
            Prent.setInt(1, produto.getIdProduto());
            Prent.setString(2, produto.getNomeProduto());
            Prent.setString(3, produto.getDescricao());
            Prent.setDouble(4, produto.getValorCusto());
            Prent.setDouble(5, produto.getValorVenda());
            Prent.setInt(6, produto.getIdProduto());

            return Prent.executeUpdate() >= 1;
        }
    }

    public Boolean ExcluirProduto(Produto produto) throws SQLException {
        String SQL = "DELETE FROM Produto WHERE id_Produto = ?";

        try (PreparedStatement Prent = connection.prepareStatement(SQL)) {
            Prent.setInt(1, produto.getIdProduto());

            Integer Removido =  Prent.executeUpdate();
            return Removido >= 1;
        }
    }

    public Boolean ExcluirProduto(Integer idProduto) throws SQLException {
        String SQL = "DELETE FROM Produto WHERE id_Produto = ?";
        PreparedStatement Prent = connection.prepareStatement(SQL);

        Prent.setInt(1, idProduto);

        Integer Removido =  Prent.executeUpdate();
        return Removido >= 1;
    }
}
