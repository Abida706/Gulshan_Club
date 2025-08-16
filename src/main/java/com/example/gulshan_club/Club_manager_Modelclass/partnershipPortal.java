package com.example.gulshan_club.Club_manager_Modelclass;

public class partnershipPortal {
    private String partnerName;
    private String dealValue;
    private String contactInfo;

    public partnershipPortal(String contactInfo, String dealValue, String partnerName) {
        this.contactInfo = contactInfo;
        this.dealValue = dealValue;
        this.partnerName = partnerName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getDealValue() {
        return dealValue;
    }

    public void setDealValue(String dealValue) {
        this.dealValue = dealValue;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }
}
