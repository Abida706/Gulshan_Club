package com.example.gulshan_club.ClubMember.Controller;

import com.example.gulshan_club.CommonClass.LoginPageController;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

public class VotingPanelController
{
    @javafx.fxml.FXML
    private VBox optionContainerVBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club Member","ClubMemberDashboard.fxml","Club Member Dashboard");
    }

    @javafx.fxml.FXML
    public void handeCRadioButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBRadioButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleARadioButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLogoutButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleVoteButton(ActionEvent actionEvent) {
    }
}