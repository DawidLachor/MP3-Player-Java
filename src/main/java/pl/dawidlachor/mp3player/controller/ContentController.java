package pl.dawidlachor.mp3player.controller;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;
import pl.dawidlachor.mp3player.mp3.Mp3Song;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ContentController {

    private static final String TITLE_COLUMN = "Tytuł";
    private static final String AUTHOR_COLUMN = "Autor";
    private static final String ALBUM_COLUMN = "Album";

    @FXML
    private TableView<Mp3Song> contentTable;


    public void initialize() {
        configureTableColumns();
    }

    private void configureTableColumns() {
        TableColumn<Mp3Song, String> titleColumn = new TableColumn<Mp3Song, String>(TITLE_COLUMN);
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));

        TableColumn<Mp3Song, String> authorColumn = new TableColumn<Mp3Song, String>(AUTHOR_COLUMN);
        authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));

        TableColumn<Mp3Song, String> albumColumn = new TableColumn<Mp3Song, String>(ALBUM_COLUMN);
        albumColumn.setCellValueFactory(new PropertyValueFactory<>("album"));

        contentTable.getColumns().add(titleColumn);
        contentTable.getColumns().add(authorColumn);
        contentTable.getColumns().add(albumColumn);
    }

    public TableView<Mp3Song> getContentTable() {
        return contentTable;
    }
}