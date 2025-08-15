package com.example.gulshan_club.Marketing_Manager.Model;

import java.time.LocalDate;

public class EngagmentAnalytics {

    private LocalDate from, to;

    public EngagmentAnalytics(LocalDate from, LocalDate to) {
        this.from = from;
        this.to = to;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "EngagmentAnalytics{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
