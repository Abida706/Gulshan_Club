package com.example.gulshan_club.Club_manager_Modelclass;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class Communicationpanel {
    private String subject;
    private LocalDate dateSent;

    public Communicationpanel(String subject, LocalDate dateSent) {
        this.subject = subject;
        this.dateSent = dateSent;
    }

    public LocalDate getDateSent() {
        return dateSent;
    }

    public void setDateSent(LocalDate dateSent) {
        this.dateSent = dateSent;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
