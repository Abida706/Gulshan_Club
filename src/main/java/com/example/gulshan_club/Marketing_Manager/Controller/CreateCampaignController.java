package com.example.gulshan_club.Marketing_Manager.Controller;

import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class CreateCampaignController
{
    @javafx.fxml.FXML
    private TextField budgetTextField;
    @javafx.fxml.FXML
    private TextField audienceTextField;
    @javafx.fxml.FXML
    private TextField campaignNameTitleField;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private DatePicker endDatepicker;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent){
        Switcher.switcher((Node) actionEvent.getSource(), "Marketing_Manager", "Marketing_Manager_Dashboard.fxml", "Marketing Manager Dashboard");

    }

    @javafx.fxml.FXML
    public void handleSubmitButton(ActionEvent actionEvent) {

        if (campaignNameTitleField.getText() == null || campaignNameTitleField.getText().isEmpty()) {
            showAlert("Campaign name cannot be empty.");
            return;
        }

        if (budgetTextField.getText() == null || !budgetTextField.getText().isEmpty()) {
            showAlert("Budget must be a valid positive number.");
            return;
        }
        if (audienceTextField.getText() == null || audienceTextField.getText().isBlank()) {
            showAlert("Target audience cannot be empty.");
            return;
        }

        if (startDatePicker.getValue() == null || endDatepicker.getValue() == null) {
            showAlert("Start and end dates must be selected.");
            return;
        }

        if (endDatepicker.getValue().isBefore(startDatePicker.getValue())) {
            showAlert("End date cannot be before start date.");
            return;
        }
    }

    private void showAlert(String message) {
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setContentText(message);
        a.showAndWait();
    }

    @Deprecated
    public void handleFileUploadButton(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Upload Campaign File");

        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Image Files", "PDF Files"));

    }

    @javafx.fxml.FXML
    public void handlefileUploadButton(ActionEvent actionEvent) {
    }
}