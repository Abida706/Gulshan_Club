package com.example.gulshan_club.AccountsManager.Controller;

import com.example.gulshan_club.AccountsManager.Model.BudgetManagement;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class BudgetManagementController
{
    @javafx.fxml.FXML
    private TableColumn<BudgetManagement, String> remainingTableCol;
    @javafx.fxml.FXML
    private TableColumn<BudgetManagement, String> categoryTableCol;
    @javafx.fxml.FXML
    private TableColumn<BudgetManagement, String> actualSpentTableCol;
    @javafx.fxml.FXML
    private TextField limitTextField;
    @javafx.fxml.FXML
    private TextField categoryTextField;
    @javafx.fxml.FXML
    private TableColumn<BudgetManagement, String> overspentTableCol;
    @javafx.fxml.FXML
    private TableView<BudgetManagement> budgetTable;
    @javafx.fxml.FXML
    private TableColumn<BudgetManagement, String> budgetTableCol;

    @javafx.fxml.FXML
    public void initialize() {
        budgetTableCol.setCellValueFactory(new PropertyValueFactory<>("budget"));
        categoryTableCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        overspentTableCol.setCellValueFactory(new PropertyValueFactory<>("overspent"));
        remainingTableCol.setCellValueFactory(new PropertyValueFactory<>("remaining"));
        actualSpentTableCol.setCellValueFactory(new PropertyValueFactory<>("actualSpent"));
    }

    @javafx.fxml.FXML
    public void handleUpdateButton(ActionEvent actionEvent) {
        if (categoryTextField.getText().isEmpty()) {
            showAlert("Please enter a category!");
            return;
        }
        if (limitTextField.getText().isEmpty()) {
            showAlert("Please enter a budget limit!");
            return;
        }

        BudgetManagement budgetManagement = new BudgetManagement(
                categoryTextField.getText(),
                limitTextField.getText()
        );

        categoryTextField.clear();
        limitTextField.clear();

        budgetTable.getItems().add(budgetManagement);
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "AccountsManager", "AccountsManagerDashboard.fxml", "Accounts Manager Dashboard");
    }

    private void showAlert(String message) {
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setContentText(message);
        a.showAndWait();
    }
}
