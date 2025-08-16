package com.example.gulshan_club.Club_manager_Modelclass;

public class BudgetDashboard {
    private String expenseName;
    private int amount;
    private String status;

    public BudgetDashboard(int amount, String expenseName, String status) {
        this.amount = amount;
        this.expenseName = expenseName;
        this.status = status;

    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
