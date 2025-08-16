package com.example.gulshan_club.AccountsManager.Controller;

import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;

public class AccountsManagerDashboardController
{

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void handleBudgetManagementButton(ActionEvent actionEvent) {
        Switcher.switcher((Node)actionEvent.getSource(),"AccountsManager" ,"BudgetManagement.fxml", "Budget Promotion");

    }

    @javafx.fxml.FXML
    public void handleProcessSalaryButton(ActionEvent actionEvent) {
        Switcher.switcher((Node)actionEvent.getSource(),"AccountsManager" ,"ProcessSalary.fxml", "Process Salary");

    }

    @javafx.fxml.FXML
    public void handleFeeCollectionButton(ActionEvent actionEvent) {
        Switcher.switcher((Node)actionEvent.getSource(),"AccountsManager" ,"feeCollection.fxml", "Fee Collection");

    }

    @javafx.fxml.FXML
    public void handleFinancialReportsButton(ActionEvent actionEvent){
        Switcher.switcher((Node)actionEvent.getSource(),"AccountsManager" ,"FinancialReports.fxml", "Financial Reports");

    }

    @javafx.fxml.FXML
    public void handleTrackExpensesButton(ActionEvent actionEvent){
        Switcher.switcher((Node)actionEvent.getSource(),"AccountsManager" ,"TrackExpenses.fxml", "Track Expenses");

    }

    @javafx.fxml.FXML
    public void handleAuditTransactionsButton(ActionEvent actionEvent) {
        Switcher.switcher((Node)actionEvent.getSource(),"AccountsManager" ,"AuditTransactions.fxml", "Audit Transactions");

    }

    @javafx.fxml.FXML
    public void handleVendorPaymentsButton(ActionEvent actionEvent) {
        Switcher.switcher((Node)actionEvent.getSource(),"AccountsManager" ,"VendorPayments.fxml", "Vendor Payments");

    }

}



