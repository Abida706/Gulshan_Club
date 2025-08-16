package com.example.gulshan_club.ClubMember.Controller;

import com.example.gulshan_club.ClubMember.Model.ClubNews;
import com.example.gulshan_club.CommonClass.LoginPageController;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ClubNewsController
{
    @javafx.fxml.FXML
    private TableColumn<ClubNews,String > dateCol;
    @javafx.fxml.FXML
    private TableColumn<ClubNews,String> summaryCol;
    @javafx.fxml.FXML
    private TableColumn<ClubNews,String>linkCol;
    @javafx.fxml.FXML
    private Hyperlink myHyperLInk;
    @javafx.fxml.FXML
    private TableView<ClubNews> newsItemTableView;
    @javafx.fxml.FXML
    private TableColumn<ClubNews,String> headlineCol;

    @javafx.fxml.FXML
    public void initialize() {
        headlineCol.setCellValueFactory(new PropertyValueFactory<>("headline"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        summaryCol.setCellValueFactory(new PropertyValueFactory<>("summary"));
        linkCol.setCellValueFactory(new PropertyValueFactory<>("link"));
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club Member","ClubMemberDashboard.fxml","Club Member Dashboard");
    }

    @javafx.fxml.FXML
    public void handleRefreshButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLogoutButton(ActionEvent actionEvent) {
    }
}