package com.example.gulshan_club.Club_Manager;

import com.example.gulshan_club.Club_manager_Modelclass.BudgetDashboard;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class BudgetDashboardController
{
    @javafx.fxml.FXML
    private TableColumn<BudgetDashboard,String> amountTableCol;
    @javafx.fxml.FXML
    private TableColumn<BudgetDashboard, String> expenseNameTableCol;
    @javafx.fxml.FXML
    private TableView<BudgetDashboard> expenselistTableView;
    @javafx.fxml.FXML
    private TableColumn<BudgetDashboard, String> statusTableCol;

    @javafx.fxml.FXML
    public void initialize() {
        expenseNameTableCol.setCellValueFactory(new PropertyValueFactory<>("expenseName"));
        amountTableCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
        statusTableCol.setCellValueFactory(new PropertyValueFactory<>("status"));

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Club_Manager","Club_Manager_Dashboard.fxml","Club Manager Dashboard");
    }

    @javafx.fxml.FXML
    public void handleApproveExpenseButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleRejectExpenseButton(ActionEvent actionEvent) {
    }

}