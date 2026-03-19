module com.example.sistemavendas {

    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;
    requires lombok;

    opens com.example.sistemavendas to javafx.fxml;
    opens com.example.sistemavendas.model to javafx.fxml, lombok;

    exports com.SistemaVendas.Config;
    exports com.SistemaVendas.Model;

}