package com.example.gulshan_club.ClubPresident.Model;

public class ProposalApproval {
    private String status;
    private String date;
    private String submitedBy;
    private String tital;
    private String comments;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSubmitedBy() {
        return submitedBy;
    }

    public void setSubmitedBy(String submitedBy) {
        this.submitedBy = submitedBy;
    }

    public String getTital() {
        return tital;
    }

    public void setTital(String tital) {
        this.tital = tital;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public ProposalApproval(String status, String date, String submitedBy, String tital, String comments) {
        this.status = status;
        this.date = date;
        this.submitedBy = submitedBy;
        this.tital = tital;
        this.comments = comments;

    }
}
