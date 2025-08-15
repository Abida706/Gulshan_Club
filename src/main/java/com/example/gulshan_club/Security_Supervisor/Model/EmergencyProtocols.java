package com.example.gulshan_club.Security_Supervisor.Model;

public class EmergencyProtocols {
    private String contactNumber, evacuationInstructions;

    public EmergencyProtocols(String contactNumber, String evacuationInstructions) {
        this.contactNumber = contactNumber;
        this.evacuationInstructions = evacuationInstructions;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEvacuationInstructions() {
        return evacuationInstructions;
    }

    public void setEvacuationInstructions(String evacuationInstructions) {
        this.evacuationInstructions = evacuationInstructions;
    }

    @Override
    public String toString() {
        return "EmergencyProtocols{" +
                "contactNumber='" + contactNumber + '\'' +
                ", evacuationInstructions='" + evacuationInstructions + '\'' +
                '}';
    }
}
