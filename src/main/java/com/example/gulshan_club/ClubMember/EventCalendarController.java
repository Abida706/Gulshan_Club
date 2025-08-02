package com.example.gulshan_club.ClubMember;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EventCalendarController
{
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn venueCol;
    @javafx.fxml.FXML
    private DatePicker selectDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn organizerCol;
    @javafx.fxml.FXML
    private TableView eventListTableView;
    @javafx.fxml.FXML
    private TableColumn timeCol;
    @javafx.fxml.FXML
    private TableColumn eventNameCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleViewDetailsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLogoutButton(ActionEvent actionEvent) {
    }
}