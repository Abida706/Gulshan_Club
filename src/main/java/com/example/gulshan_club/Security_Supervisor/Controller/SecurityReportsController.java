package com.example.gulshan_club.Security_Supervisor.Controller;


import com.example.gulshan_club.Security_Supervisor.Model.SecurityReports;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class SecurityReportsController
{
    @javafx.fxml.FXML
    private TableColumn<SecurityReports,String> typeCol;
    @javafx.fxml.FXML
    private TableColumn<SecurityReports,String> locationCol;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private TableColumn<SecurityReports,String> dateCol;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private TableColumn<SecurityReports,String> reportedCol;
    @javafx.fxml.FXML
    private ComboBox<String> reportComboBox;
    @javafx.fxml.FXML
    private TableView<SecurityReports> reportOutputTableView;
    @javafx.fxml.FXML
    private TableColumn<SecurityReports,String> remarksCol;


    private ObservableList<SecurityReports> reportList = FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        reportedCol.setCellValueFactory(new PropertyValueFactory<>("reportedBy"));
        remarksCol.setCellValueFactory(new PropertyValueFactory<>("remarks"));

        reportComboBox.getItems().addAll("All", "Incident", "Maintenance", "Visitor Log", "Security Breach");


        reportOutputTableView.setItems(reportList);


    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent){
        Switcher.switcher((Node) actionEvent.getSource(), "Security_Supervisor","Security_Supervisor_Dashboard.fxml","Security Supervisor Dashboard");


    }

    @javafx.fxml.FXML
    public void handleGenerateButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleExportButton(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Report");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV Files", "*.csv"));
        File file = fileChooser.showSaveDialog(((Node) actionEvent.getSource()).getScene().getWindow());
    }
}