package com.example.gulshan_club.Marketing_Manager.Controller;

import com.example.gulshan_club.Marketing_Manager.Model.EngagmentAnalytics;
import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class EngagementAnalyticsController
{
    @javafx.fxml.FXML
    private TableView<EngagmentAnalytics> analyticsTable;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private BarChart<EngagmentAnalytics, Number> engagementBarChart;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private TableColumn<EngagmentAnalytics,String> metricCol;
    @javafx.fxml.FXML
    private TableColumn<EngagmentAnalytics,String> valueCol;
    @javafx.fxml.FXML
    private TableColumn<EngagmentAnalytics,String> dateRangeCol;
    @javafx.fxml.FXML
    private TableColumn<EngagmentAnalytics,String> remarksCol;

    @javafx.fxml.FXML
    public void initialize() {
        metricCol.setCellValueFactory(new PropertyValueFactory<>("metric"));
        valueCol.setCellValueFactory(new PropertyValueFactory<>("value"));
        dateRangeCol.setCellValueFactory(new PropertyValueFactory<>("dateRange"));
        remarksCol.setCellValueFactory(new PropertyValueFactory<>("remarks"));

        toDatePicker.setValue(LocalDate.now());
        fromDatePicker.setValue(LocalDate.now().minusDays(30));
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Marketing_Manager","Marketing_Manager_Dashboard.fxml","Marketing Manager Dashboard");

    }

    @Deprecated
    public void handleGenerateReportButton(ActionEvent actionEvent) {
        if(fromDatePicker.getValue() == null || toDatePicker.getValue() == null){
            System.out.println("Please select both from and to dates");
            return;

        }
    }

    @javafx.fxml.FXML
    public void handleExportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handlegenerateReportButton(ActionEvent actionEvent) {
    }
}