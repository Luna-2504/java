package co.edu.poli.actividad10.vista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Asegúrate que la ruta del FXML es correcta y el archivo existe
        FXMLLoader loader = new FXMLLoader(getClass().getResource("academia.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Gestión Actividades Académicas");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

