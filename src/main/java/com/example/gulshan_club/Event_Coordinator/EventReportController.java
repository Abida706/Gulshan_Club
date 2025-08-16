package com.example.gulshan_club.Event_Coordinator;

import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class EventReportController
{
    @javafx.fxml.FXML
    private TextArea generateReportTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> selectEventComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        selectEventComboBox.getItems().addAll("Event A", "Event B", "Event C");
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Event_coordinator","Event_Coordinator_Dashboard.fxml","Event Coordinator Dashboard");
    }

    @javafx.fxml.FXML
    public void handleExportReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGenerateReportButton(ActionEvent actionEvent) {
    }
}