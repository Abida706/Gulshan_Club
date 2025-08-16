package com.example.gulshan_club.AccountsManager.Model;

import java.time.LocalDate;

public class VendorPayments {
    private int invoiceId;
    private String vendorName;
    private LocalDate dueDate;
    private double amount;
    private String status;

    public VendorPayments(int invoiceId, String vendorName, LocalDate dueDate, double amount, String status) {
        this.invoiceId = invoiceId;
        this.vendorName = vendorName;
        this.dueDate = dueDate;
        this.amount = amount;
        this.status = status;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "VendorPayments{" +
                "invoiceId=" + invoiceId +
                ", vendorName='" + vendorName + '\'' +
                ", dueDate=" + dueDate +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}
