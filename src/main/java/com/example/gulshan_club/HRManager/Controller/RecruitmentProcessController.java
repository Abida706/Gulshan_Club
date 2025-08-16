package com.example.gulshan_club.HRManager.Controller;

import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RecruitmentProcessController
{
    @javafx.fxml.FXML
    private TableColumn nameTableCol;
    @javafx.fxml.FXML
    private TableColumn positionTableCol;
    @javafx.fxml.FXML
    private TableColumn qualificationTableCol;
    @javafx.fxml.FXML
    private TextField jobTitleTextField;
    @javafx.fxml.FXML
    private TableColumn experienceTableCol;
    @javafx.fxml.FXML
    private TableView recruitmentTable;
    @javafx.fxml.FXML
    private TextArea requirementsTextArea;
    @javafx.fxml.FXML
    private TableColumn applicantidTableCol;
    @javafx.fxml.FXML
    private TableColumn statusTableCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleShortlistButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOfferButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleScheduleButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "HRManager", "HRManagerDashboard.fxml", "HR Manager Dashboard");

    }

}