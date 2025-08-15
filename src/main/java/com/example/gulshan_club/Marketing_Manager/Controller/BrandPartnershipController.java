package com.example.gulshan_club.Marketing_Manager.Controller;

import com.example.gulshan_club.Marketing_Manager.Model.BrandPatnership;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class BrandPartnershipController {

    @javafx.fxml.FXML
    private TableColumn<BrandPatnership, String> typeCol;
    @javafx.fxml.FXML
    private ComboBox<String> partnerTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn<BrandPatnership, String> roiCol;
    @javafx.fxml.FXML
    private TextField partnerRIOTextField;
    @javafx.fxml.FXML
    private TextArea activityTextArea;
    @javafx.fxml.FXML
    private TextField partnerNameTextField;
    @javafx.fxml.FXML
    private TableColumn<BrandPatnership, String> startDateCol;
    @javafx.fxml.FXML
    private TableColumn<BrandPatnership, String> statusCol;
    @javafx.fxml.FXML
    private TableView<BrandPatnership> partnershipTableView;
    private String name;
    @javafx.fxml.FXML
    private TableColumn<BrandPatnership,String> pathnerNameCol;

    @javafx.fxml.FXML
    public void initialize() {
        pathnerNameCol.setCellValueFactory(new PropertyValueFactory<>("partnerName"));
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        startDateCol.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        roiCol.setCellValueFactory(new PropertyValueFactory<>("roi"));

        partnerTypeComboBox.getItems().addAll("Sponsorship", "Collaboration", "Co-branding", "Joint Venture");

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent)  {
        Switcher.switcher((Node) actionEvent.getSource(), "Marketing_Manager","Marketing_Manager_Dashboard.fxml","Marketing Manager Dashboard");

    }

    @javafx.fxml.FXML
    public void handleTrackROIButton(ActionEvent actionEvent) {


    }

    @javafx.fxml.FXML
    public void handleAddButton(ActionEvent actionEvent) {
        
        String type = partnerTypeComboBox.getValue();
        

        if (partnerNameTextField.getText().trim().isEmpty() || partnerRIOTextField.getText().trim().isEmpty() || type == null || activityTextArea.getText().trim().isEmpty()) {
            showAlert("All fields must be filled.");
            return;
        }

        BrandPatnership partnership = new BrandPatnership(name, type, LocalDate.now().toString(), "Active");

        partnershipTableView.getItems().add(partnership);

    }


    private void showAlert( String message) {
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setContentText(message);
        a.showAndWait();
    }
}
