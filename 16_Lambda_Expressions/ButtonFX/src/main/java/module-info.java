module com.example.buttonfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.buttonfx to javafx.fxml;
    exports com.example.buttonfx;
}