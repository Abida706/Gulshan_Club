package com.example.gulshan_club.Event_Coordinator;

import com.example.gulshan_club.CommonClass.Switcher;
import com.example.gulshan_club.Event_Coordinator_Modelclass.LogisticsManagement;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class LogisticsManagementController
{
    @javafx.fxml.FXML
    private Label itemNameTextField;
    @javafx.fxml.FXML
    private TableView<LogisticsManagement> logisticsTableTableView;
    @javafx.fxml.FXML
    private TableColumn<LogisticsManagement,String> statusCol;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private TableColumn<LogisticsManagement,String> quantityCol;
    @javafx.fxml.FXML
    private TableColumn<LogisticsManagement,String> itemNameCol;
    @javafx.fxml.FXML
    private TextField quantityTextField;

    @javafx.fxml.FXML
    public void initialize() {
        itemNameCol.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

    }

    @javafx.fxml.FXML
    public void handleAddItemButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSaveLogisticsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Event_coordinator","Event_Coordinator_Dashboard.fxml","Event Coordinator Dashboard");
    }


}