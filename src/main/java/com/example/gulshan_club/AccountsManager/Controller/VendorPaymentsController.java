package com.example.gulshan_club.AccountsManager.Controller;

import com.example.gulshan_club.AccountsManager.Model.VendorPayments;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class VendorPaymentsController
{
    @javafx.fxml.FXML
    private TableView<VendorPayments> vendorPaymentTable;
    @javafx.fxml.FXML
    private TableColumn<VendorPayments, String> amountTableCol;
    @javafx.fxml.FXML
    private TextField vendorTextField;
    @javafx.fxml.FXML
    private TableColumn<VendorPayments, String> vendorNameTableCol;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private TableColumn<VendorPayments, String> dueDateTableCol;
    @javafx.fxml.FXML
    private TableColumn<VendorPayments, String> invoiceidTableCol;
    @javafx.fxml.FXML
    private TableColumn<VendorPayments, String> statusTableCol;

    @javafx.fxml.FXML
    public void initialize() {
        invoiceidTableCol.setCellValueFactory(new PropertyValueFactory<>("invoiceId"));
        vendorNameTableCol.setCellValueFactory(new PropertyValueFactory<>("vendorName"));
        amountTableCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
        dueDateTableCol.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        statusTableCol.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void handlePayButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleConfirmButton(ActionEvent actionEvent) {
    }

}