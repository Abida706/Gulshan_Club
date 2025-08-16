package com.example.gulshan_club.AccountsManager.Model;


public class BudgetManagement {
    private String category;
    private double budgetLimit;
    private double actualSpent;
    private double remaining;
    private boolean overspent;

    public BudgetManagement(String category, double budgetLimit, boolean overspent, double actualSpent, double remaining) {
        this.category = category;
        this.budgetLimit = budgetLimit;
        this.overspent = overspent;
        this.actualSpent = actualSpent;
        this.remaining = remaining;

    }

    public BudgetManagement(String text, String text1) {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getBudgetLimit() {
        return budgetLimit;
    }

    public void setBudgetLimit(double budgetLimit) {
        this.budgetLimit = budgetLimit;
    }

    public double getRemaining() {
        return remaining;
    }

    public void setRemaining(double remaining) {
        this.remaining = remaining;
    }

    public double getActualSpent() {
        return actualSpent;
    }

    public void setActualSpent(double actualSpent) {
        this.actualSpent = actualSpent;
    }

    public boolean isOverspent() {
        return overspent;
    }

    @Override
    public String toString() {
        return "BudgetManagement{" +
                "category='" + category + '\'' +
                ", budgetLimit=" + budgetLimit +
                ", actualSpent=" + actualSpent +
                ", remaining=" + remaining +
                ", overspent=" + overspent +
                '}';
    }

    public void setOverspent(boolean overspent) {
        this.overspent = overspent;

    }
}



