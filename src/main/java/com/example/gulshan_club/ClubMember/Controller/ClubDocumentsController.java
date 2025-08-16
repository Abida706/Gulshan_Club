package com.example.gulshan_club.ClubMember.Controller;

import com.example.gulshan_club.ClubMember.Model.ClubDocuments;
import com.example.gulshan_club.CommonClass.LoginPageController;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ClubDocumentsController
{
    @javafx.fxml.FXML
    private TableView<ClubDocuments> documentTableView;
    @javafx.fxml.FXML
    private TableColumn<ClubDocuments,String> votedOptionCol;
    @javafx.fxml.FXML
    private TableColumn<ClubDocuments,String> pollTitleCol;
    @javafx.fxml.FXML
    private Hyperlink myHyperLink;
    @javafx.fxml.FXML
    private TableColumn<ClubDocuments,String > resultSummaryCol;
    @javafx.fxml.FXML
    private TableColumn<ClubDocuments,String > statusCol;

    @javafx.fxml.FXML
    public void initialize() {
        pollTitleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        votedOptionCol.setCellValueFactory(new PropertyValueFactory<>("votedOption"));
        resultSummaryCol.setCellValueFactory(new PropertyValueFactory<>("resultSummary"));

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club Member","ClubMemberDashboard.fxml","Club Member Dashboard");
    }

    @javafx.fxml.FXML
    public void handleDownloadButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLogoutButton(ActionEvent actionEvent) {
    }
}