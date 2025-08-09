package com.nathan.studentdashboard.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ScheduleController implements Initializable {
    @FXML
    private GridPane agendaGrid;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        var cssResource = getClass().getResource("/com/nathan/studentdashboard/css/schedule.css");
        if (cssResource != null) {
            agendaGrid.getStylesheets().add(cssResource.toExternalForm());
        }
    }
}