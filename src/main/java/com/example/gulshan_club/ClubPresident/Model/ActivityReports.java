package com.example.gulshan_club.ClubPresident.Model;

public class ActivityReports {
    private String title;
    private String date;
    private String type;
    private String createdBy;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ActivityReports(String title, String date, String type, String createdBy) {
        this.title = title;
        this.date = date;
        this.type = type;
        this.createdBy = createdBy;

    }
}
