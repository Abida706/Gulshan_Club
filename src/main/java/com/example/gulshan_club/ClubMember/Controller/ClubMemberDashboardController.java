package com.example.gulshan_club.ClubMember.Controller;

import com.example.gulshan_club.CommonClass.LoginPageController;
import javafx.event.ActionEvent;
import javafx.scene.Node;

public class ClubMemberDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleClubDocumentsButton(ActionEvent actionEvent) {
       LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club Member","ClubDocuments.fxml","Club Documents");
    }

    @javafx.fxml.FXML
    public void handleMemberMessagingButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club Member","MemberMessaging.fxml","Member Messaging");
    }

    @javafx.fxml.FXML
    public void handleEventFeedback(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club Member","EventFeedback.fxml","Event Feedback");
    }

    @javafx.fxml.FXML
    public void handleClubNewsButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club Member","ClubNews.fxml","Club News");
    }

    @javafx.fxml.FXML
    public void handleSuggestionBoxButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club Member","SuggestionBox.fxml","Suggestion Box");
    }

    @javafx.fxml.FXML
    public void handleEventRegistrationButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club Member","EventRegistration.fxml","Event Registration");
    }

    @javafx.fxml.FXML
    public void handleEventCalenderButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club Member","EventCalender.fxml","Event Calender");
    }

    @javafx.fxml.FXML
    public void handleVotingPanelButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club Member","VotingPanel.fxml","Voting Panel");
    }
}