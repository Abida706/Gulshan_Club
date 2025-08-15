package com.example.gulshan_club.Marketing_Manager.Controller;

import com.example.gulshan_club.Marketing_Manager.Model.EventPromotion;

import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class EventPromotionController {
    @javafx.fxml.FXML
    private TableColumn<EventPromotion, String> eventCol;
    @javafx.fxml.FXML
    private TableColumn<EventPromotion, String> conversionRateCol;
    @javafx.fxml.FXML
    private DatePicker scheduleDatePicker;
    @javafx.fxml.FXML
    private TableColumn<EventPromotion, String> clicksCol;
    @javafx.fxml.FXML
    private ComboBox<EventPromotion> eventSelectorcomboBox;
    @javafx.fxml.FXML
    private TableColumn<EventPromotion, String> reachCol;
    @javafx.fxml.FXML
    private TableView<EventPromotion> promotionStatsTableView;
    @javafx.fxml.FXML
    private TextArea promotionTextArea;
    @javafx.fxml.FXML
    private Text errorText;

    @javafx.fxml.FXML
    public void initialize() {
        eventCol.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        reachCol.setCellValueFactory(new PropertyValueFactory<>("reach"));
        clicksCol.setCellValueFactory(new PropertyValueFactory<>("clicks"));
        conversionRateCol.setCellValueFactory(new PropertyValueFactory<>("conversionRate"));

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent){
        Switcher.switcher((Node) actionEvent.getSource(), "Marketing_Manager","Marketing_Manager_Dashboard.fxml","Marketing Manager Dashboard");

    }

    @javafx.fxml.FXML
    public void handleLaunchButton(ActionEvent actionEvent) {
        String scheduleDate;

        if (scheduleDatePicker.getValue() != null) {
            scheduleDate = scheduleDatePicker.getValue().toString();
        } else {
            scheduleDate = "";
        }

        if (eventSelectorcomboBox.getValue() == null) {
            showError("Please select an event!");
            return;
        }
        if (promotionTextArea.getText() == null || promotionTextArea.getText().isEmpty()) {
            showError("Please enter promotion text!");
            return;
        }
        if (scheduleDate.isEmpty()) {
            showError("Please select a schedule date!");
            return;
        }

    }
    private void showError(String message) {
        errorText.setText(message);
    }

}