package com.nathan.studentdashboard;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private BorderPane rootPane;

    @FXML
    private VBox leftPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rootPane.widthProperty().addListener((_, _, newVal) -> {
            double newWidth = newVal.doubleValue();
            leftPane.setPrefWidth(newWidth / 6);
        });
    }
}