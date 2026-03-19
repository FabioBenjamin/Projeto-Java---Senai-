package com.SistemaVendas.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBank {

    private Connection connection;

    public ConnectionBank() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:sqlite:src/main/resources/vendas.db");

    }

    public Connection getConnection() {
        return connection;
    }
}
