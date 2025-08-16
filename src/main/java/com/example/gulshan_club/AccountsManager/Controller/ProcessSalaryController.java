package com.example.gulshan_club.AccountsManager.Controller;

import com.example.gulshan_club.AccountsManager.Model.ProcessSalary;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ProcessSalaryController
{
    @javafx.fxml.FXML
    private TableView<ProcessSalary> salaryTable;
    @javafx.fxml.FXML
    private TableColumn<ProcessSalary, String> employeeidTableCol;
    @javafx.fxml.FXML
    private TableColumn<ProcessSalary, String> nameTableCol;
    @javafx.fxml.FXML
    private TableColumn<ProcessSalary, Double> basesalaryTableCol;
    @javafx.fxml.FXML
    private TableColumn<ProcessSalary, Double> bonusesTableCol;
    @javafx.fxml.FXML
    private TableColumn<ProcessSalary, Double> deductionsTableCol;
    @javafx.fxml.FXML
    private TableColumn<ProcessSalary, Double> netSalaryTableCol;
    @javafx.fxml.FXML
    private TableColumn<ProcessSalary, String> statusTableCol;

    @javafx.fxml.FXML
    public void initialize() {
        // Bind table columns to Salary model properties
        employeeidTableCol.setCellValueFactory(new PropertyValueFactory<>("employeeId"));
        nameTableCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        basesalaryTableCol.setCellValueFactory(new PropertyValueFactory<>("baseSalary"));
        bonusesTableCol.setCellValueFactory(new PropertyValueFactory<>("bonuses"));
        deductionsTableCol.setCellValueFactory(new PropertyValueFactory<>("deductions"));
        netSalaryTableCol.setCellValueFactory(new PropertyValueFactory<>("netSalary"));
        statusTableCol.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void handleGenerateButton(ActionEvent actionEvent) {
        showAlert("Salaries generated for selected month!");
        // You could fetch salary data from DB and load into salaryTable here
    }

    @javafx.fxml.FXML
    public void handleCalculateButton(ActionEvent actionEvent) {
        showAlert("Net salary calculated!");
        // Logic: netSalary = baseSalary + bonuses - deductions
    }

    @javafx.fxml.FXML
    public void handleMonthComboBox(ActionEvent actionEvent) {
        showAlert("Month selected. Updating salary table...");
        // You could filter data by month here
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
