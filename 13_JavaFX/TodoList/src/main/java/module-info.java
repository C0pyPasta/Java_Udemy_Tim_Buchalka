module com.example.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rudi.todolist to javafx.fxml;
    exports com.rudi.todolist;
}