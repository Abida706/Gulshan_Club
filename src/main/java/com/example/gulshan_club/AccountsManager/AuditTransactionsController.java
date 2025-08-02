package com.example.gulshan_club.AccountsManager;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AuditTransactionsController
{
    @javafx.fxml.FXML
    private TableColumn amountTableCol;
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private TableColumn tansactionidTableCol;
    @javafx.fxml.FXML
    private TableView auditTransactionTable;
    @javafx.fxml.FXML
    private TableColumn flaggedTableCol;
    @javafx.fxml.FXML
    private TableColumn dateTableCol;
    @javafx.fxml.FXML
    private TableColumn statusTableCol;
    @javafx.fxml.FXML
    private TableColumn typeTableCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleFlagButton(ActionEvent actionEvent) {
    }
}