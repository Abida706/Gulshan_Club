package com.example.gulshan_club.Event_Coordinator_Modelclass;

public class RegistrationPanel {
    private String participantName;
    private String registrationStatus;

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    public RegistrationPanel(String participantName, String registrationStatus) {
        this.participantName = participantName;
        this.registrationStatus = registrationStatus;
    }
}
