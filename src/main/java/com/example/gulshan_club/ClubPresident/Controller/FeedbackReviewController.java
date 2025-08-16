package com.example.gulshan_club.ClubPresident.Controller;

import com.example.gulshan_club.ClubPresident.Model.FeedbackReview;
import com.example.gulshan_club.CommonClass.LoginPageController;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class FeedbackReviewController
{
    @javafx.fxml.FXML
    private TableColumn<FeedbackReview,String > dateCol;
    @javafx.fxml.FXML
    private TableColumn<FeedbackReview,String > memberNameCol;
    @javafx.fxml.FXML
    private TableColumn<FeedbackReview,String > feedbackTypeCol;
    @javafx.fxml.FXML
    private TableColumn<FeedbackReview,String> summaryCol;
    @javafx.fxml.FXML
    private TableView<FeedbackReview> feedbackListTableView;
    @javafx.fxml.FXML
    private TextArea selectedFeedbackTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        dateCol.setCellValueFactory(new PropertyValueFactory<>("Date"));
        memberNameCol.setCellValueFactory(new PropertyValueFactory<>("Member Name"));
        feedbackTypeCol.setCellValueFactory(new PropertyValueFactory<>("Feedback Type"));
        summaryCol.setCellValueFactory(new PropertyValueFactory<>("Summary"));
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        LoginPageController.Switcher.switcher((Node) actionEvent.getSource(), "Club President","ClubPresidentDashboard.fxml","Club President Dashboard");
    }

    @javafx.fxml.FXML
    public void handleReplyButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLogoutButton(ActionEvent actionEvent) {
    }
}