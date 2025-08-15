package com.example.gulshan_club.Marketing_Manager.Model;

import java.time.LocalDate;

public class CreateCampaing {
    private String campaignName, Audience, Description;
    private LocalDate Start, End;
    private Integer Budget;

    public CreateCampaing(String campaignName, String audience, String description, LocalDate start, LocalDate end, Integer budget) {
        this.campaignName = campaignName;
        Audience = audience;
        Description = description;
        Start = start;
        End = end;
        Budget = budget;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getAudience() {
        return Audience;
    }

    public void setAudience(String audience) {
        Audience = audience;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public LocalDate getStart() {
        return Start;
    }

    public void setStart(LocalDate start) {
        Start = start;
    }

    public LocalDate getEnd() {
        return End;
    }

    public void setEnd(LocalDate end) {
        End = end;
    }

    public Integer getBudget() {
        return Budget;
    }

    public void setBudget(Integer budget) {
        Budget = budget;
    }

    @Override
    public String toString() {
        return "CreateCampaing{" +
                "campaignName='" + campaignName + '\'' +
                ", Audience='" + Audience + '\'' +
                ", Description='" + Description + '\'' +
                ", Start=" + Start +
                ", End=" + End +
                ", Budget=" + Budget +
                '}';
    }
}