package com.example.gulshan_club.ClubPresident.Controller;

import com.example.gulshan_club.CommonClass.LoginPageController;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MeetingSchedulerController
{
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private AnchorPane dateDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> timeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
      timeComboBox.getItems().addAll("Time");
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club President","ClubPresidentDashboard.fxml","Club President Dashboard");
    }

    @javafx.fxml.FXML
    public void handleCancelButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLogoutButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleScheduleButton(ActionEvent actionEvent) {
    }
}