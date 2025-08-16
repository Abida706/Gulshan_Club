package com.example.gulshan_club.AccountsManager.Model;

public class ProcessSalary {
    private String employeeId;
    private String name;
    private Double baseSalary;
    private Double deductions;
    private Double bonuses;
    private Double netSalary;
    private String status;

    public ProcessSalary(String employeeId, String name, Double baseSalary, Double deductions, Double netSalary, Double bonuses, String status) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
        this.deductions = deductions;
        this.netSalary = netSalary;
        this.bonuses = bonuses;
        this.status = status;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Double getBonuses() {
        return bonuses;
    }

    public void setBonuses(Double bonuses) {
        this.bonuses = bonuses;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(Double netSalary) {
        this.netSalary = netSalary;
    }

    public Double getDeductions() {
        return deductions;
    }

    public void setDeductions(Double deductions) {
        this.deductions = deductions;
    }

    @Override
    public String toString() {
        return "ProcessSalary{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                ", deductions=" + deductions +
                ", bonuses=" + bonuses +
                ", netSalary=" + netSalary +
                ", status='" + status + '\'' +
                '}';
    }
}
