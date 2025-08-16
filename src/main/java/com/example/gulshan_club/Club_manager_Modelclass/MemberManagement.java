package com.example.gulshan_club.Club_manager_Modelclass;

public class MemberManagement {
    private int memberID;
    private String memberName;
    private String status;

    public MemberManagement() {
    }


    public MemberManagement(int memberID, String memberName, String status) {
        this.memberID = memberID;
        this.memberName = memberName;
        this.status = status;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


