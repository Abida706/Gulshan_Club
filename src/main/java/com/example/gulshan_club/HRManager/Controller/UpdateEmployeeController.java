package com.example.gulshan_club.HRManager.Controller;

import com.example.gulshan_club.CommonClass.Switcher;
import com.example.gulshan_club.HRManager.Model.UpdateEmployee;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class UpdateEmployeeController
{
    @javafx.fxml.FXML
    private TextField salaryTextField;
    @javafx.fxml.FXML
    private TableColumn<UpdateEmployee, String> nameTableCol;
    @javafx.fxml.FXML
    private TableColumn<UpdateEmployee, String> positionTableCol;
    @javafx.fxml.FXML
    private TableColumn<UpdateEmployee, String> salaryTableCol;
    @javafx.fxml.FXML
    private TextField positionTextField;
    @javafx.fxml.FXML
    private TableView<UpdateEmployee> updateEmployeeTable;
    @javafx.fxml.FXML
    private TextField deptTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField contactTextField;
    @javafx.fxml.FXML
    private TableColumn<UpdateEmployee, String> contactTableCol;
    @javafx.fxml.FXML
    private TableColumn<UpdateEmployee, String> deptTableCol;

    @javafx.fxml.FXML
    public void initialize() {
        nameTableCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        salaryTableCol.setCellValueFactory(new PropertyValueFactory<>("salary"));
        positionTableCol.setCellValueFactory(new PropertyValueFactory<>("position"));
        contactTableCol.setCellValueFactory(new PropertyValueFactory<>("contact"));

    }

    @javafx.fxml.FXML
    public void handleSaveButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSearchButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "HRManager", "HRManagerDashboard.fxml", "HR Manager Dashboard");

    }

}