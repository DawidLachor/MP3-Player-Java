package pl.dawidlachor.mp3player.controller;

import javafx.fxml.FXML;

public class MainController {

    @FXML
    ControlController controlPaneController;
    @FXML
    ContentController contentPaneController;
    @FXML
    MenuController menuPaneController;

    public void initialize() {
        System.out.println("Main controller created");
        System.out.println(contentPaneController);
        System.out.println(controlPaneController);
        System.out.println(menuPaneController);
    }

}