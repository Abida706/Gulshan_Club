package com.example.gulshan_club.Club_manager_Modelclass;

import java.time.LocalDate;

public class EventManagement {
    private int eventID;
    private String eventName;
    private LocalDate eventDate;

    public EventManagement(LocalDate eventDate, int eventID, String eventName) {
        this.eventDate = eventDate;
        this.eventID = eventID;
        this.eventName = eventName;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

}
