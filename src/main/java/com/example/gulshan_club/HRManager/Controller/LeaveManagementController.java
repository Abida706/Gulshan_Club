package com.example.gulshan_club.HRManager.Controller;

import com.example.gulshan_club.CommonClass.Switcher;
import com.example.gulshan_club.HRManager.Controller.LeaveManagementController;
import com.example.gulshan_club.HRManager.Model.LeaveManagement;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class LeaveManagementController
{
    @javafx.fxml.FXML
    private TableColumn<LeaveManagement, String> nameTableCol;
    @javafx.fxml.FXML
    private TableView<LeaveManagement> leaveManagementTable;
    @javafx.fxml.FXML
    private TableColumn<LeaveManagement, String> toDateTableCol;
    @javafx.fxml.FXML
    private TableColumn<LeaveManagement, String> reasonTableCol;
    @javafx.fxml.FXML
    private TableColumn<LeaveManagement, String> fromDateTableCol;
    @javafx.fxml.FXML
    private TableColumn<LeaveManagement, String> statusTableCol;
    @javafx.fxml.FXML
    private TableColumn<LeaveManagement, String> leaveTypeTableCol;

    @javafx.fxml.FXML
    public void initialize() {
        nameTableCol.setCellValueFactory(new PropertyValueFactory<>("Name"));
        leaveTypeTableCol.setCellValueFactory(new PropertyValueFactory<>("Leave Type"));
        reasonTableCol.setCellValueFactory(new PropertyValueFactory<>("Reason"));
        toDateTableCol.setCellValueFactory(new PropertyValueFactory<>("To Date"));
        fromDateTableCol.setCellValueFactory(new PropertyValueFactory<>("From Date"));
        statusTableCol.setCellValueFactory(new PropertyValueFactory<>("Status"));
    }

    @javafx.fxml.FXML
    public void handleRejectButton(ActionEvent actionEvent) {
        LeaveManagement selected = leaveManagementTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("Rejected");
            leaveManagementTable.refresh();
        } else {
            showAlert("Please select a leave request to reject.");
        }

    }
    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void handleApproveButton(ActionEvent actionEvent) {
        LeaveManagement selected = leaveManagementTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("Approved");
            leaveManagementTable.refresh();
        } else {
            showAlert("Please select a leave request to approve.");
        }
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "HRManager", "HRManagerDashboard.fxml", "HR Manager Dashboard");

    }

}