package com.example.gulshan_club.Marketing_Manager.Model;

public class FeedbackManagement {
    private String surveyTitle, targetGroup, question;

    public FeedbackManagement(String surveyTitle, String targetGroup, String question) {
        this.surveyTitle = surveyTitle;
        this.targetGroup = targetGroup;
        this.question = question;
    }

    public String getSurveyTitle() {
        return surveyTitle;
    }

    public void setSurveyTitle(String surveyTitle) {
        this.surveyTitle = surveyTitle;
    }

    public String getTargetGroup() {
        return targetGroup;
    }

    public void setTargetGroup(String targetGroup) {
        this.targetGroup = targetGroup;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "FeedbackManagement{" +
                "surveyTitle='" + surveyTitle + '\'' +
                ", targetGroup='" + targetGroup + '\'' +
                ", question='" + question + '\'' +
                '}';
    }
}
