package com.example.gulshan_club.ClubMember.Model;

public class ClubNews {
    private String headline;
    private String date;
    private String summary;
    private String link;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ClubNews(String headline, String date, String summary, String link) {
        this.headline = headline;
        this.date = date;
        this.summary = summary;
        this.link = link;

    }
}
