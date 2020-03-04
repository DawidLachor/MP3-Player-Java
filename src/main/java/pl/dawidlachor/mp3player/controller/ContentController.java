package pl.dawidlachor.mp3player.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class ContentController {
    @FXML
    private TableView<?> contentTable;

    public void initialize() {
        System.out.println("Content controller created");
    }
}