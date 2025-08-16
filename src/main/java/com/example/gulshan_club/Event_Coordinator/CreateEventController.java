package com.example.gulshan_club.Event_Coordinator;

import com.example.gulshan_club.CommonClass.Switcher;
import com.example.gulshan_club.Event_Coordinator_Modelclass.CreateEvent;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CreateEventController
{
    @javafx.fxml.FXML
    private TextField eventNameTextField;
    @javafx.fxml.FXML
    private TextArea eventDescriptionTextArea;
    @javafx.fxml.FXML
    private TableView<CreateEvent> eventlistTableTableView;
    @javafx.fxml.FXML
    private DatePicker eventDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<CreateEvent,String> eventDateCol;
    @javafx.fxml.FXML
    private TableColumn<CreateEvent, String> eventNameCol;

    @javafx.fxml.FXML
    public void initialize() {
       eventNameCol.setCellValueFactory(new PropertyValueFactory<>("eventName"));
       eventDateCol.setCellValueFactory(new PropertyValueFactory<>("eventDate"));
        
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Event_coordinator","Event_Coordinator_Dashboard.fxml","Event Coordinator Dashboard");
    }


    @javafx.fxml.FXML
    public void handleCreateEventButton(ActionEvent actionEvent) {
    }
}