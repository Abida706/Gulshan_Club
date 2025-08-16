package com.example.gulshan_club.Event_Coordinator_Modelclass;

public class EventFeedbackAnalysis {
    private int responseID;
    private String feedbackText;

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public int getResponseID() {
        return responseID;
    }

    public void setResponseID(int responseID) {
        this.responseID = responseID;
    }

    public EventFeedbackAnalysis(String feedbackText, int responseID) {
        this.feedbackText = feedbackText;
        this.responseID = responseID;

    }
}
