package com.example.gulshan_club.AccountsManager;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class FinancialReportsController
{
    @javafx.fxml.FXML
    private TableView incomeReportTable;
    @javafx.fxml.FXML
    private TableView expenseReportTable;
    @javafx.fxml.FXML
    private TableColumn amountTableCol;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private TableColumn descriptionTableCol;
    @javafx.fxml.FXML
    private TableColumn sourceTableCol;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private TableColumn categoryTableCol;
    @javafx.fxml.FXML
    private TableColumn amountTableCol2;
    @javafx.fxml.FXML
    private TableColumn dateTableCol;
    @javafx.fxml.FXML
    private TableColumn dateTableCol2;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleGenerateButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleReportTypeComboBox(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleExportButton(ActionEvent actionEvent) {
    }
}