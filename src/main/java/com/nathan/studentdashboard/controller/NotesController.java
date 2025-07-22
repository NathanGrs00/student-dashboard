package com.nathan.studentdashboard.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class NotesController implements Initializable {
    @FXML
    private VBox root;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        var cssResource = getClass().getResource("/com/nathan/studentdashboard/css/notes.css");
        if (cssResource != null) {
            root.getStylesheets().add(cssResource.toExternalForm());
        }
    }
}