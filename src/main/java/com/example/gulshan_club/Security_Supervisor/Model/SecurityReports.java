package com.example.gulshan_club.Security_Supervisor.Model;

import java.time.LocalDate;

public class SecurityReports {
    private LocalDate from, to;

    public SecurityReports(LocalDate from, LocalDate to) {
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
        return "SecurityReports{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
