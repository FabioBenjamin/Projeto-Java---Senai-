package com.SistemaVendas.Dao;

import com.SistemaVendas.Config.ConnectionBank;
import com.SistemaVendas.Model.VendaProduto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VendaProdutoDAO {

    private Connection connection;

    // Construtor
    public VendaProdutoDAO() throws SQLException {
        this.connection = new ConnectionBank().getConnection();
    }

    public ArrayList<VendaProduto> ListarVendaProduto() throws SQLException {
        String SQL = "SELECT * FROM Venda_Produto";
        ArrayList<VendaProduto> ListaVendaProduto = new ArrayList<>();

        // Consulta ao banco
        PreparedStatement Prent = connection.prepareStatement(SQL);
        ResultSet Result = Prent.executeQuery();

        while (Result.next()) {
            Integer idVendaProduto = Result.getInt("id_VendaProduto");
            Integer idProduto = Result.getInt("id_Produto");
            Integer idVenda = Result.getInt("id_Venda");
            Integer Quantidade =  Result.getInt("Quantidade");
            Double ValorUnitario =  Result.getDouble("Preco_Unitario");
            Double Desconto =  Result.getDouble("Desconto");

            ListaVendaProduto.add(new VendaProduto(idVendaProduto, idProduto, idVenda, Quantidade, ValorUnitario, Desconto));
        }
        return ListaVendaProduto;
    }

    public Boolean AtualizarVendaProduto(VendaProduto vendaProduto) throws SQLException {
        String SQL = "UPDATE Venda_Produto SET id_Produto = ?, id_Venda = ?, Quantidade = ?, Preco_Unitario = ?, Desconto = ? WHERE id_VendaProduto = ?";

        try (PreparedStatement Prent = connection.prepareStatement(SQL)) {
            Prent.setInt(1, vendaProduto.getIdProduto());
            Prent.setInt(2, vendaProduto.getIdVenda());
            Prent.setInt(3, vendaProduto.getQuantidade());

            return Prent.executeUpdate() >= 1;
        }
    }

    public Boolean ExcluirVendaProduto(VendaProduto vendaProduto) throws SQLException {
        String SQL = "DELETE FROM Venda_Produto  WHERE id_VendaProduto = ?";

        try (PreparedStatement Prent = connection.prepareStatement(SQL)) {
            Prent.setInt(1, vendaProduto.getIdProduto());

            Integer Removido = Prent.executeUpdate();
            return Removido >= 1;
        }
    }

    public Boolean ExcluirVendaProduto(Integer idVendaProduto) throws SQLException {
        String SQL = "DELETE FROM Venda_Produto  WHERE id_VendaProduto = ?";
        PreparedStatement Prent = connection.prepareStatement(SQL);

        Prent.setInt(1, idVendaProduto);

        Integer Removido = Prent.executeUpdate();
        return Removido >= 1;
    }
}


