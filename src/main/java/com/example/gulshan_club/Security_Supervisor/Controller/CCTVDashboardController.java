package com.example.gulshan_club.Security_Supervisor.Controller;


import com.example.gulshan_club.Security_Supervisor.Model.CCTVDashboard;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class CCTVDashboardController
{
    @javafx.fxml.FXML
    private ImageView liveFeedPlaceholderImageView;
    @javafx.fxml.FXML
    private TableColumn<CCTVDashboard,String> recordedByCol;
    @javafx.fxml.FXML
    private ComboBox<String> selectCameraComboBox;
    @javafx.fxml.FXML
    private TextArea incidentDescriptionTextArea;
    @javafx.fxml.FXML
    private TableView<String> cameraTableView;
    @javafx.fxml.FXML
    private TableColumn<CCTVDashboard,String> cameraCol;
    @javafx.fxml.FXML
    private TableColumn<CCTVDashboard,String> incidentSummaryCol;
    @javafx.fxml.FXML
    private TableColumn<CCTVDashboard,String> timeCol;


    @javafx.fxml.FXML
    public void initialize() {
        cameraCol.setCellValueFactory(new PropertyValueFactory<>("camera"));
        incidentSummaryCol.setCellValueFactory(new PropertyValueFactory<>("incidentSummary"));
        recordedByCol.setCellValueFactory(new PropertyValueFactory<>("recordedBy"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));

        selectCameraComboBox.getItems().addAll("Gate Camera", "Hallway Camera", "Parking Lot Camera", "Main Entrance Camera");

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Security_Supervisor","Security_Supervisor_Dashboard.fxml","Security Supervisor Dashboard");

    }

    @javafx.fxml.FXML
    public void handleSaveIncidentButton(ActionEvent actionEvent) {

        if (selectCameraComboBox.getValue() == null || selectCameraComboBox.getValue().isEmpty()) {
            showAlert("Please select a camera.");
            return;
        }

        if (incidentDescriptionTextArea.getText() == null || incidentDescriptionTextArea.getText().trim().isEmpty()) {
            showAlert("Please enter an incident description.");
            return;
        }

        CCTVDashboard newEntry = new CCTVDashboard(
                selectCameraComboBox.getValue(),
                liveFeedPlaceholderImageView.toString(),
                incidentDescriptionTextArea.getText());

        incidentDescriptionTextArea.clear();
        selectCameraComboBox.getItems().clear();
    }
    private void showAlert(String message) {
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setContentText(message);
        a.showAndWait();}

    @javafx.fxml.FXML
    public void handleRecordButton(ActionEvent actionEvent) {
        showAlert("Recording started on selected camera (simulation).");
    }
}