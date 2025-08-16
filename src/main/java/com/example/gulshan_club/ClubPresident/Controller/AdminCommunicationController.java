package com.example.gulshan_club.ClubPresident.Controller;

import com.example.gulshan_club.CommonClass.LoginPageController;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AdminCommunicationController
{
    @javafx.fxml.FXML
    private TextArea messageBodyTextArea;
    @javafx.fxml.FXML
    private TextField subjectTextFeild;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club President","ClubPresidentDashboard.fxml","Club President Dashboard");
    }

    @javafx.fxml.FXML
    public void handleSendButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleClearButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLogoutButton(ActionEvent actionEvent) {
    }
}