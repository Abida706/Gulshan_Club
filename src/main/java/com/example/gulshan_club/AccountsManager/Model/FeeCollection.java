package com.example.gulshan_club.AccountsManager.Model;

public class FeeCollection {
    private String memberId;
    private String name;
    private String month;
    private double amountDue;
    private String status;

    public FeeCollection(String memberId, String name, String month, double amountDue, String status) {
        this.memberId = memberId;
        this.name = name;
        this.month = month;
        this.amountDue = amountDue;
        this.status = status;
    }

    public FeeCollection(String text, String text1, String value) {
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "FeeCollection{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", month='" + month + '\'' +
                ", amountDue=" + amountDue +
                ", status='" + status + '\'' +
                '}';
    }
}
