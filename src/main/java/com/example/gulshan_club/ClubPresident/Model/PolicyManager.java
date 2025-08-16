package com.example.gulshan_club.ClubPresident.Model;

public class PolicyManager {
    private String policyName;
    private String description;
    private String uploadedBy;
    private String effectiveDate;
    private String status;

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(String uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PolicyManager(String policyName, String description, String uploadedBy, String effectiveDate, String status) {
        this.policyName = policyName;
        this.description = description;
        this.uploadedBy = uploadedBy;
        this.effectiveDate = effectiveDate;
        this.status = status;

    }
}
