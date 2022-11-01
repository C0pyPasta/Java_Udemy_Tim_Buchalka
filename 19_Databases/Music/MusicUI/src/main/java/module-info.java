module com.example.musicui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;

    opens com.example.musicui to javafx.fxml;
    exports com.example.musicui;
}