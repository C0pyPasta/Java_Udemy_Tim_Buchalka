module com.example.javafx_application {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens sample to javafx.fxml;
    exports sample;
}