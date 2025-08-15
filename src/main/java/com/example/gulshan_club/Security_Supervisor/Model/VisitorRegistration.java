package com.example.gulshan_club.Security_Supervisor.Model;

public class VisitorRegistration {
    private String Name, Contact, Purpose, Host;

    public VisitorRegistration(String name, String contact, String purpose, String host) {
        Name = name;
        Contact = contact;
        Purpose = purpose;
        Host = host;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getPurpose() {
        return Purpose;
    }

    public void setPurpose(String purpose) {
        Purpose = purpose;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String host) {
        Host = host;
    }

    @Override
    public String toString() {
        return "VisitorRegistration{" +
                "Name='" + Name + '\'' +
                ", Contact='" + Contact + '\'' +
                ", Purpose='" + Purpose + '\'' +
                ", Host='" + Host + '\'' +
                '}';
    }
}
