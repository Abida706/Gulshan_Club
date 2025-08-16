package com.example.gulshan_club.ClubMember.Model;

public class EventRegistration {
    private String name;
    private String email;
    private String eventSelected;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEventSelected() {
        return eventSelected;
    }

    public void setEventSelected(String eventSelected) {
        this.eventSelected = eventSelected;
    }

    public EventRegistration(String name, String email, String eventSelected) {
        this.name = name;
        this.email = email;
        this.eventSelected = eventSelected;


    }
}
