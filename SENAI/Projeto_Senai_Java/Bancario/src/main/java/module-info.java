module com.example.bancario {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.bancario to javafx.fxml;
    exports com.example.bancario;
    exports com.bancario;
    opens com.bancario to javafx.fxml;
}