package com.example.gulshan_club.Security_Supervisor.Controller;

import com.example.gulshan_club.Security_Supervisor.Model.VisitorRegistration;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class VisitorRegistrationController
{
    @javafx.fxml.FXML
    private TableColumn<VisitorRegistration,String> visitorNameCol;
    @javafx.fxml.FXML
    private TableColumn<VisitorRegistration,String> checkOutCol;
    @javafx.fxml.FXML
    private TableColumn<VisitorRegistration,String> checkInCol;
    @javafx.fxml.FXML
    private TableColumn<VisitorRegistration,String> hostCol;
    @javafx.fxml.FXML
    private TableColumn<VisitorRegistration,String> contactCol;
    @javafx.fxml.FXML
    private TableColumn<VisitorRegistration,String> purposeCol;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField contactTextField;
    @javafx.fxml.FXML
    private TextField hostTextField;
    @javafx.fxml.FXML
    private TableView<VisitorRegistration> visitorLogTableView;
    @javafx.fxml.FXML
    private TextField purposeTextField;

    @javafx.fxml.FXML
    public void initialize() {
        visitorNameCol.setCellValueFactory(new PropertyValueFactory<>("visitorName"));
        checkInCol.setCellValueFactory(new PropertyValueFactory<>("checkInTime"));
        checkOutCol.setCellValueFactory(new PropertyValueFactory<>("checkOutTime"));
        hostCol.setCellValueFactory(new PropertyValueFactory<>("hostName"));
        contactCol.setCellValueFactory(new PropertyValueFactory<>("contactInfo"));
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent)throws IOException {
        Switcher.switcher((Node) actionEvent.getSource(), "Security_Supervisor","Security_Supervisor_Dashboard.fxml","Security Supervisor Dashboard");


    }

    @javafx.fxml.FXML
    public void handleCheckoutButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleRegisterButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleRegisteButton(ActionEvent actionEvent) {
    }
}