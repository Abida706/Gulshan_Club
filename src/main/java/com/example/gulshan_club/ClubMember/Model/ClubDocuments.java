package com.example.gulshan_club.ClubMember.Model;

public class ClubDocuments {
    private String  title;
    private String  status;
    private String  votedOption;
    private String  result;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVotedOption() {
        return votedOption;
    }

    public void setVotedOption(String votedOption) {
        this.votedOption = votedOption;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ClubDocuments(String title, String status, String votedOption, String result) {
        this.title = title;
        this.status = status;
        this.votedOption = votedOption;
        this.result = result;

    }
}
