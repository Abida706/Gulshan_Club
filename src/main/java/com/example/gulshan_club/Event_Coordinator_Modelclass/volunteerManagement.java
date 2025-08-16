package com.example.gulshan_club.Event_Coordinator_Modelclass;

public class volunteerManagement {
    private String volunteerName;
    private String assignedRole;

    public volunteerManagement(String assignedRole, String volunteerName) {
        this.assignedRole = assignedRole;
        this.volunteerName = volunteerName;
    }

    public String getAssignedRole() {
        return assignedRole;
    }

    public void setAssignedRole(String assignedRole) {
        this.assignedRole = assignedRole;
    }

    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }
}
