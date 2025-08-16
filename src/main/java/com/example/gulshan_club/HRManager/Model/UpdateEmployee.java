package com.example.gulshan_club.HRManager.Model;

public class UpdateEmployee {
    private String name;
    private String position;
    private double salary;
    private String department;
    private String contact;

    public UpdateEmployee(String name, double salary, String position, String department, String contact) {
        this.name = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "UpdateEmployee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
