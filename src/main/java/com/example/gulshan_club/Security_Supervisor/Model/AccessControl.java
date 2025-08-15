package com.example.gulshan_club.Security_Supervisor.Model;

public class AccessControl {
    private String memberId;

    public AccessControl(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "AccessControl{" +
                "memberId='" + memberId + '\'' +
                '}';
    }
}
