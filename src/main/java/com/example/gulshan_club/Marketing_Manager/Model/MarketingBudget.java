package com.example.gulshan_club.Marketing_Manager.Model;

public class MarketingBudget {
    private String category, depatment, utilization;
    private double ammount;

    public MarketingBudget(String category, String depatment, String utilization, double ammount) {
        this.category = category;
        this.depatment = depatment;
        this.utilization = utilization;
        this.ammount = ammount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDepatment() {
        return depatment;
    }

    public void setDepatment(String depatment) {
        this.depatment = depatment;
    }

    public String getUtilization() {
        return utilization;
    }

    public void setUtilization(String utilization) {
        this.utilization = utilization;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    @Override
    public String toString() {
        return "MarketingBudget{" +
                "category='" + category + '\'' +
                ", depatment='" + depatment + '\'' +
                ", utilization='" + utilization + '\'' +
                ", ammount=" + ammount +
                '}';
    }
}

