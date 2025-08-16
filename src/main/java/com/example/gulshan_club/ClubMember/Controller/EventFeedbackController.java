package com.example.gulshan_club.ClubMember.Controller;

import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class EventFeedbackController
{
    @FXML
    private ComboBox<String> ratingComboBox;
    @FXML
    private TextArea feedbackTextTextArea;

    @FXML
    public void initialize() {
        ratingComboBox.getItems().addAll("1 star", "2 star", "3 star");
    }

    @FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Club Member","ClubMemberDashboard.fxml","Club Member Dashboard");
    }


    @FXML
    public void handleSubmitButton(ActionEvent actionEvent) {
    }
}