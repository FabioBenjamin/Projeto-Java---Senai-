module com.sistemavendas {

    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    // Permite o JavaFX acessar sua aplicação (reflection)
    opens com.SistemaVendas to javafx.graphics;

    // Permite o FXMLLoader acessar os controllers
    opens com.SistemaVendas.Controller to javafx.fxml;

    // Exporta o pacote principal (onde fica o Main)
    exports com.SistemaVendas;
}