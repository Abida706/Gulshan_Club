package com.example.gulshan_club.HRManager.Controller;

import com.example.gulshan_club.CommonClass.Switcher;
import com.example.gulshan_club.HRManager.Model.RemoveEmployee;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class RemoveEmployeeController
{
    @javafx.fxml.FXML
    private TableColumn<RemoveEmployee, String> nameTableCol;
    @javafx.fxml.FXML
    private TableColumn<RemoveEmployee, String> positionTableCol;
    @javafx.fxml.FXML
    private TableView<RemoveEmployee> removeEmployeeTable;
    @javafx.fxml.FXML
    private TableColumn<RemoveEmployee, String> contactTableCol;
    @javafx.fxml.FXML
    private TableColumn<RemoveEmployee, String> deptTableCol;
    @javafx.fxml.FXML
    private TextField searchTextField;

    @javafx.fxml.FXML
    public void initialize() {
        nameTableCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        positionTableCol.setCellValueFactory(new PropertyValueFactory<>("position"));
        contactTableCol.setCellValueFactory(new PropertyValueFactory<>("contact"));
        deptTableCol.setCellValueFactory(new PropertyValueFactory<>("dept"));
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "HRManager", "HRManagerDashboard.fxml", "HR Manager Dashboard");

    }

    @javafx.fxml.FXML
    public void handleRemoveButton(ActionEvent actionEvent) {
    }

}