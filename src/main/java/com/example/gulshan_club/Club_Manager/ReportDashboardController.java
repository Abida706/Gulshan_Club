package com.example.gulshan_club.Club_Manager;

import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

public class ReportDashboardController
{
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> reportTypeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        reportTypeComboBox.getItems().addAll("Member Report", "Event Report", "Financial report");
    }

    @javafx.fxml.FXML
    public void handleExportReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleReportContentButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGenerateReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Club_Manager","Club_Manager_Dashboard.fxml","Club Manager Dashboard");
    }
}