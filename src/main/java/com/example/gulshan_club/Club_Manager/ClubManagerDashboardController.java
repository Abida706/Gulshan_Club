package com.example.gulshan_club.Club_Manager;

import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;

public class ClubManagerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBudgetDashBoardButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Club_Manager","budgetDashboard.fxml","Budget Dashboard");
    }

    @javafx.fxml.FXML
    public void handlePartnershipPortalButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Club_Manager","PartnershipPortal.fxml","Partnership Portal");
    }

    @javafx.fxml.FXML
    public void handleReportDashboardButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Club_Manager","ReportDashboard.fxml","Report Dashboard");
    }

    @javafx.fxml.FXML
    public void handleFacilityBookingButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Club_Manager","FacilityBooking.fxml","Facility Booking");
    }

    @javafx.fxml.FXML
    public void handleEventManagementButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Club_Manager","EventManagement.fxml","Event Management");
    }

    @javafx.fxml.FXML
    public void handleFeedbackDashboardButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Club_Manager","feedbackCenter.fxml","Feedback Dashboard");
    }

    @javafx.fxml.FXML
    public void handleCommunicationPanelButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Club_Manager","communicationPanel.fxml","Communication Panel");
    }

    @javafx.fxml.FXML
    public void handleMemberManagementButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Club_Manager","MemberManagement.fxml","Member Management");
    }

    @javafx.fxml.FXML
    public void handleLogoutButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Login", "LoginPage.fxml", "Login");
    }

}