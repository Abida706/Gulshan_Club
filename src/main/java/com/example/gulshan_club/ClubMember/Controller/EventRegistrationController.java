package com.example.gulshan_club.ClubMember.Controller;

import com.example.gulshan_club.CommonClass.LoginPageController;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;

public class EventRegistrationController
{
    @javafx.fxml.FXML
    private AnchorPane selectEventComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> selectEventComnboBox;

    @javafx.fxml.FXML
    public void initialize() {
        selectEventComnboBox.getItems().addAll("Select Event");
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club Member","ClubMemberDashboard.fxml","Club Member Dashboard");
    }

    @javafx.fxml.FXML
    public void handleCancelButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleRegisterButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLogoutButton(ActionEvent actionEvent) {
    }
}