package com.example.gulshan_club.ClubPresident.Controller;

import com.example.gulshan_club.CommonClass.LoginPageController;
import javafx.event.ActionEvent;
import javafx.scene.Node;

public class ClubPresidentDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBudgetTrackerButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club President","BudgetTracker.fxml","Budget Tracker");
    }

    @javafx.fxml.FXML
    public void handleClubCalenderButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club President","BudgetTracker.fxml","Budget Tracker");
    }

    @javafx.fxml.FXML
    public void handlePolicyManagerButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club President","PolicyManager.fxml","Policy Manager");
    }

    @javafx.fxml.FXML
    public void handleMeetingSchedulerButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club President","MetingScheduler.fxml","Meting Scheduler");
    }

    @javafx.fxml.FXML
    public void handleFeedbackReviewButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club President","FeedbackReview.fxml","Feedback Review");
    }

    @javafx.fxml.FXML
    public void handleActivityReportsButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club President","ActivityReports.fxml","Activity Reports");
    }

    @javafx.fxml.FXML
    public void handleProposalApprovalButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club President","ProposalApproval.fxml","Proposal Approval");
    }


    @javafx.fxml.FXML
    public void handleAdminCommunicationButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club President","AdminCommunication.fxml","Admin Communication");
    }
}