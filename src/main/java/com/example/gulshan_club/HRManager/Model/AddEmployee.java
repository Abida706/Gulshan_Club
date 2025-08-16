package com.example.gulshan_club.HRManager.Model;

public class AddEmployee {
    private String name;
    private String position;
    private String department;
    private double salary;
    private String contact;

    public AddEmployee(String name, String position, String department, double salary, String contact) {
        this.name = name;
        this.position = position;
        this.department = department;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "AddEmployee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", contact='" + contact + '\'' +
                '}';
    }
}
