package com.SistemaVendas.Dao;

import com.SistemaVendas.Config.ConnectionBank;
import com.SistemaVendas.Model.Venda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VendaDAO {

    private Connection connection;

    // Construtor
    public VendaDAO() throws SQLException {
        this.connection = new ConnectionBank().getConnection();
    }

    public ArrayList<Venda> ListarVenda() throws SQLException {
        String SQL = "SELECT * FROM Venda";
        ArrayList<Venda> ListaVenda = new ArrayList<>();

        //Consulta ao banco
        PreparedStatement Prent = connection.prepareStatement(SQL);
        ResultSet Result = Prent.executeQuery();

        while (Result.next()) {
            Integer idVenda = Result.getInt("id_Venda");
            Integer idCliente = Result.getInt("id_Cliente");
            Integer idCidade = Result.getInt("id_Cidade");
            Integer idPeriodo = Result.getInt("id_Periodo");
            Integer idVendedor = Result.getInt("id_Vendedor");
            Integer idLoja = Result.getInt("id_Loja");
            String dataVenda = Result.getString("Data_Venda");
            String horaVenda = Result.getString("Hora_Venda");
            String metodoPagamento = Result.getString("Metodo_Pagamento");
            double TotalVenda = Result.getDouble(("Total_Venda"));

            ListaVenda.add(new Venda(idVenda, idCliente, idCidade, idPeriodo, idVendedor, idLoja, dataVenda, horaVenda, metodoPagamento, TotalVenda));
        }
        return ListaVenda;
    }

    public Boolean AtualizarVenda(Venda venda) throws SQLException {
        String SQL = "UPDATE Venda SET id_Categoria = ?, Nome_Produto = ?, Descricao = ?, Valor_Custo = ?, Valor_Venda = ? WHERE id_Venda = ?";

        try (PreparedStatement Prent = connection.prepareStatement(SQL)) {
            Prent.setInt(1, venda.getIdVenda());
            Prent.setInt(2, venda.getIdCliente());
            Prent.setInt(3, venda.getIdCidade());
            Prent.setInt(4, venda.getIdPeriodo());
            Prent.setInt(5, venda.getIdVendedor());
            Prent.setString(6, venda.getDataVenda());
            Prent.setString(7, venda.getHoraVenda());
            Prent.setString(8, venda.getMetodoPagamento());
            Prent.setDouble(9, venda.getTotalVenda());
            Prent.setInt(10, venda.getIdVenda());

            return Prent.executeUpdate() >= 1;
        }
    }

    public Boolean ExcluirVenda(Venda venda) throws SQLException {
        String SQL = "DELETE FROM Venda WHERE id_Venda = ?";

        try (PreparedStatement Prent = connection.prepareStatement(SQL)) {
            Prent.setInt(1, venda.getIdVenda());

            Integer Removido =  Prent.executeUpdate();
            return Removido >= 1;
        }
    }

    public Boolean ExcluirVenda(Integer idVenda) throws SQLException {
        String SQL = "DELETE FROM Venda WHERE id_Venda = ?";
        PreparedStatement Prent = connection.prepareStatement(SQL);

        Prent.setInt(1, idVenda);

        Integer Removido =  Prent.executeUpdate();
        return Removido >= 1;
    }
}
