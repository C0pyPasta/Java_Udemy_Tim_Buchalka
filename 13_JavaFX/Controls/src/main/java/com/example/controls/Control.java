package com.example.controls;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Control {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Model!");
    }
}