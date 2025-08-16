package com.example.gulshan_club.HRManager.Model;

public class AttendanceReport {
    private String name;
    private String department;
    private int daysPresent;
    private int daysAbsent;
    private int daysLate;
    private int totalWorking;

    public AttendanceReport(String name, String department, int daysAbsent, int daysPresent, int daysLate, int totalWorking) {
        this.name = name;
        this.department = department;
        this.daysAbsent = daysAbsent;
        this.daysPresent = daysPresent;
        this.daysLate = daysLate;
        this.totalWorking = totalWorking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getDaysPresent() {
        return daysPresent;
    }

    public void setDaysPresent(int daysPresent) {
        this.daysPresent = daysPresent;
    }

    public int getDaysLate() {
        return daysLate;
    }

    public void setDaysLate(int daysLate) {
        this.daysLate = daysLate;
    }

    public int getDaysAbsent() {
        return daysAbsent;
    }

    public void setDaysAbsent(int daysAbsent) {
        this.daysAbsent = daysAbsent;
    }

    public int getTotalWorking() {
        return totalWorking;
    }

    public void setTotalWorking(int totalWorking) {
        this.totalWorking = totalWorking;
    }

    @Override
    public String toString() {
        return "AttendanceReport{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", daysPresent=" + daysPresent +
                ", daysAbsent=" + daysAbsent +
                ", daysLate=" + daysLate +
                ", totalWorking=" + totalWorking +
                '}';
    }
}
