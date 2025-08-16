package com.example.gulshan_club.Event_Coordinator;

import com.example.gulshan_club.CommonClass.Switcher;
import com.example.gulshan_club.Event_Coordinator_Modelclass.RegistrationPanel;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class RegistrationPanelController
{
    @javafx.fxml.FXML
    private TableView<RegistrationPanel> participantListTableTableView;
    @javafx.fxml.FXML
    private TableColumn<RegistrationPanel,String> participantNameCol;
    @javafx.fxml.FXML
    private TableColumn<RegistrationPanel,String> registrationStatusCol;

    @javafx.fxml.FXML
    public void initialize() {
        participantNameCol.setCellValueFactory(new PropertyValueFactory<>("participantName"));
        registrationStatusCol.setCellValueFactory(new PropertyValueFactory<>("registrationStatus"));

    }

    @javafx.fxml.FXML
    public void handleApproveRegistrationButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Event_coordinator","Event_Coordinator_Dashboard.fxml","Event Coordinator Dashboard");
    }

    @javafx.fxml.FXML
    public void handleRejectRegistrationButton(ActionEvent actionEvent) {
    }


}