package com.example.gulshan_club.Club_Manager;

import com.example.gulshan_club.Club_manager_Modelclass.FacilityBooking;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FacilityBookingController
{
    @javafx.fxml.FXML
    private TableColumn<FacilityBooking,String> statusTableColumn;
    @javafx.fxml.FXML
    private Label facilityscheduleLabel;
    @javafx.fxml.FXML
    private Label facilitybookingTextfField;
    @javafx.fxml.FXML
    private TableView<FacilityBooking> facilityScheduleTableView;
    @javafx.fxml.FXML
    private TableColumn<FacilityBooking,String> bookingDateTablecolumn;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private Button rejectbookingButton;
    @javafx.fxml.FXML
    private TableColumn<FacilityBooking, String> facilityNameTableCol;

    @javafx.fxml.FXML
    public void initialize() {
        facilityNameTableCol.setCellValueFactory(new PropertyValueFactory<>("facilityName"));
        bookingDateTablecolumn.setCellValueFactory(new PropertyValueFactory<>("bookingDate"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

    }

    @javafx.fxml.FXML
    public void handleAppro(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Club_Manager","Club_Manager_Dashboard.fxml","Club Manager Dashboard");
    }
}