package com.example.gulshan_club.ClubMember.Controller;

import com.example.gulshan_club.ClubMember.Model.EventCalender;
import com.example.gulshan_club.CommonClass.LoginPageController;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class EventCalendarController
{
    @javafx.fxml.FXML
    private TableColumn<EventCalender, String> dateCol;
    @javafx.fxml.FXML
    private TableColumn<EventCalender,String > venueCol;
    @javafx.fxml.FXML
    private DatePicker selectDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<EventCalender,String > organizerCol;
    @javafx.fxml.FXML
    private TableView<EventCalender> eventListTableView;
    @javafx.fxml.FXML
    private TableColumn<EventCalender,String > timeCol;
    @javafx.fxml.FXML
    private TableColumn<EventCalender,String> eventNameCol;

    @javafx.fxml.FXML
    public void initialize() {
        eventNameCol.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));
        venueCol.setCellValueFactory(new PropertyValueFactory<>("venue"));
        organizerCol.setCellValueFactory(new PropertyValueFactory<>("organizer"));
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club Member","ClubMemberDashboard.fxml","Club Member Dashboard");
    }

    @javafx.fxml.FXML
    public void handleViewDetailsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLogoutButton(ActionEvent actionEvent) {
    }
}