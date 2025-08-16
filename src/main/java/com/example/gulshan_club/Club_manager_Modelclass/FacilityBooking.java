package com.example.gulshan_club.Club_manager_Modelclass;

import java.time.LocalDate;

public class FacilityBooking {
    private String facilityName;
    private LocalDate bookingDate;
    private String status;

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public FacilityBooking(LocalDate bookingDate, String facilityName, String status) {
        this.bookingDate = bookingDate;
        this.facilityName = facilityName;
        this.status = status;

    }
}
