package com.example.gulshan_club.HRManager.Model;

public class TrainingPrograms {
    private int employeeId;
    private String name;
    private String department;
    private String trainingStatus;

    public TrainingPrograms(int employeeId, String name, String department, String trainingStatus) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.trainingStatus = trainingStatus;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public String getTrainingStatus() {
        return trainingStatus;
    }

    public void setTrainingStatus(String trainingStatus) {
        this.trainingStatus = trainingStatus;
    }

    @Override
    public String toString() {
        return "TrainingPrograms{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", trainingStatus='" + trainingStatus + '\'' +
                '}';
    }
}
