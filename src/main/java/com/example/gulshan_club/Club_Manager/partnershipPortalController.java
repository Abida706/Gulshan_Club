package com.example.gulshan_club.Club_Manager;

import com.example.gulshan_club.Club_manager_Modelclass.partnershipPortal;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class partnershipPortalController
{
    @javafx.fxml.FXML
    private TextField partnerNameTextField;
    @javafx.fxml.FXML
    private TableColumn<partnershipPortal, String> partnerNameCol;
    @javafx.fxml.FXML
    private TextField contactInfoTextField;
    @javafx.fxml.FXML
    private TableColumn<partnershipPortal, String> dealValueCol;
    @javafx.fxml.FXML
    private TableColumn<partnershipPortal, String> contactInfoCol;
    @javafx.fxml.FXML
    private TableView<partnershipPortal> partneshipListTableTableView;
    @javafx.fxml.FXML
    private TextField dealValueTextField;

    @javafx.fxml.FXML
    public void initialize() {
       partnerNameCol.setCellValueFactory(new PropertyValueFactory<>("partnerName"));
       dealValueCol.setCellValueFactory(new PropertyValueFactory<>("dealValue"));
       contactInfoCol.setCellValueFactory(new PropertyValueFactory<>("contactInfo"));


    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Club_Manager","Club_Manager_Dashboard.fxml","Club Manager Dashboard");
    }

    @javafx.fxml.FXML
    public void handleDeletePartnerButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleUpdatePartnerButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleAddPartnerButton(ActionEvent actionEvent) {
    }
}