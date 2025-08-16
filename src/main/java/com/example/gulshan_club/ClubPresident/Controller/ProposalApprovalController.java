package com.example.gulshan_club.ClubPresident.Controller;

import com.example.gulshan_club.ClubPresident.Model.PolicyManager;
import com.example.gulshan_club.ClubPresident.Model.ProposalApproval;
import com.example.gulshan_club.CommonClass.LoginPageController;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class ProposalApprovalController
{
    @javafx.fxml.FXML
    private TableColumn<ProposalApproval,String> eventDateCol;
    @javafx.fxml.FXML
    private TableView<ProposalApproval> eventPersonalTableView;
    @javafx.fxml.FXML
    private TableColumn<ProposalApproval,String> statusCol;
    @javafx.fxml.FXML
    private TextArea commentsTextArea;
    @javafx.fxml.FXML
    private TableColumn<PolicyManager,String> proposalTitalCol;
    @javafx.fxml.FXML
    private TableColumn<PolicyManager,String> submitedByCol;

    @javafx.fxml.FXML
    public void initialize() {
        eventDateCol.setCellValueFactory(new PropertyValueFactory<>("Event Date"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("Status"));
        proposalTitalCol.setCellValueFactory(new PropertyValueFactory<>("Proposal Title"));
        submitedByCol.setCellValueFactory(new PropertyValueFactory<>("Submited By"));
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club President","ClubPresidentDashboard.fxml","Club President Dashboard");
    }

    @javafx.fxml.FXML
    public void handleRejectButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLogoutButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleApproveButton(ActionEvent actionEvent) {
    }
}