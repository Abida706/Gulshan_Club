package com.example.gulshan_club.HRManager;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AttendanceReportController
{
    @javafx.fxml.FXML
    private TableColumn nameTableCol;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private TableColumn totalWorkingTableCol;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private TableColumn daysPresentTableCol;
    @javafx.fxml.FXML
    private TableColumn deptTableCol;
    @javafx.fxml.FXML
    private TableColumn daysAbsentTableCol;
    @javafx.fxml.FXML
    private TableView attendanceReportTable;
    @javafx.fxml.FXML
    private TableColumn daysLateTableCol;
    @javafx.fxml.FXML
    private ComboBox deptComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleGenerateButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleExportButton(ActionEvent actionEvent) {
    }
}