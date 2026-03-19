package com.SistemaVendas.Dao;

import com.SistemaVendas.Config.ConnectionBank;
import com.SistemaVendas.Model.Periodo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class PeriodoDAO {

    private Connection connection;

    // Construtor
    public PeriodoDAO() throws SQLException {
        this.connection = new ConnectionBank().getConnection();
    }

    public ArrayList<Periodo> listarPeriodos() throws SQLException {
        String SQL = "SELECT * FROM Periodo";
        ArrayList<Periodo> listaPeriodos = new ArrayList<>();

        // Consulta ao banco
        PreparedStatement Prent = connection.prepareStatement(SQL);
        ResultSet Result = Prent.getResultSet();

        while (Result.next()) {

            Integer idPeriodo = Result.getInt("id_Periodo");
            Integer diaSemana = Result.getInt("Dia_Semana");
            Integer anoPeriodo = Result.getInt("Ano_Periodo");
            LocalDate DataPeriodo = Result.getDate("DataPeriodo").toLocalDate();
            String mesPeriodo = Result.getString("Mes_Periodo");

            listaPeriodos.add(new Periodo(idPeriodo, DataPeriodo, diaSemana, mesPeriodo, anoPeriodo));
        }
        return listaPeriodos;
    }

    public Boolean AtualizarPeriodo(Periodo periodo) throws SQLException {
        String SQL = "UPDATE Periodo SET Data_Periodo = ?, Dia_Semana = ?, Mes_Periodo = ?, Ano_Periodo = ?";

        try (PreparedStatement Prent = connection.prepareStatement(SQL)) {
            Prent.setInt(1, periodo.getIdPeriodo());
            Prent.setInt(2, periodo.getDiaSemana());
            Prent.setString(3, periodo.getMesPeriodo());
            Prent.setInt(4, periodo.getAnoPeriodo());

            Integer Atualizado = Prent.executeUpdate();
            return Atualizado >= 1;
        }
    }

    public Boolean ExcluirPeriodo(Periodo periodo) throws SQLException {
        String SQL = "DELETE FROM Periodo WHERE id_Periodo = ?";

        try (PreparedStatement Prent = connection.prepareStatement(SQL)) {
            Prent.setInt(1, periodo.getIdPeriodo());

            Integer Removido = Prent.executeUpdate();
            return Removido >= 1;
        }
    }

    public Boolean ExcluirPeriodo(Integer idPeriodo) throws SQLException {
        String SQL = "DELETE FROM Periodo WHERE id_Periodo = ?";

        PreparedStatement Prent = connection.prepareStatement(SQL);
        Prent.setInt(1, idPeriodo);

        Integer Removido = Prent.executeUpdate();
        return Removido >= 1;
    }
}
