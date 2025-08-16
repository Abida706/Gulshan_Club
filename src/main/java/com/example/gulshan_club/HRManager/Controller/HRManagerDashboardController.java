package com.example.gulshan_club.HRManager.Controller;

import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;

public class HRManagerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleRemoveEmployeeButton(ActionEvent actionEvent) {
        Switcher.switcher((Node)actionEvent.getSource(),"HRManager" ,"RemoveEmployee.fxml", "Remove Employee");

    }

    @javafx.fxml.FXML
    public void handleTrainingProgramsButton(ActionEvent actionEvent) {
        Switcher.switcher((Node)actionEvent.getSource(),"HRManager" ,"TrainingPrograms.fxml", "Training Programs");

    }

    @javafx.fxml.FXML
    public void handleLeaveManagementButton(ActionEvent actionEvent) {
        Switcher.switcher((Node)actionEvent.getSource(),"HRManager" ,"LeaveManagement.fxml", "Leave Management");

    }

    @javafx.fxml.FXML
    public void handleAddEmployeeButton(ActionEvent actionEvent) {
        Switcher.switcher((Node)actionEvent.getSource(),"HRManager" ,"addEmployee.fxml", "Add Employee");

    }

    @javafx.fxml.FXML
    public void handleUpdateEmployeeButton(ActionEvent actionEvent) {
        Switcher.switcher((Node)actionEvent.getSource(),"HRManager" ,"UpdateEmployee.fxml", "Update Employee");

    }

    @javafx.fxml.FXML
    public void handleRecruitmentProcessButton(ActionEvent actionEvent) {
        Switcher.switcher((Node)actionEvent.getSource(),"HRManager" ,"RecruitmentProcess.fxml", "Recruitment Process");

    }

    @javafx.fxml.FXML
    public void handlePerformanceEvaluationButton(ActionEvent actionEvent) {
        Switcher.switcher((Node)actionEvent.getSource(),"HRManager" ,"PerformanceEvaluation.fxml", "Performance Evaluation");

    }

    @javafx.fxml.FXML
    public void handleAttendanceReportButton(ActionEvent actionEvent) {
        Switcher.switcher((Node)actionEvent.getSource(),"HRManager" ,"AttendanceReport.fxml", "Attendance Report");

    }

}