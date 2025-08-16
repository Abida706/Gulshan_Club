package com.example.gulshan_club.ClubPresident.Model;

import java.time.LocalDate;

public class ClubCalender {
    private String name;
    private LocalDate date;
    private String location;
    private String time;
    private String vanue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVanue() {
        return vanue;
    }

    public void setVanue(String vanue) {
        this.vanue = vanue;
    }

    public ClubCalender(String name, LocalDate date, String location, String time, String vanue) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.time = time;
        this.vanue = vanue;

    }
}
