package com.example.gulshan_club.AccountsManager;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class BudgetManagementController
{
    @javafx.fxml.FXML
    private TableColumn remainingTableCol;
    @javafx.fxml.FXML
    private TableColumn categoryTableCol;
    @javafx.fxml.FXML
    private TableColumn actualSpentTableCol;
    @javafx.fxml.FXML
    private TextField limitTextField;
    @javafx.fxml.FXML
    private TextField categoryTextField;
    @javafx.fxml.FXML
    private TableColumn overspentTableCol;
    @javafx.fxml.FXML
    private TableView budgetTable;
    @javafx.fxml.FXML
    private TableColumn budgetTableCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleUpdateButton(ActionEvent actionEvent) {
    }
}