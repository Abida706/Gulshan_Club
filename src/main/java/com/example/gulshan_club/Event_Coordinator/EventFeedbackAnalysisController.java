package com.example.gulshan_club.Event_Coordinator;

import com.example.gulshan_club.CommonClass.Switcher;
import com.example.gulshan_club.Event_Coordinator_Modelclass.EventFeedbackAnalysis;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class EventFeedbackAnalysisController
{
    @javafx.fxml.FXML
    private TableView<EventFeedbackAnalysis> feedbackListTextView;
    @javafx.fxml.FXML
    private PieChart feedbackPieChart;
    @javafx.fxml.FXML
    private TableColumn<EventFeedbackAnalysis, String> responseIDCol;
    @javafx.fxml.FXML
    private TableColumn<EventFeedbackAnalysis, String> feedbackTextCol;

    @javafx.fxml.FXML
    public void initialize() {
        responseIDCol.setCellValueFactory(new PropertyValueFactory<>("responseID"));
        feedbackTextCol.setCellValueFactory(new PropertyValueFactory<>("feedbackText"));

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Event_coordinator","Event_Coordinator_Dashboard.fxml","Event Coordinator Dashboard");
    }

    @javafx.fxml.FXML
    public void handleSendFeedbackFormButton(ActionEvent actionEvent) {
    }


}