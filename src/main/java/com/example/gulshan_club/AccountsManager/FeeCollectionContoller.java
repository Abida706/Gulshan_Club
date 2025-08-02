package com.example.gulshan_club.AccountsManager;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FeeCollectionContoller
{
    @javafx.fxml.FXML
    private TableColumn memberidTableCol;
    @javafx.fxml.FXML
    private TableColumn nameTableCol;
    @javafx.fxml.FXML
    private TableColumn amountDueTableCol;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private TableColumn monthTableCol;
    @javafx.fxml.FXML
    private TextField memberTextField;
    @javafx.fxml.FXML
    private ComboBox paymentMethodComboBox;
    @javafx.fxml.FXML
    private TableColumn statusTableCol;
    @javafx.fxml.FXML
    private TableView feeCollectionTable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleSubmitButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handlePaymentMethodComboBox(ActionEvent actionEvent) {
    }
}