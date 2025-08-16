package com.example.gulshan_club.HRManager.Model;

public class RemoveEmployee {
    private String name;
    private String position;
    private String department;
    private String contact;

    public RemoveEmployee(String name, String position, String department, String contact) {
        this.name = name;
        this.position = position;
        this.department = department;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "RemoveEmployee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
