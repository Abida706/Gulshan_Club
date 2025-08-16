package com.example.gulshan_club.ClubPresident.Model;

public class FeedbackReview {
    private String memberName;
    private String message;
    private String feedbackType;
    private String summary;
    private String date;

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFeedbackType() {
        return feedbackType;
    }

    public void setFeedbackType(String feedbackType) {
        this.feedbackType = feedbackType;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public FeedbackReview(String memberName, String message, String feedbackType, String summary, String date) {
        this.memberName = memberName;
        this.message = message;
        this.feedbackType = feedbackType;
        this.summary = summary;
        this.date = date;

    }
}
