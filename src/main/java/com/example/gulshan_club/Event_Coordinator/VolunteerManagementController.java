package com.example.gulshan_club.Event_Coordinator;

import com.example.gulshan_club.CommonClass.Switcher;
import com.example.gulshan_club.Event_Coordinator_Modelclass.volunteerManagement;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class VolunteerManagementController
{
    @javafx.fxml.FXML
    private TableView<volunteerManagement> volunteersListTableTableView;
    @javafx.fxml.FXML
    private TableColumn<volunteerManagement ,String> volunteerNameCol;
    @javafx.fxml.FXML
    private TableColumn<volunteerManagement,String> AssignedRoleCol;

    @javafx.fxml.FXML
    public void initialize() {
        volunteerNameCol.setCellValueFactory(new PropertyValueFactory<>("volunteerName"));
        volunteerNameCol.setCellValueFactory(new PropertyValueFactory<>("volunteerName"));
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Event_coordinator","Event_Coordinator_Dashboard.fxml","Event Coordinator Dashboard");
    }

    @javafx.fxml.FXML
    public void handleAssignVolunteerButton(ActionEvent actionEvent) {
    }



    @javafx.fxml.FXML
    public void handleUnassignVolunteerButton(ActionEvent actionEvent) {
    }
}