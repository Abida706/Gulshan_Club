package com.example.gulshan_club.Security_Supervisor.Controller;


import com.example.gulshan_club.Security_Supervisor.Model.EquipmentMaintenance;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class EquipmentMaintenanceController {
    @javafx.fxml.FXML
    private TableColumn<EquipmentMaintenance, String> lastMaintenanceCol;
    @javafx.fxml.FXML
    private TableColumn<EquipmentMaintenance, String> equipmentCol;
    @javafx.fxml.FXML
    private TableColumn<EquipmentMaintenance, String> statusCol;
    @javafx.fxml.FXML
    private TableView<String> maintenanceHistoryTableView;
    @javafx.fxml.FXML
    private TextArea maintenanceNotesTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> selectEquipmentComboBox;
    @javafx.fxml.FXML
    private TableColumn<EquipmentMaintenance, String> remarksCol;

    ArrayList<EquipmentMaintenance> maintenanceList = new ArrayList<>();



    @javafx.fxml.FXML
    public void initialize() {
        equipmentCol.setCellValueFactory(new PropertyValueFactory<>("equipmentName"));
        lastMaintenanceCol.setCellValueFactory(new PropertyValueFactory<>("lastMaintenanceDate"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        remarksCol.setCellValueFactory(new PropertyValueFactory<>("remarks"));

        selectEquipmentComboBox.getItems().addAll("Camera 1", "Camera 2", "Metal Detector", "Walkie Talkie");
    }
    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent){
        Switcher.switcher((Node) actionEvent.getSource(), "Security_Supervisor","Security_Supervisor_Dashboard.fxml","Security Supervisor Dashboard");

    }

    @javafx.fxml.FXML
    public void handleSaveButton(ActionEvent actionEvent) {

        if(selectEquipmentComboBox.getValue() == null || selectEquipmentComboBox.getValue().isEmpty()){
            showAlert("Please select an equipment.");
            return;
        }


        if (maintenanceNotesTextArea.getText() == null || maintenanceNotesTextArea.getText().isEmpty()){
            showAlert("Please enter maintenance notes.");
            return;
        }


    }

    @javafx.fxml.FXML
    public void handleScheduleRepairButton(ActionEvent actionEvent) {
        if(selectEquipmentComboBox.getValue() == null || selectEquipmentComboBox.getValue().isEmpty()){
            showAlert("Please select an equipment.");
            return;
        }


        if (maintenanceNotesTextArea.getText() == null || maintenanceNotesTextArea.getText().isEmpty()){
            showAlert("Please enter maintenance notes.");
            return;
        }

//        maintenanceList.add(maintenance);
        maintenanceNotesTextArea.clear();
        showAlert("Repair scheduled for selected equipment.");


        EquipmentMaintenance equipmentMaintenance = new EquipmentMaintenance(
                selectEquipmentComboBox.getValue(),
                maintenanceNotesTextArea.getText());


        maintenanceList.add(equipmentMaintenance);

        maintenanceHistoryTableView.getItems().clear();
        maintenanceHistoryTableView.getItems().addAll(String.valueOf(maintenanceList));
    }


    private void showAlert(String message) {
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setContentText(message);
        a.showAndWait();
    }




//        cardList.add(creditCard);
//
//        creditCardTableView.getItems().clear();;
//        creditCardTableView.getItems().addAll(cardList);
//
//        addButton.setText("Successful");
}

