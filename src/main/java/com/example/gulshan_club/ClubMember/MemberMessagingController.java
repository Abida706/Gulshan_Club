package com.example.gulshan_club.ClubMember;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MemberMessagingController
{
    @javafx.fxml.FXML
    private TableColumn senderCol;
    @javafx.fxml.FXML
    private TableView conversationThreadsTableView;
    @javafx.fxml.FXML
    private TextField searchTextField;
    @javafx.fxml.FXML
    private TextArea messageContentTextArea;
    @javafx.fxml.FXML
    private TableColumn messagePreviewCol;
    @javafx.fxml.FXML
    private TableColumn timestampCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSendButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleClearButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLogoutButton(ActionEvent actionEvent) {
    }
}