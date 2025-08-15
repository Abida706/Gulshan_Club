package com.example.gulshan_club.Security_Supervisor.Controller;


import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SecuritySupervisorDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleSecurityScheduleButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Security_Supervisor","SecuritySchedule.fxml","Security Schedule");
    }

    @javafx.fxml.FXML
    public void handleAccessControlButton(ActionEvent actionEvent){
        Switcher.switcher((Node) actionEvent.getSource(), "Security_Supervisor","AccessControl.fxml","Access Control");


    }

    @javafx.fxml.FXML
    public void handleSecurityReportsButton(ActionEvent actionEvent){
        Switcher.switcher((Node) actionEvent.getSource(), "Security_Supervisor","SecurityReports.fxml","Security Reports");

    }

    @javafx.fxml.FXML
    public void handleEquipmentMaintenanceButton(ActionEvent actionEvent){
        Switcher.switcher((Node) actionEvent.getSource(), "Security_Supervisor","EquipmentMaintenance.fxml","Equipment Maintenance");

    }

    @javafx.fxml.FXML
    public void handleCCTVDashboardButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Security_Supervisor","CCTVDashboard.fxml","CCTV Dashboard");

    }

    @javafx.fxml.FXML
    public void handleTrainingManagementButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Security_Supervisor","TrainingManagement.fxml","Training Management");

    }

    @Deprecated
    public void handleVisitorRegistrationButon(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Security_Supervisor","VisitorRegistration.fxml","Visitor Registration");

    }

    @javafx.fxml.FXML
    public void handleEmergencyProtocolsButton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Security_Supervisor","EmergencyProtocols.fxml","Emergency Protocols");

    }

    @javafx.fxml.FXML
    public void handleVisitorRegistrationBuuton(ActionEvent actionEvent) {
        Switcher.switcher((Node) actionEvent.getSource(), "Security_Supervisor","VisitorRegistration.fxml","Visitor Registration");

    }
}