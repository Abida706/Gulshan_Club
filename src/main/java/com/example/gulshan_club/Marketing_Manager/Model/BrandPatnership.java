package com.example.gulshan_club.Marketing_Manager.Model;

public class BrandPatnership {
    private String partnerName, partnerType, activity;
    private String roi;

    public BrandPatnership(String partnerName, String partnerType, String activity, String roi) {
        this.partnerName = partnerName;
        this.partnerType = partnerType;
        this.activity = activity;
        this.roi = roi;
    }

    public String getRoi() {
        return roi;
    }

    public void setRoi(String roi) {
        this.roi = roi;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    @Override
    public String toString() {
        return "BrandPatnership{" +
                "partnerName='" + partnerName + '\'' +
                ", partnerType='" + partnerType + '\'' +
                ", activity='" + activity + '\'' +
                ", roi='" + roi + '\'' +
                '}';
    }
}