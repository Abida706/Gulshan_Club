package com.example.gulshan_club.AccountsManager.Controller;

import com.example.gulshan_club.AccountsManager.Model.TrackExpenses;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class TrackExpensesController
{
    @javafx.fxml.FXML
    private TableView<TrackExpenses> trackExpensesTable;
    @javafx.fxml.FXML
    private TableColumn<TrackExpenses, String> expenseidTableCol;
    @javafx.fxml.FXML
    private TableColumn<TrackExpenses, String> categoryTableCol;
    @javafx.fxml.FXML
    private TableColumn<TrackExpenses, Double> amountTableCol;
    @javafx.fxml.FXML
    private TableColumn<TrackExpenses, String> approvedByTableCol;
    @javafx.fxml.FXML
    private TableColumn<TrackExpenses, String> dateTableCol;

    @javafx.fxml.FXML
    private TextField categoryTextField;
    @javafx.fxml.FXML
    private TextField amountTextField;

    @javafx.fxml.FXML
    public void initialize() {
        // Link table columns with TrackExpense properties
        expenseidTableCol.setCellValueFactory(new PropertyValueFactory<>("expenseId"));
        categoryTableCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        amountTableCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
        approvedByTableCol.setCellValueFactory(new PropertyValueFactory<>("approvedBy"));
        dateTableCol.setCellValueFactory(new PropertyValueFactory<>("date"));
    }

    @javafx.fxml.FXML
    public void handleSubmitButton(ActionEvent actionEvent) {
        String category = categoryTextField.getText();
        String amountText = amountTextField.getText();

        if (category.isEmpty() || amountText.isEmpty()) {
            showAlert("Please fill in all fields.");
            return;
        }

        try {
            double amount = Double.parseDouble(amountText);

            TrackExpenses expense = new TrackExpenses(
                    String.valueOf(System.currentTimeMillis()), // quick unique ID
                    category,
                    amount,
                    "Manager", // placeholder until linked with user
                    java.time.LocalDate.now().toString()
            );

            trackExpensesTable.getItems().add(expense);
            categoryTextField.clear();
            amountTextField.clear();
            showAlert("Expense recorded successfully!");

        } catch (NumberFormatException e) {
            showAlert("Invalid amount. Please enter a number.");
        }
    }

    @javafx.fxml.FXML
    public void handleUploadButton(ActionEvent actionEvent) {
        showAlert("Upload functionality not yet implemented.");
        // Could be extended to upload CSV/Excel expense reports
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(),"AccountsManager", "AccountsManagerDashboard.fxml", "Accounts Manager Dashboard");
    }

    private void showAlert(String message) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(message);
        a.showAndWait();
    }
}
