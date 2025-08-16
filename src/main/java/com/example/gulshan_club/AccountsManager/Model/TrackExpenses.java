package com.example.gulshan_club.AccountsManager.Model;

import java.time.LocalDate;

public class TrackExpenses {
    private int expenseId;
    private LocalDate date;
    private String category;
    private double amount;
    private String approvedBy;

    public TrackExpenses(int expenseId, LocalDate date, String category, double amount, String approvedBy) {
        this.expenseId = expenseId;
        this.date = date;
        this.category = category;
        this.amount = amount;
        this.approvedBy = approvedBy;
    }

    public TrackExpenses(String s, String category, double amount, String manager, String string) {
    }

    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

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

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    @Override
    public String toString() {
        return "TrackExpenses{" +
                "expenseId=" + expenseId +
                ", date=" + date +
                ", category='" + category + '\'' +
                ", amount=" + amount +
                ", approvedBy='" + approvedBy + '\'' +
                '}';
    }
}
