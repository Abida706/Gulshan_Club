package com.example.gulshan_club.Event_Coordinator_Modelclass;

public class LogisticsManagement {
    private String itemName;
    private int quantity;
    private String status;

    public LogisticsManagement(String itemName, int quantity, String status) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.status = status;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

