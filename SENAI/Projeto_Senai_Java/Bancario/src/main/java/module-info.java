module com.example.bancario {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    // Acesso aos models
    exports com.models;
    opens com.models to javafx.fxml;

    // Controllers
    opens com.bancario to javafx.fxml;
    exports com.bancario;
    exports com.bancario.Controller;
    opens com.bancario.Controller to javafx.fxml;
}