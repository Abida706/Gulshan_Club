package com.example.gulshan_club.Security_Supervisor.Model;

import java.time.LocalDate;
import java.util.Date;

public class TrainingManagement {
    private String moduleName, personnel;
    private LocalDate date;

    public TrainingManagement(String moduleName, String personnel, LocalDate date) {
        this.moduleName = moduleName;
        this.personnel = personnel;
        this.date = date;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getPersonnel() {
        return personnel;
    }

    public void setPersonnel(String personnel) {
        this.personnel = personnel;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TrainingManagement{" +
                "moduleName='" + moduleName + '\'' +
                ", personnel='" + personnel + '\'' +
                ", date=" + date +
                '}';
    }
}
