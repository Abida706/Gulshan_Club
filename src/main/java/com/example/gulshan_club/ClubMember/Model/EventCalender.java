package com.example.gulshan_club.ClubMember.Model;

public class EventCalender {
    private String eventName;
    private String date;
    private String time;
    private String venue;
    private String organizer;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public EventCalender(String eventName, String date, String time, String venue, String organizer) {
        this.eventName = eventName;
        this.date = date;
        this.time = time;
        this.venue = venue;
        this.organizer = organizer;

    }
}
