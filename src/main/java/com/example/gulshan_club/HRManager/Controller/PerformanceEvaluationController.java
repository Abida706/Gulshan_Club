package com.example.gulshan_club.HRManager.Controller;

import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import com.example.gulshan_club.HRManager.Controller.PerformanceEvaluationController;
import com.example.gulshan_club.HRManager.Model.LeaveManagement;
import javafx.scene.Node;
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

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "HRManager", "HRManagerDashboard.fxml", "HR Manager Dashboard");

    }

}