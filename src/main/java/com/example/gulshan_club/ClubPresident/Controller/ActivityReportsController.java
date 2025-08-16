package com.example.gulshan_club.ClubPresident.Controller;

import com.example.gulshan_club.ClubPresident.Model.ActivityReports;
import com.example.gulshan_club.CommonClass.LoginPageController;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ActivityReportsController
{
    @javafx.fxml.FXML
    private TableColumn<ActivityReports,String> typeCol;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private TableView<ActivityReports> reportTableTableView;
    @javafx.fxml.FXML
    private TableColumn<ActivityReports,String> reportTitleCol;
    @javafx.fxml.FXML
    private TableColumn<ActivityReports,String> createdDateCol;
    @javafx.fxml.FXML
    private TableColumn<ActivityReports,String> createdByCol;

    @javafx.fxml.FXML
    public void initialize() {
        reportTitleCol.setCellValueFactory(new PropertyValueFactory<>("Report Title"));
        createdByCol.setCellValueFactory(new PropertyValueFactory<>("Created By"));
        createdDateCol.setCellValueFactory(new PropertyValueFactory<>("Created Date"));
        typeCol.setCellValueFactory(new PropertyValueFactory<>("Type"));

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club President","ClubPresidentDashboard.fxml","Club President Dashboard");
    }

    @javafx.fxml.FXML
    public void handleGenerateButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleExportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLogoutButton(ActionEvent actionEvent) {
    }
}