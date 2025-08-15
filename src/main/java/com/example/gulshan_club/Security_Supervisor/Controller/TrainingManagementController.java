package com.example.gulshan_club.Security_Supervisor.Controller;


import com.example.gulshan_club.Security_Supervisor.Model.TrainingManagement;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class TrainingManagementController
{
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<TrainingManagement,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<TrainingManagement,String> moduleCol;
    @javafx.fxml.FXML
    private TableColumn<TrainingManagement, LocalDate> completionDateCol;
    @javafx.fxml.FXML
    private TextField moduleNameTextField;
    @javafx.fxml.FXML
    private TableView<TrainingManagement> trainingInfoTableView;
    @javafx.fxml.FXML
    private ComboBox<String> personnelComboBox;
    @javafx.fxml.FXML
    private TableColumn<TrainingManagement,String> securityStaffCol;
    //ArrayList<CreditCard> cardList = new ArrayList<>();
    ArrayList<TrainingManagement> trainingManagementList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        securityStaffCol.setCellValueFactory(new PropertyValueFactory<>("securityStaff"));
        moduleCol.setCellValueFactory(new PropertyValueFactory<>("module"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        completionDateCol.setCellValueFactory(new PropertyValueFactory<>("completionDate"));

        personnelComboBox.getItems().addAll("Nihal", "Toriqul", "Rahin");

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent){
        Switcher.switcher((Node) actionEvent.getSource(), "Security_Supervisor","Security_Supervisor_Dashboard.fxml","Security Supervisor Dashboard");


    }

    @javafx.fxml.FXML
    public void handleAssignButton(ActionEvent actionEvent) {

        if (personnelComboBox.getValue() == null){
            showAlert("Please select personnel");
            return;
        }
        if (moduleNameTextField.getText().isEmpty()){
            showAlert("Please enter module name!");
            return;
        }
        if (dateDatePicker.getValue() == null) {
            showAlert("Please select a date!");
            return;
        }

        TrainingManagement trainingManagement = new TrainingManagement(
                personnelComboBox.getValue(),
                moduleNameTextField.getText(),
                dateDatePicker.getValue());


        moduleNameTextField.clear();
        dateDatePicker.setValue(null);

    }

    @javafx.fxml.FXML
    public void handleTrackButton(ActionEvent actionEvent) {

        TrainingManagement trainingManagement = new TrainingManagement(
                personnelComboBox.getValue(),
                moduleNameTextField.getText(),
                dateDatePicker.getValue());


        moduleNameTextField.clear();
        dateDatePicker.setValue(null);

        trainingInfoTableView.getItems().clear();
        trainingInfoTableView.getItems().addAll();
    }

    @javafx.fxml.FXML
    public void handleReportButton(ActionEvent actionEvent) {
        System.out.println("Report generated!");
    }
    private void showAlert(String message) {
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setContentText(message);
        a.showAndWait();}
}