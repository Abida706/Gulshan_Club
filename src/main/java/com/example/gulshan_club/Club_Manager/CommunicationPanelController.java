package com.example.gulshan_club.Club_Manager;

import com.example.gulshan_club.Club_manager_Modelclass.Communicationpanel;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CommunicationPanelController
{
    @javafx.fxml.FXML
    private TextField subjectfieldTextField;
    @javafx.fxml.FXML
    private TableColumn<Communicationpanel, String> datesentCol;
    @javafx.fxml.FXML
    private TableView<Communicationpanel> SendmessagelistTableView;
    @javafx.fxml.FXML
    private TextArea messageTextArea;
    @javafx.fxml.FXML
    private Label announcementLabel;
    @javafx.fxml.FXML
    private TableColumn<Communicationpanel,String> subjectCol;

    @javafx.fxml.FXML
    public void initialize() {
        subjectCol.setCellValueFactory(new PropertyValueFactory<>("subjet"));
        datesentCol.setCellValueFactory(new PropertyValueFactory<>("dateSent"));

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Club_Manager","Club_Manager_Dashboard.fxml","Club Manager Dashboard");
    }

    @javafx.fxml.FXML
    public void handleSendButton(ActionEvent actionEvent) {
    }

}