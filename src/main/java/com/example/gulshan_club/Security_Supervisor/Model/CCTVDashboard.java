package com.example.gulshan_club.Security_Supervisor.Model;

public class CCTVDashboard {
    private  String selectCamera, incidentDescription, feedPlaceholder;

    public CCTVDashboard(String selectCamera, String incidentDescription, String feedPlaceholder) {
        this.selectCamera = selectCamera;
        this.incidentDescription = incidentDescription;
        this.feedPlaceholder = feedPlaceholder;
    }

    public String getSelectCamera() {
        return selectCamera;
    }

    public void setSelectCamera(String selectCamera) {
        this.selectCamera = selectCamera;
    }

    public String getIncidentDescription() {
        return incidentDescription;
    }

    public void setIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
    }

    public String getFeedPlaceholder() {
        return feedPlaceholder;
    }

    public void setFeedPlaceholder(String feedPlaceholder) {
        this.feedPlaceholder = feedPlaceholder;
    }

    @Override
    public String toString() {
        return "CCTVDashboard{" +
                "selectCamera='" + selectCamera + '\'' +
                ", incidentDescription='" + incidentDescription + '\'' +
                ", feedPlaceholder='" + feedPlaceholder + '\'' +
                '}';
    }
}
