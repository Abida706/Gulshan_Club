package com.example.gulshan_club.Event_Coordinator_Modelclass;

public class CreateEvent {
    private String eventName;
    private String eventDate;

    public CreateEvent(String eventDate, String eventName) {
        this.eventDate = eventDate;
        this.eventName = eventName;


    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
