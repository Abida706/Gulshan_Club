package com.example.gulshan_club.Security_Supervisor.Model;

public class EquipmentMaintenance {
    private String selectEquipment, maintenanceNote;

    public EquipmentMaintenance(String selectEquipment, String maintenanceNote) {
        this.selectEquipment = selectEquipment;
        this.maintenanceNote = maintenanceNote;
    }

    public String getSelectEquipment() {
        return selectEquipment;
    }

    public void setSelectEquipment(String selectEquipment) {
        this.selectEquipment = selectEquipment;
    }

    public String getMaintenanceNote() {
        return maintenanceNote;
    }

    public void setMaintenanceNote(String maintenanceNote) {
        this.maintenanceNote = maintenanceNote;
    }

    @Override
    public String toString() {
        return "EquipmentMaintenance{" +
                "selectEquipment='" + selectEquipment + '\'' +
                ", maintenanceNote='" + maintenanceNote + '\'' +
                '}';
    }
}
