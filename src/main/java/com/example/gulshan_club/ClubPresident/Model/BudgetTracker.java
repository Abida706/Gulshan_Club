package com.example.gulshan_club.ClubPresident.Model;

public class BudgetTracker {
    private String category;
    private double amount;
    private String date;
    private String tital;
    private String approvedBy;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTital() {
        return tital;
    }

    public void setTital(String tital) {
        this.tital = tital;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public BudgetTracker(String category, double amount, String date, String tital, String approvedBy) {
        this.category = category;
        this.amount = amount;
        this.date = date;
        this.tital = tital;
        this.approvedBy = approvedBy;

    }
}
