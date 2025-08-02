package com.example.gulshan_club.ClubMember;

import javafx.event.ActionEvent;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ClubNewsController
{
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn summaryCol;
    @javafx.fxml.FXML
    private TableColumn linkCol;
    @javafx.fxml.FXML
    private Hyperlink myHyperLInk;
    @javafx.fxml.FXML
    private TableView newsItemTableView;
    @javafx.fxml.FXML
    private TableColumn headlineCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleRefreshButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLogoutButton(ActionEvent actionEvent) {
    }
}