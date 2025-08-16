package com.example.gulshan_club.Club_Manager;

import com.example.gulshan_club.Club_manager_Modelclass.MemberManagement;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class memberManagementController
{
    @javafx.fxml.FXML
    private TextField userNameTextField;
    @javafx.fxml.FXML
    private TableView<MemberManagement> memberListTableTableView;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private TableColumn<MemberManagement, String> colMemberID;
    @javafx.fxml.FXML
    private TableColumn<MemberManagement, String> colMemberName;
    @javafx.fxml.FXML
    private AnchorPane memberNameTextField;
    @javafx.fxml.FXML
    private TableColumn<MemberManagement, String> colStatus;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Club_Manager","Club_Manager_Dashboard.fxml","Club Manager Dashboard");
    }

    @javafx.fxml.FXML
    public void handleRemoveMemberButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleEditMemberButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleAddMemberButton(ActionEvent actionEvent) {
    }
}