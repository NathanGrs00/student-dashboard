module com.nathan.studentdashboard {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.nathan.studentdashboard to javafx.fxml;
    exports com.nathan.studentdashboard;
    exports com.nathan.studentdashboard.controller;
    opens com.nathan.studentdashboard.controller to javafx.fxml;
}