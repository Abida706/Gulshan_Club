package com.example.gulshan_club.ClubMember.Model;

public class EventFeedback {
    private String feedbackText;
    private String rating;

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public EventFeedback(String feedbackText, String rating) {
        this.feedbackText = feedbackText;
        this.rating = rating;


    }
}
