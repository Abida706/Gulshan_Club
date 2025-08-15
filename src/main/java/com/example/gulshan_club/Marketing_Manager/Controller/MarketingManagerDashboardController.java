package com.example.gulshan_club.Marketing_Manager.Controller;

import com.example.gulshan_club.CommonClass.Switcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MarketingManagerDashboardController {
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleEventPromotionButton(ActionEvent actionEvent) {
        Switcher.switcher((Node)actionEvent.getSource(),"Marketing_Manager" ,"EventPromotion.fxml", "Event Promotion");

    }

    @javafx.fxml.FXML
    public void handleEngagementAnalyticsButton(ActionEvent actionEvent) {
        Switcher.switcher((Node)actionEvent.getSource(),"Marketing_Manager" ,"EngagementAnalytics.fxml", "Engagement Analytics");
    }

    @javafx.fxml.FXML
    public void handleMembershipDriveButton(ActionEvent actionEvent)  {
        Switcher.switcher((Node)actionEvent.getSource(),"Marketing_Manager" ,"MembershipDrive.fxml", "Membership Drive");

    }

    @javafx.fxml.FXML
    public void handleMarketingBudgetButton(ActionEvent actionEvent){
        Switcher.switcher((Node)actionEvent.getSource(),"Marketing_Manager" ,"MarketingBudget.fxml", "Marketing Budget");
    }

    @javafx.fxml.FXML
    public void handleSocialMediaButton(ActionEvent actionEvent) {
        Switcher.switcher((Node)actionEvent.getSource(),"Marketing_Manager" ,"SocialMedia.fxml", "Social Media Management");
    }

    @javafx.fxml.FXML
    public void handleCreateCampaignButton(ActionEvent actionEvent){
        Switcher.switcher((Node)actionEvent.getSource(),"Marketing_Manager" ,"CreateCampaign.fxml", "Create Campaign");
    }

    @javafx.fxml.FXML
    public void handleFeedbackManagementButton(ActionEvent actionEvent) {
        Switcher.switcher((Node)actionEvent.getSource(),"Marketing_Manager" ,"FeedbackManagement.fxml", "Feedback Management");
    }

    @javafx.fxml.FXML
    public void handleBrandPartnershipButton(ActionEvent actionEvent) {
        Switcher.switcher((Node)actionEvent.getSource(),"Marketing_Manager" ,"BrandPartnership.fxml", "Brand Partnership");

    }
}