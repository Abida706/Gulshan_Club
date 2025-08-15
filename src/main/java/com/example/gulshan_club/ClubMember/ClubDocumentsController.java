package com.example.gulshan_club.ClubMember;

import javafx.event.ActionEvent;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ClubDocumentsController
{
    @javafx.fxml.FXML
    private TableView documentTableView;
    @javafx.fxml.FXML
    private TableColumn StatusCol;
    @javafx.fxml.FXML
    private TableColumn votedOptionCol;
    @javafx.fxml.FXML
    private TableColumn pollTitleCol;
    @javafx.fxml.FXML
    private Hyperlink myHyperLink;
    @javafx.fxml.FXML
    private TableColumn resultSummaryCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleDownloadButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLogoutButton(ActionEvent actionEvent) {
    }
}