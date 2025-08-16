package com.example.gulshan_club.Club_Manager;

import com.example.gulshan_club.Club_manager_Modelclass.EventManagement;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class EventManagementController
{
    @javafx.fxml.FXML
    private TableColumn<EventManagement,String> eventDateCol;
    @javafx.fxml.FXML
    private TextField searcheventTextField;
    @javafx.fxml.FXML
    private TableColumn<EventManagement,String> eventIdCol;
    @javafx.fxml.FXML
    private TableView<EventManagement> eventListTableView;
    @javafx.fxml.FXML
    private TableColumn<EventManagement,String> eventNameCol;
    ObservableList<EventManagement> reportList = FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {
        eventIdCol.setCellValueFactory(new PropertyValueFactory<>("eventID"));
        eventNameCol.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        eventDateCol.setCellValueFactory(new PropertyValueFactory<>("eventDate"));

    }

    @javafx.fxml.FXML
    public void handleEditEventButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Club_Manager","Club_Manager_Dashboard.fxml","Club Manager Dashboard");
    }

    @javafx.fxml.FXML
    public void handleSearchButton(ActionEvent actionEvent) {
        String query = searcheventTextField.getText().trim();



        if (searcheventTextField.getText() == null || searcheventTextField.getText().trim().isEmpty()) {
         showAlert("Fill up the field");
            return;
        }
    }

    @javafx.fxml.FXML
    public void handleAssignCoordinatorButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleCancelEventButton(ActionEvent actionEvent) {
    }
    private void showAlert(String message) {
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setContentText(message);
        a.showAndWait();}
}
