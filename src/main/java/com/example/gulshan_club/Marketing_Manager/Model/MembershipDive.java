package com.example.gulshan_club.Marketing_Manager.Model;

import java.time.LocalDate;

public class MembershipDive {
    private String packageName, packageDetails;
    private LocalDate deadline;

    public MembershipDive(String packageName, String packageDetails, LocalDate deadline) {
        this.packageName = packageName;
        this.packageDetails = packageDetails;
        this.deadline = deadline;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageDetails() {
        return packageDetails;
    }

    public void setPackageDetails(String packageDetails) {
        this.packageDetails = packageDetails;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "membershipDive{" +
                "packageName='" + packageName + '\'' +
                ", packageDetails='" + packageDetails + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
