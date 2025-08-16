package com.example.gulshan_club.Event_Coordinator;

import com.example.gulshan_club.CommonClass.Switcher;
import com.example.gulshan_club.Event_Coordinator_Modelclass.GuestInvitation;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class GuestInvitationController
{
    @javafx.fxml.FXML
    private TextField guestEmailComboBox;
    @javafx.fxml.FXML
    private ListView<String> invitedGuestTextView;
    @javafx.fxml.FXML
    private TextField guestNameComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        invitedGuestTextView.getItems().addAll("Guest 1", "Guest 2", "Guest 3");
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Event_coordinator","Event_Coordinator_Dashboard.fxml","Event Coordinator Dashboard");
    }

    @javafx.fxml.FXML
    public void handleSendInvitationButton(ActionEvent actionEvent) {
    }


}