package com.nathan.studentdashboard.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.net.URL;
import java.util.ResourceBundle;

public class GradesController implements Initializable {
    @FXML
    private VBox root;

    @FXML
    private Label gpaLabel;

    @FXML
    private Label recentGradeLabel;

    @FXML
    private TableView<Grade> gradesTable;

    @FXML
    private TableColumn<Grade, String> subjectColumn;

    @FXML
    private TableColumn<Grade, String> gradeColumn;

    @FXML
    private TableColumn<Grade, String> dateColumn;

    private final ObservableList<Grade> grades = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Load CSS
        var cssResource = getClass().getResource("/com/nathan/studentdashboard/css/grades.css");
        if (cssResource != null) {
            root.getStylesheets().add(cssResource.toExternalForm());
        }

        // Set up table columns
        subjectColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().subject()));
        gradeColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().grade()));
        dateColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().date()));

        // Example data
        grades.addAll(
                new Grade("Math", "A", "2024-06-01"),
                new Grade("Physics", "B+", "2024-05-20"),
                new Grade("Chemistry", "A-", "2024-05-10")
        );
        gradesTable.setItems(grades);

        // Set GPA and recent grade (example logic)
        gpaLabel.setText("3.8");
        recentGradeLabel.setText(grades.isEmpty() ? "-" : grades.get(0).grade());
    }

    public record Grade(String subject, String grade, String date) {}
}