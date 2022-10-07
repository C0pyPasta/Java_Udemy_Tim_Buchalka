module com.example.events {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.events to javafx.fxml;
    exports com.example.events;
}