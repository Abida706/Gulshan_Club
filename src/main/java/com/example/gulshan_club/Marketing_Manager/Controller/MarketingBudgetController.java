package com.example.gulshan_club.Marketing_Manager.Controller;

import com.example.gulshan_club.Marketing_Manager.Model.MarketingBudget;

import com.example.gulshan_club.CommonClass.Switcher;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.ArrayList;

public class MarketingBudgetController {
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private ProgressBar utilizationProgressBar;
    @javafx.fxml.FXML
    private TableColumn<MarketingBudget, String> remainingCol;
    @javafx.fxml.FXML
    private TableColumn<MarketingBudget, String> categoryCol;
    @javafx.fxml.FXML
    private TableColumn<MarketingBudget, String> budgetedCol;
    @javafx.fxml.FXML
    private TableView<MarketingBudget> budgetTableView;
    @javafx.fxml.FXML
    private TableColumn<MarketingBudget, String> spentCol;
    @javafx.fxml.FXML
    private TableColumn<MarketingBudget, String> lastUpdateCol;
    @javafx.fxml.FXML
    private TextField categoryTextField;
    @javafx.fxml.FXML
    private ComboBox<String> departmentComboBox;
    @javafx.fxml.FXML
    private ObservableList<MarketingBudget> budgetData;

    ArrayList<MarketingBudget> marketingBudgetArrayList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        categoryCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        budgetedCol.setCellValueFactory(new PropertyValueFactory<>("budgetedAmount"));
        spentCol.setCellValueFactory(new PropertyValueFactory<>("spentAmount"));
        remainingCol.setCellValueFactory(new PropertyValueFactory<>("remainingAmount"));
        lastUpdateCol.setCellValueFactory(new PropertyValueFactory<>("lastUpdated"));

        departmentComboBox.getItems().addAll("Digital", "Print", "Events", "Social Media");

        budgetTableView.setItems(budgetData);
    }
    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent){
        Switcher.switcher((Node) actionEvent.getSource(), "Marketing_Manager","Marketing_Manager_Dashboard.fxml","Marketing Manager Dashboard");

    }

    @javafx.fxml.FXML
    public void handleAddAllocationButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGenerateReportButton(ActionEvent actionEvent) {
    }
}
