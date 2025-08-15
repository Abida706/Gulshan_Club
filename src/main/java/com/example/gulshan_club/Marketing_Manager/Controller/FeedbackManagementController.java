package com.example.gulshan_club.Marketing_Manager.Controller;

import com.example.gulshan_club.Marketing_Manager.Model.FeedbackManagement;

import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FeedbackManagementController
{
    @javafx.fxml.FXML
    private TextField targetGroupField;
    @javafx.fxml.FXML
    private TableColumn<FeedbackManagement,String> responseCol;
    @javafx.fxml.FXML
    private TextField surveyTitleField;
    @javafx.fxml.FXML
    private TextArea questionTextArea;
    @javafx.fxml.FXML
    private TableColumn<FeedbackManagement,String> questionCol;
    @javafx.fxml.FXML
    private TableColumn<FeedbackManagement,String> submittedOnCol;
    @javafx.fxml.FXML
    private TableView<FeedbackManagement> feedbackTableView;
    @javafx.fxml.FXML
    private TableColumn<FeedbackManagement,String> memberIdCol;

    @javafx.fxml.FXML
    public void initialize() {
        memberIdCol.setCellValueFactory(new PropertyValueFactory<>("memberId"));
        questionCol.setCellValueFactory(new PropertyValueFactory<>("question"));
        responseCol.setCellValueFactory(new PropertyValueFactory<>("response"));
        submittedOnCol.setCellValueFactory(new PropertyValueFactory<>("submittedOn"));
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Marketing_Manager","Marketing_Manager_Dashboard.fxml","Marketing Manager Dashboard");

    }

    @javafx.fxml.FXML
    public void handleAnalyzeFeedbackButton(ActionEvent actionEvent) {
        if (surveyTitleField.getText().trim().isEmpty() || targetGroupField.getText().trim().isEmpty() || questionTextArea.getText().trim().isEmpty()) {
            showAlert("Validation Error","Please fill in all fields before sending the survey");
            return;
        }
    }

    private void showAlert(String error, String message) {
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setContentText(error);
        a.showAndWait();

    }


    @javafx.fxml.FXML
    public void handleSendSurveyButton(ActionEvent actionEvent) {
    }
}