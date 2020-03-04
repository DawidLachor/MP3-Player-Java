package pl.dawidlachor.mp3player.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Create by Dawid Lachor on 26.02.2020
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        Pane load = FXMLLoader.load(getClass().getResource("/fxml/mainPane.fxml"));
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.setTitle("MP3 Player Version Dawid");
        stage.show();
    }
}
