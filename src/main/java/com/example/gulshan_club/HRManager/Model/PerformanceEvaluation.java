package com.example.gulshan_club.HRManager.Model;

public class PerformanceEvaluation {
    private String employeeName;
    private int teamworkScore;
    private int productivityScore;
    private int punctualityScore;
    private String additionalComments;

    public PerformanceEvaluation(String employeeName, int teamworkScore, int productivityScore, int punctualityScore, String additionalComments) {
        this.employeeName = employeeName;
        this.teamworkScore = teamworkScore;
        this.productivityScore = productivityScore;
        this.punctualityScore = punctualityScore;
        this.additionalComments = additionalComments;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getTeamworkScore() {
        return teamworkScore;
    }

    public void setTeamworkScore(int teamworkScore) {
        this.teamworkScore = teamworkScore;
    }

    public int getProductivityScore() {
        return productivityScore;
    }

    public void setProductivityScore(int productivityScore) {
        this.productivityScore = productivityScore;
    }

    public int getPunctualityScore() {
        return punctualityScore;
    }

    public void setPunctualityScore(int punctualityScore) {
        this.punctualityScore = punctualityScore;
    }

    public String getAdditionalComments() {
        return additionalComments;
    }

    public void setAdditionalComments(String additionalComments) {
        this.additionalComments = additionalComments;
    }

    @Override
    public String toString() {
        return "PerformanceEvaluation{" +
                "employeeName='" + employeeName + '\'' +
                ", teamworkScore=" + teamworkScore +
                ", productivityScore=" + productivityScore +
                ", punctualityScore=" + punctualityScore +
                ", additionalComments='" + additionalComments + '\'' +
                '}';
    }
}
