package com.example.gulshan_club.Marketing_Manager.Controller;

import com.example.gulshan_club.Marketing_Manager.Model.MembershipDive;
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

public class MembershipDriveController
{
    @javafx.fxml.FXML
    private TextField packageNameTextField;
    @javafx.fxml.FXML
    private TableView<String> applicantTableView;
    @javafx.fxml.FXML
    private TableColumn<MembershipDive,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<MembershipDive,String> packageCol;
    @javafx.fxml.FXML
    private DatePicker deadlineDatePicker;
    @javafx.fxml.FXML
    private TableColumn<MembershipDive,LocalDate> dateAppliedCol;
    @javafx.fxml.FXML
    private TableColumn<MembershipDive,String> emailCol;
    @javafx.fxml.FXML
    private TextArea packageDetailsTextArea;
    @javafx.fxml.FXML
    private TableColumn<String, MembershipDriveController> applicantNameCol;

    @javafx.fxml.FXML
    public void initialize() {
        applicantNameCol.setCellValueFactory(new PropertyValueFactory<>("applicantName"));
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
        dateAppliedCol.setCellValueFactory(new PropertyValueFactory<>("dateApplied"));
        packageCol.setCellValueFactory(new PropertyValueFactory<>("packageName"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        deadlineDatePicker.setValue(LocalDate.now().plusDays(7));
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Marketing_Manager","Marketing_Manager_Dashboard.fxml","Marketing Manager Dashboard");

    }

    @javafx.fxml.FXML
    public void handleLaunchDriveButton(ActionEvent actionEvent) {
        if (packageNameTextField.getText().trim().isEmpty() || packageDetailsTextArea.getText().trim().isEmpty() || deadlineDatePicker.getValue() == null) {
            showAlert( "Please fill in all the fields.");
            return;
        }
        packageNameTextField.clear();
        packageDetailsTextArea.clear();
        deadlineDatePicker.setValue(null);
    }

    private void showAlert(String error) {
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setContentText(error);
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void handleTrackApplicantsButton(ActionEvent actionEvent) {
        if (packageNameTextField.getText().isEmpty()){
            showAlert("Package name must not be empty!");
            return;
        }
        if (packageDetailsTextArea.getText().isEmpty()) {
            showAlert("Package details must not be empty!");
            return;
        }

        if (deadlineDatePicker.getValue() == null) {
            showAlert("Please select a deadline date!");
            return;
        }
    }

}