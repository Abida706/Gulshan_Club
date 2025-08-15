package com.example.gulshan_club.Marketing_Manager.Controller;

import com.example.gulshan_club.Marketing_Manager.Model.SocialMedia;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;
import java.io.IOException;

public class SocialMediaController
{
    @javafx.fxml.FXML
    private TableColumn<SocialMedia, String> postIdCol;
    @javafx.fxml.FXML
    private TextArea postContentTextArea;
    @javafx.fxml.FXML
    private TableColumn<SocialMedia, String> platformCol;
    @javafx.fxml.FXML
    private TableColumn<SocialMedia, String> engagementCol;
    @javafx.fxml.FXML
    private TableColumn<SocialMedia, String> dateCol;
    @javafx.fxml.FXML
    private DatePicker scheduleDatePicker;
    @javafx.fxml.FXML
    private TableColumn<SocialMedia, String> reachCol;
    @javafx.fxml.FXML
    private TableView<String> postStatsTableView;

    @javafx.fxml.FXML
    public void initialize() {
        postIdCol.setCellValueFactory(new PropertyValueFactory<>("postId"));
        platformCol.setCellValueFactory(new PropertyValueFactory<>("platform"));
        engagementCol.setCellValueFactory(new PropertyValueFactory<>("engagement"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        reachCol.setCellValueFactory(new PropertyValueFactory<>("reach"));
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Marketing_Manager", "Marketing_Manager_Dashboard.fxml", "Marketing Manager Dashboard");

    }

    @javafx.fxml.FXML
    public void handleTrackButton(ActionEvent actionEvent) {
        showAlert("Post tracking feature is under development.");
    }

    @javafx.fxml.FXML
    public void handlePostNowButton(ActionEvent actionEvent) {
        String postContent = postContentTextArea.getText();
        if (postContent == null || postContent.isEmpty()) {
            showAlert("Post content cannot be empty!");
            return;
        }
    }
    private void showAlert(String error) {
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setContentText(error);
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void handleScheduleButton(ActionEvent actionEvent) {

        if (postContentTextArea.getText() == null || postContentTextArea.getText().isEmpty()) {
            showAlert("Post content cannot be empty!");
            return;
        }

        if (scheduleDatePicker.getValue() == null) {
            showAlert("Please select a schedule date!");
            return;
        }
    }
}