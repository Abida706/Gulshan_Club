package com.example.gulshan_club.ClubPresident.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class MeetingScheduler {
    private String title;
    private LocalTime time;
    private LocalDate date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public MeetingScheduler(String title, LocalTime time, LocalDate date) {
        this.title = title;
        this.time = time;
        this.date = date;

    }
}
