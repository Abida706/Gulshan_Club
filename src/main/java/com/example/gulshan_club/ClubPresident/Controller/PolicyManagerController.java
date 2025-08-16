package com.example.gulshan_club.ClubPresident.Controller;

import com.example.gulshan_club.ClubPresident.Model.PolicyManager;
import com.example.gulshan_club.CommonClass.LoginPageController;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class PolicyManagerController
{
    @javafx.fxml.FXML
    private TableColumn<PolicyManager,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<PolicyManager,String> effectiveDateCol;
    @javafx.fxml.FXML
    private TableColumn<PolicyManager,String> policyNameCol;
    @javafx.fxml.FXML
    private TableView<PolicyManager> policyListTableView;
    @javafx.fxml.FXML
    private TextArea policyDescriptionTextArea;
    @javafx.fxml.FXML
    private TableColumn<PolicyManager,String> uploadedByCol;

    @javafx.fxml.FXML
    public void initialize() {
        statusCol.setCellValueFactory(new PropertyValueFactory<>("Status"));
        effectiveDateCol.setCellValueFactory(new PropertyValueFactory<>("Effective Date"));
        policyNameCol.setCellValueFactory(new PropertyValueFactory<>("Policy Name"));
        uploadedByCol.setCellValueFactory(new PropertyValueFactory<>("Uploaded By"));
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club President","ClubPresidentDashboard.fxml","Club President Dashboard");
    }

    @javafx.fxml.FXML
    public void handleDeleteButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleUploadButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLogoutButton(ActionEvent actionEvent) {
    }
}