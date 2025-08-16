package com.example.gulshan_club.ClubMember.Controller;

import com.example.gulshan_club.ClubMember.Model.MemberMessaging;
import com.example.gulshan_club.CommonClass.LoginPageController;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class MemberMessagingController
{
    @javafx.fxml.FXML
    private TableColumn<MemberMessaging,String> senderCol;
    @javafx.fxml.FXML
    private TableView<MemberMessaging> conversationThreadsTableView;
    @javafx.fxml.FXML
    private TextField searchTextField;
    @javafx.fxml.FXML
    private TextArea messageContentTextArea;
    @javafx.fxml.FXML
    private TableColumn<MemberMessaging,String> messagePreviewCol;
    @javafx.fxml.FXML
    private TableColumn<MemberMessaging,String> timestampCol;

    @javafx.fxml.FXML
    public void initialize() {
        senderCol.setCellValueFactory(new PropertyValueFactory<>("sender"));
        timestampCol.setCellValueFactory(new PropertyValueFactory<>("Time Stamp"));
        messagePreviewCol.setCellValueFactory(new PropertyValueFactory<>("Message Preview"));
    }


    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club Member","ClubMemberDashboard.fxml","Club Member Dashboard");
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