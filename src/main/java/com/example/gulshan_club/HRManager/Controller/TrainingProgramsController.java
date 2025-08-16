package com.example.gulshan_club.HRManager.Controller;

import com.example.gulshan_club.CommonClass.Switcher;
import com.example.gulshan_club.HRManager.Model.TrainingPrograms;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class TrainingProgramsController
{
    @javafx.fxml.FXML
    private TableColumn<TrainingPrograms, String> nameTableCol;
    @javafx.fxml.FXML
    private TableColumn<TrainingPrograms, String> trainingStatusTableCol;
    @javafx.fxml.FXML
    private TextField trainerTextField;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private TableView<TrainingPrograms> trainingProgramTable;
    @javafx.fxml.FXML
    private TableColumn<TrainingPrograms, String> employeeidTableCol;
    @javafx.fxml.FXML
    private TableColumn<TrainingPrograms, String> deptTableCol;
    @javafx.fxml.FXML
    private TextField programTextField;

    @javafx.fxml.FXML
    public void initialize() {
        nameTableCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        trainingStatusTableCol.setCellValueFactory(new PropertyValueFactory<>("training Status"));
        employeeidTableCol.setCellValueFactory(new PropertyValueFactory<>("employee id"));
        deptTableCol.setCellValueFactory(new PropertyValueFactory<>("dept"));
    }

    @Deprecated
    public void handleCertificateButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void haandleAssignButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "HRManager", "HRManagerDashboard.fxml", "HR Manager Dashboard");

    }

}