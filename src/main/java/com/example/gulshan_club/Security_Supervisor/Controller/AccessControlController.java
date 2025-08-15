package com.example.gulshan_club.Security_Supervisor.Controller;


import com.example.gulshan_club.Security_Supervisor.Model.AccessControl;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccessControlController
{
    @javafx.fxml.FXML
    private CheckBox gymAccessCheckBox;
    @javafx.fxml.FXML
    private TextField memberIdTextField;
    @javafx.fxml.FXML
    private TableColumn<AccessControl,String> nameCol;
    @javafx.fxml.FXML
    private CheckBox loungeAccessCheckBox;
    @javafx.fxml.FXML
    private TableColumn<AccessControl,String> memberIdCol;
    @javafx.fxml.FXML
    private TableColumn<AccessControl,String> accessLevelCol;
    @javafx.fxml.FXML
    private TableColumn<AccessControl,String> lastUpdateCol;
    @javafx.fxml.FXML
    private CheckBox parkingAccessCheckBox;
    @javafx.fxml.FXML
    private TableView<String> accessTableView;
    @javafx.fxml.FXML
    private CheckBox eventAccessCheckBox;

    ArrayList<AccessControl> accessData = new ArrayList<>();
    private String memberId;


    @javafx.fxml.FXML
    public void initialize() {
        memberIdCol.setCellValueFactory(new PropertyValueFactory<>("memberId"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        accessLevelCol.setCellValueFactory(new PropertyValueFactory<>("accessLevel"));
        lastUpdateCol.setCellValueFactory(new PropertyValueFactory<>("lastUpdate"));

    }

    @javafx.fxml.FXML
    public void handleSaveButton(ActionEvent actionEvent) {

        if (memberIdTextField.getText().trim().isEmpty()) {
            showAlert("Member ID must not be empty!");
            return;
        }

        if (accessLevelCol.getText().isEmpty()) {
            showAlert("Select at least one access level!");
            return;
        }

        AccessControl newEntry = new AccessControl(memberId);
        accessData.add(newEntry);

        accessTableView.getItems().clear();
        accessTableView.getItems().addAll(String.valueOf(accessData));
    }

    private void showAlert( String message) {
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setContentText(message);
        a.showAndWait();}

    @Deprecated
    public void handleBackButton(ActionEvent actionEvent)  {
        Switcher.switcher((Node) actionEvent.getSource(), "Security_Supervisor","Security_Supervisor_Dashboard.fxml","Security Supervisor Dashboard");


    }

    @javafx.fxml.FXML
    public void handleBaackButton(ActionEvent actionEvent) {
    }
}