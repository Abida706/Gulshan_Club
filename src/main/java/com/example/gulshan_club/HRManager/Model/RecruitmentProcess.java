package com.example.gulshan_club.HRManager.Model;

public class RecruitmentProcess {
    private int applicantId;
    private String name;
    private String position;
    private String qualification;
    private String experience;
    private String status;

    public RecruitmentProcess(int applicantId, String name, String position, String status, String qualification, String experience) {
        this.applicantId = applicantId;
        this.name = name;
        this.position = position;
        this.status = status;
        this.qualification = qualification;
        this.experience = experience;
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "RecruitmentProcess{" +
                "applicantId=" + applicantId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", qualification='" + qualification + '\'' +
                ", experience='" + experience + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
