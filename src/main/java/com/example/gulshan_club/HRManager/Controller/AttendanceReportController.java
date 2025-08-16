package com.example.gulshan_club.HRManager.Controller;

import com.example.gulshan_club.CommonClass.Switcher;
import com.example.gulshan_club.HRManager.Model.AttendanceReport;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class AttendanceReportController
{
    @javafx.fxml.FXML
    private TableColumn<AttendanceReport, String> nameTableCol;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private TableColumn<AttendanceReport, String> totalWorkingTableCol;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private TableColumn<AttendanceReport, String> daysPresentTableCol;
    @javafx.fxml.FXML
    private TableColumn<AttendanceReport, String> deptTableCol;
    @javafx.fxml.FXML
    private TableColumn<AttendanceReport, String> daysAbsentTableCol;
    @javafx.fxml.FXML
    private TableView<AttendanceReport> attendanceReportTable;
    @javafx.fxml.FXML
    private TableColumn<AttendanceReport, String> daysLateTableCol;
    @javafx.fxml.FXML
    private ComboBox<String> deptComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        nameTableCol.setCellValueFactory(new PropertyValueFactory<>("Name"));
        totalWorkingTableCol.setCellValueFactory(new PropertyValueFactory<>("Total Working"));
        daysPresentTableCol.setCellValueFactory(new PropertyValueFactory<>("Days Present"));
        deptTableCol.setCellValueFactory(new PropertyValueFactory<>("Department"));
        daysLateTableCol.setCellValueFactory(new PropertyValueFactory<>("Days late"));
        daysAbsentTableCol.setCellValueFactory(new PropertyValueFactory<>("Days Absent"));
        deptComboBox.getItems().addAll("HR", "Accounts", "Marketing", "Maintenance");
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "HRManager", "HRManagerDashboard.fxml", "HR Manager Dashboard");
    }


    @javafx.fxml.FXML
    public void handleGenerateButton(ActionEvent actionEvent) {
        if (fromDatePicker.getValue() == null || toDatePicker.getValue() == null) {
            showAlert("Please select From and To dates.");
            return;
        }
        attendanceReportTable.getItems().add(new AttendanceReport("Sammy","HR",1,28,1,30));
    }

    @javafx.fxml.FXML
    public void handleExportButton(ActionEvent actionEvent) {
        showAlert("Export function not implemented.");
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setContentText(message);
        alert.showAndWait();

    }

}