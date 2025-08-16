package com.example.gulshan_club.ClubPresident.Controller;

import com.example.gulshan_club.ClubPresident.Model.ClubCalender;
import com.example.gulshan_club.CommonClass.LoginPageController;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ClubCalendarController
{
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private TableColumn<ClubCalender,String > dateCol;
    @javafx.fxml.FXML
    private TableColumn<ClubCalender,String > venueCol;
    @javafx.fxml.FXML
    private TableView<ClubCalender> eventsTableView;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private TableColumn<ClubCalender,String > organizerCol;
    @javafx.fxml.FXML
    private TableColumn<ClubCalender,String > timeCol;
    @javafx.fxml.FXML
    private TableColumn<ClubCalender,String> eventNameCol;

    @javafx.fxml.FXML
    public void initialize() {
        dateCol.setCellValueFactory(new PropertyValueFactory<>("Date"));
        venueCol.setCellValueFactory(new PropertyValueFactory<>("Venue"));
        organizerCol.setCellValueFactory(new PropertyValueFactory<>("Organizer"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("Time"));
        eventNameCol.setCellValueFactory(new PropertyValueFactory<>("Event Name"));
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club President","ClubPresidentDashboard.fxml","Club President Dashboard");
    }

    @javafx.fxml.FXML
    public void handleExportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleAddEventButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLogoutButton(ActionEvent actionEvent) {
    }
}