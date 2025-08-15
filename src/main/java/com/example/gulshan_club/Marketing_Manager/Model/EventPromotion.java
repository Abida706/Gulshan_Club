package com.example.gulshan_club.Marketing_Manager.Model;

import java.time.LocalDate;

public class EventPromotion {
    private String eventSelect, promotion,eventName ;
    private LocalDate schedule;

    public EventPromotion(String eventSelect, String promotion, String eventName, LocalDate schedule) {
        this.eventSelect = eventSelect;
        this.promotion = promotion;
        this.eventName = eventName;
        this.schedule = schedule;
    }

    public String getEventSelect() {
        return eventSelect;
    }

    public void setEventSelect(String eventSelect) {
        this.eventSelect = eventSelect;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getSchedule() {
        return schedule;
    }

    public void setSchedule(LocalDate schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "EventPromotion{" +
                "eventSelect='" + eventSelect + '\'' +
                ", promotion='" + promotion + '\'' +
                ", eventName='" + eventName + '\'' +
                ", schedule=" + schedule +
                '}';
    }
}
