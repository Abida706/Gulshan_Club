package com.example.gulshan_club.Security_Supervisor.Controller;


import com.example.gulshan_club.Security_Supervisor.Model.SecuritySchedule;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class SecurityScheduleController
{
    @javafx.fxml.FXML
    private TableColumn<SecuritySchedule,String> areaCol;
    @javafx.fxml.FXML
    private TextField areaTextField;
    @javafx.fxml.FXML
    private TableView<SecuritySchedule> scheduleListTableView;
    @javafx.fxml.FXML
    private TextField guardNameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> shiftTimeComboBox;
    @javafx.fxml.FXML
    private TableColumn<SecuritySchedule,String> shiftTimeCol;
    @javafx.fxml.FXML
    private TextField contactTextField;
    @javafx.fxml.FXML
    private TableColumn<SecuritySchedule,String> guardNameCol;
    @javafx.fxml.FXML
    private TableColumn<SecuritySchedule,String> contactNumberCol;

    private ObservableList<SecuritySchedule> scheduleList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        shiftTimeCol.setCellValueFactory(new PropertyValueFactory<>("area"));
        guardNameCol.setCellValueFactory(new PropertyValueFactory<>("guardName"));
        shiftTimeCol.setCellValueFactory(new PropertyValueFactory<>("shiftTime"));
        contactNumberCol.setCellValueFactory(new PropertyValueFactory<>("contactNumber"));

        scheduleListTableView.setItems(scheduleList);

        shiftTimeComboBox.getItems().addAll("Morning", "Afternoon", "Night");

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent){
        Switcher.switcher((Node) actionEvent.getSource(), "Security_Supervisor","Security_Supervisor_Dashboard.fxml","Security Supervisor Dashboard");


    }

    @javafx.fxml.FXML
    public void handleassignShiftButton(ActionEvent actionEvent) {
        if (areaTextField.getText().isEmpty() || guardNameTextField.getText().isEmpty() ||shiftTimeComboBox.getValue() == null || contactTextField.getText().isEmpty()){
            System.out.println("Please fill all fields");

            areaTextField.clear();
            guardNameTextField.clear();
            shiftTimeComboBox.setValue(null);
            contactTextField.clear();
        }
    }
}