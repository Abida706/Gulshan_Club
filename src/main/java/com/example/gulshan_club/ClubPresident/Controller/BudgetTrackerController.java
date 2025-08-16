package com.example.gulshan_club.ClubPresident.Controller;

import com.example.gulshan_club.ClubPresident.Model.BudgetTracker;
import com.example.gulshan_club.CommonClass.LoginPageController;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class BudgetTrackerController
{
    @javafx.fxml.FXML
    private ProgressBar usageIndicatorProgressBar;
    @javafx.fxml.FXML
    private TableView<BudgetTracker> expenseReportTableView;
    @javafx.fxml.FXML
    private TableColumn<BudgetTracker,String> amountCol;
    @javafx.fxml.FXML
    private TableColumn<BudgetTracker,String > dateCol;
    @javafx.fxml.FXML
    private TableColumn<BudgetTracker,String > expenseTitleCol;
    @javafx.fxml.FXML
    private TableColumn<BudgetTracker,String > approvedByCol;
    @javafx.fxml.FXML
    private TableColumn<BudgetTracker,String > categoryCol;

    @javafx.fxml.FXML
    public void initialize() {
        amountCol.setCellValueFactory(new PropertyValueFactory<>("Amount"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("Date"));
        expenseTitleCol.setCellValueFactory(new PropertyValueFactory<>("Expense title"));
        approvedByCol.setCellValueFactory(new PropertyValueFactory<>("Approved By"));
        categoryCol.setCellValueFactory(new PropertyValueFactory<>("Category"));

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club President","ClubPresidentDashboard.fxml","Club President Dashboard");
    }

    @javafx.fxml.FXML
    public void handleAddEntryButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleExportButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLogoutButton(ActionEvent actionEvent) {
    }
}