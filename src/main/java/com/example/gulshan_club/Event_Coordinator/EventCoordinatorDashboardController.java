package com.example.gulshan_club.Event_Coordinator;

import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;

public class EventCoordinatorDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handlePromotionalManagementButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Event_Coordinator", "promotionManagement.fxml", "Promotion Management");
    }

    @javafx.fxml.FXML
    public void handleGuestInvitationButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Event_Coordinator", "GuestInvitation.fxml", "Guest Invitation");
    }

    @javafx.fxml.FXML
    public void handleVolunteerManagementButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Event_Coordinator", "VolunteerManagement.fxml", "Volunteer Management");
    }

    @javafx.fxml.FXML
    public void handleEventFeedbackAnalysisButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Event_Coordinator", "EventFeedbackAnalysis.fxml", "Event Feedback Analysis");
    }

    @javafx.fxml.FXML
    public void handleEventReportButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Event_Coordinator", "EventReport.fxml", "Event Report");
    }

    @javafx.fxml.FXML
    public void handleLogisticsManagementButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Event_Coordinator", "LogisticsManagement.fxml", "Logistics Management");
    }

    @javafx.fxml.FXML
    public void handleLogoutButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Event_Coordinator", "LoginPage.fxml", "Login");
    }

    @javafx.fxml.FXML
    public void handleCreateEventButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Event_Coordinator", "CreateEvent.fxml", "Create Event");
    }

    @javafx.fxml.FXML
    public void handleRegistrationPanelButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Event_Coordinator", "RegistrationPanel.fxml", "Registration Panel");
    }

}