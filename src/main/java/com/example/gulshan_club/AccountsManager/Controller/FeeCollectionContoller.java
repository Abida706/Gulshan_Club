package com.example.gulshan_club.AccountsManager.Controller;

import com.example.gulshan_club.AccountsManager.Model.FeeCollection;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class FeeCollectionContoller
{
    @javafx.fxml.FXML
    private TableColumn<FeeCollection, String> memberidTableCol;
    @javafx.fxml.FXML
    private TableColumn<FeeCollection, String> nameTableCol;
    @javafx.fxml.FXML
    private TableColumn<FeeCollection, String> amountDueTableCol;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private TableColumn<FeeCollection, String> monthTableCol;
    @javafx.fxml.FXML
    private TextField memberTextField;
    @javafx.fxml.FXML
    private ComboBox<String> paymentMethodComboBox;
    @javafx.fxml.FXML
    private TableColumn<FeeCollection, String> statusTableCol;
    @javafx.fxml.FXML
    private TableView<FeeCollection> feeCollectionTable;

    @javafx.fxml.FXML
    public void initialize() {
        memberidTableCol.setCellValueFactory(new PropertyValueFactory<>("memberId"));
        nameTableCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        amountDueTableCol.setCellValueFactory(new PropertyValueFactory<>("amountDue"));
        monthTableCol.setCellValueFactory(new PropertyValueFactory<>("month"));
        statusTableCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        paymentMethodComboBox.getItems().addAll("Cash", "Credit Card", "Bank Transfer");
    }

    @javafx.fxml.FXML
    public void handleSubmitButton(ActionEvent actionEvent) {
        if (memberTextField.getText().isEmpty()) {
            showAlert("Please enter member ID!");
            return;
        }
        if (amountTextField.getText().isEmpty()) {
            showAlert("Please enter amount!");
            return;
        }
        if (paymentMethodComboBox.getValue() == null) {
            showAlert("Please select a payment method!");
            return;
        }

        FeeCollection fee = new FeeCollection(
                memberTextField.getText(),
                amountTextField.getText(),
                paymentMethodComboBox.getValue()
        );

        memberTextField.clear();
        amountTextField.clear();
        paymentMethodComboBox.setValue(null);

        feeCollectionTable.getItems().add(fee);
    }


    @javafx.fxml.FXML
    public void handlePaymentMethodComboBox(ActionEvent actionEvent) {
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