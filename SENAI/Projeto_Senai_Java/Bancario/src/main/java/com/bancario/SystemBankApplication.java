package com.bancario;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SystemBankApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // Tela inicial
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/telaIntrodutoria.fxml")
        );

        // Carregar tela inicial 
        Scene scene = new Scene(loader.load());

        stage.setTitle("Sistema Bancário");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
