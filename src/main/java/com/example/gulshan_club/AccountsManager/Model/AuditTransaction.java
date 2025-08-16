package com.example.gulshan_club.AccountsManager.Model;


import java.time.LocalDate;

public class AuditTransaction {
    private String transactionId;
    private LocalDate date;
    private String type;
    private double amount;
    private String status;
    private boolean flagged;

    public AuditTransaction(String transactionId, LocalDate date, double amount, String type, boolean flagged, String status) {
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
        this.type = type;
        this.flagged = flagged;
        this.status = status;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isFlagged() {
        return flagged;
    }

    public void setFlagged(boolean flagged) {
        this.flagged = flagged;
    }

    @Override
    public String toString() {
        return "AuditTransaction{" +
                "transactionId='" + transactionId + '\'' +
                ", date=" + date +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", flagged=" + flagged +
                '}';
    }
}






