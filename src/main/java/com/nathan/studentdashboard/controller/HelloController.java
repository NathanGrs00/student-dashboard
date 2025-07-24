package com.nathan.studentdashboard.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private BorderPane rootPane;

    @FXML
    private VBox leftPane;

    @FXML
    private StackPane centerPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rootPane.widthProperty().addListener((_, _, newVal) -> {
            double newWidth = newVal.doubleValue();
            leftPane.setPrefWidth(newWidth / 6);
            leftPane.getChildren().stream()
                    .filter(node -> node instanceof Button)
                    .forEach(node -> ((Button) node).setPrefWidth(leftPane.getPrefWidth() * 0.9));
        });

        for (Node node : leftPane.getChildren()) {
            if (node instanceof Button button) {
                button.setOnAction(e -> switchCenterContent(button.getText()));
            }
        }
    }

    private void switchCenterContent(String buttonText) {
        Node content = switch (buttonText) {
            case "Home" -> loadFXML("home.fxml");
            case "Deadlines" -> loadFXML("deadlines.fxml");
            case "Notes" -> loadFXML("notes.fxml");
            case "Grades" -> loadFXML("grades.fxml");
            case "Schedule" -> loadFXML("schedule.fxml");
            default -> new Label("Not implemented");
        };
        centerPane.getChildren().setAll(content);
    }

    private Node loadFXML(String fxmlName) {
        try {
            var resource = getClass().getResource("/com/nathan/studentdashboard/fxml/" + fxmlName);
            if (resource == null) {
                return new Label("FXML file not found: " + fxmlName);
            }
            return FXMLLoader.load(resource);
        } catch (IOException | RuntimeException e) {
            return new Label("Error loading " + fxmlName + ": " + e.getMessage());
        }
    }
}