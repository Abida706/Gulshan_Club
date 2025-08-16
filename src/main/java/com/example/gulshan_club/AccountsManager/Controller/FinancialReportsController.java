package com.example.gulshan_club.AccountsManager.Controller;

import com.example.gulshan_club.AccountsManager.Model.FinancialReports;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FinancialReportsController
{
    @javafx.fxml.FXML
    private TableView<FinancialReports> incomeReportTable;
    @javafx.fxml.FXML
    private TableView<FinancialReports> expenseReportTable;
    @javafx.fxml.FXML
    private TableColumn<FinancialReports, String> amountTableCol;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private TableColumn<FinancialReports, String> descriptionTableCol;
    @javafx.fxml.FXML
    private TableColumn<FinancialReports, String> sourceTableCol;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private TableColumn<FinancialReports, String> categoryTableCol;
    @javafx.fxml.FXML
    private TableColumn<FinancialReports, String> amountTableCol2;
    @javafx.fxml.FXML
    private TableColumn<FinancialReports, String> dateTableCol;
    @javafx.fxml.FXML
    private TableColumn<FinancialReports, String> dateTableCol2;

    @javafx.fxml.FXML
    public void initialize() {

        sourceTableCol.setCellValueFactory(new PropertyValueFactory<>("source"));
        descriptionTableCol.setCellValueFactory(new PropertyValueFactory<>("description"));
        amountTableCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
        dateTableCol.setCellValueFactory(new PropertyValueFactory<>("date"));

        categoryTableCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        amountTableCol2.setCellValueFactory(new PropertyValueFactory<>("amount"));
        dateTableCol2.setCellValueFactory(new PropertyValueFactory<>("date"));
    }

    @javafx.fxml.FXML
    public void handleGenerateButton(ActionEvent actionEvent) {
        if (fromDatePicker.getValue() == null || toDatePicker.getValue() == null) {
            showAlert("Please select both From and To dates!");
            return;
        }

        incomeReportTable.getItems().clear();
        expenseReportTable.getItems().clear();

        showAlert("Financial report generated between " +
                fromDatePicker.getValue() + " and " + toDatePicker.getValue());
    }

    @javafx.fxml.FXML
    public void handleReportTypeComboBox(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void handleExportButton(ActionEvent actionEvent) {
        showAlert("Report exported successfully!");
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "AccountsManager", "AccountsManagerDashboard.fxml", "Accounts Manager Dashboard");
    }

    private void showAlert(String message) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(message);
        a.showAndWait();
    }
}
