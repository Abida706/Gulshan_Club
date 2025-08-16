package com.example.gulshan_club.Event_Coordinator;

import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.chart.BarChart;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PromotionManagementController
{
    @javafx.fxml.FXML
    private BarChart<String,Number> promotionPerformanceChartBarChart;
    @javafx.fxml.FXML
    private TextArea promotionContentTextArea;
    @javafx.fxml.FXML
    private DatePicker scheduleDateDatePicker;
    @javafx.fxml.FXML
    private TextField promotionTextField;

    @javafx.fxml.FXML
    public void initialize() {
        BarChart<String, Number> chartPromotionPerformance;
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Event_coordinator","Event_Coordinator_Dashboard.fxml","Event Coordinator Dashboard");
    }

    @javafx.fxml.FXML
    public void handlelaunchPromotionButton(ActionEvent actionEvent) {
    }


}