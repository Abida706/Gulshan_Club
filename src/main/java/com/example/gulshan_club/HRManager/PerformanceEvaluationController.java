package com.example.gulshan_club.HRManager;

import javafx.event.ActionEvent;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PerformanceEvaluationController
{
    @javafx.fxml.FXML
    private TextField employeeTextField;
    @javafx.fxml.FXML
    private Slider punctualitySlider;
    @javafx.fxml.FXML
    private Slider teamworkSlider;
    @javafx.fxml.FXML
    private Slider productivitySlider;
    @javafx.fxml.FXML
    private TextArea additionalCommentsTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleSubmitButton(ActionEvent actionEvent) {
    }
}