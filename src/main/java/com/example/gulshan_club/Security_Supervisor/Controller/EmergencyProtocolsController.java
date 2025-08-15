package com.example.gulshan_club.Security_Supervisor.Controller;

import com.example.gulshan_club.Security_Supervisor.Model.CCTVDashboard;
import com.example.gulshan_club.Security_Supervisor.Model.EmergencyProtocols;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class EmergencyProtocolsController
{
    @javafx.fxml.FXML
    private TextArea evacuationInstructionsTextArea;
    @javafx.fxml.FXML
    private TextField contactNumberTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent)throws IOException {
        Switcher.switcher((Node) actionEvent.getSource(), "Security_Supervisor","Security_Supervisor_Dashboard.fxml","Security Supervisor Dashboard");

    }

    @javafx.fxml.FXML
    public void handleSaveButton(ActionEvent actionEvent) {
        if (contactNumberTextField.getText() == null || contactNumberTextField.getText().trim().isEmpty()) {
            showAlert("Contact number is required!");
            return;
        }

        if (contactNumberTextField.getText().length() !=11) {
            showAlert("Contact number must be 11 digits!");  //.getText().length() != 16
            return;
        }

        if (evacuationInstructionsTextArea.getText() == null || evacuationInstructionsTextArea.getText().trim().isEmpty()) {
            showAlert("Evacuation instructions are required!");
            return;
        }

        EmergencyProtocols emergencyProtocols = new EmergencyProtocols(
                contactNumberTextField.getText(),
                evacuationInstructionsTextArea.getText());
    }
    private void showAlert(String message) {
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setContentText(message);
        a.showAndWait();}
}
