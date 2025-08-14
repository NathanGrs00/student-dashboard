package com.nathan.studentdashboard.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class DeadlinesController implements Initializable {
    @FXML
    private Label deadlineTitleLabel;
    @FXML
    private Label deadlineDateLabel;
    @FXML
    private Label deadlineDetailsLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Example: Set default values or load deadline data here
        deadlineTitleLabel.setText("No deadlines");
        deadlineDateLabel.setText("-");
        deadlineDetailsLabel.setText("-");
    }
}