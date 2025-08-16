package com.example.gulshan_club.AccountsManager.Controller;

import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class AuditTransactionsController
{
    @javafx.fxml.FXML
    private TableColumn<AuditTransactionsController, String> amountTableCol;
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private TableView<AuditTransactionsController> auditTransactionTable;
    @javafx.fxml.FXML
    private TableColumn<AuditTransactionsController, String> flaggedTableCol;
    @javafx.fxml.FXML
    private TableColumn<AuditTransactionsController, String> dateTableCol;
    @javafx.fxml.FXML
    private TableColumn<AuditTransactionsController, String> statusTableCol;
    @javafx.fxml.FXML
    private TableColumn<AuditTransactionsController, String> typeTableCol;
    @javafx.fxml.FXML
    private TableColumn<AuditTransactionsController, String> transactionidTableCol;

    @javafx.fxml.FXML
    public void initialize() {
        amountTableCol.setCellValueFactory(new PropertyValueFactory<>("Amount"));
        transactionidTableCol.setCellValueFactory(new PropertyValueFactory<>("Transaction ID"));
        typeTableCol.setCellValueFactory(new PropertyValueFactory<>("Type"));
        statusTableCol.setCellValueFactory(new PropertyValueFactory<>("Status"));
        dateTableCol.setCellValueFactory(new PropertyValueFactory<>("Date"));
        flaggedTableCol.setCellValueFactory(new PropertyValueFactory<>("Flagged?"));

    }

    @javafx.fxml.FXML
    public void handleFlagButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "AccountsManager", "AccountsManagerDashboard.fxml", "Accounts Manager Dashboard");

    }

}