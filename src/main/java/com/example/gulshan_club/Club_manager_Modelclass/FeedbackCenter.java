package com.example.gulshan_club.Club_manager_Modelclass;

public class FeedbackCenter {
    private int feedbackId;
    private String MemberName;
    private String feedBackText;

    public FeedbackCenter(int feedbackId, String feedBackText, String memberName) {
        this.feedbackId = feedbackId;
        this.feedBackText = feedBackText;
        MemberName = memberName;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getFeedBackText() {
        return feedBackText;
    }

    public void setFeedBackText(String feedBackText) {
        this.feedBackText = feedBackText;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }
}

