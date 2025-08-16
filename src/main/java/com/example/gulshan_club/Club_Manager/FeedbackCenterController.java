package com.example.gulshan_club.Club_Manager;

import com.example.gulshan_club.Club_manager_Modelclass.FacilityBooking;
import com.example.gulshan_club.Club_manager_Modelclass.FeedbackCenter;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class FeedbackCenterController
{
    @javafx.fxml.FXML
    private TableView<FeedbackCenter> feedBackListTableView;
    @javafx.fxml.FXML
    private TextArea responeTextArea;
    @javafx.fxml.FXML
    private TableColumn<FeedbackCenter,String> feedbackTextCol;
    @javafx.fxml.FXML
    private TableColumn<FacilityBooking,String> memberNameCol;
    @javafx.fxml.FXML
    private TableColumn<FacilityBooking,String> feedBackIdCol;

    @javafx.fxml.FXML
    public void initialize() {
        feedBackIdCol.setCellValueFactory(new PropertyValueFactory<>("feedbackId"));
        feedbackTextCol.setCellValueFactory(new PropertyValueFactory<>("feedbackText"));
        feedbackTextCol.setCellValueFactory(new PropertyValueFactory<>("feedbackText"));
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Club_Manager","Club_Manager_Dashboard.fxml","Club Manager Dashboard");
    }

    @javafx.fxml.FXML
    public void handleSubmitButton(ActionEvent actionEvent) {
    }

}