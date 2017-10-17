package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IncidentModel {
    private int incidentId;
    private String type;
    private String reporterName;
    private String reporterContactNo;
    private String location;
    private Boolean isOpen;
    private java.sql.Date date;
    private int responsiblePersonnelId;

    public IncidentModel(String type, String reporterName, String reporterContactNo, String location){
        this.type = type;
        this.reporterName = reporterName;
        this.reporterContactNo = reporterContactNo;
        this.location = location;
        this.isOpen = true;
        this.date = new java.sql.Date(new Date().getTime());
    }

    public IncidentModel(int incidentId, String type, String reporterName, String reporterContactNo, String location, Boolean isOpen, java.sql.Date date, int responsiblePersonnelId){
        this.incidentId = incidentId;
        this.type = type;
        this.reporterName = reporterName;
        this.reporterContactNo = reporterContactNo;
        this.location = location;
        this.isOpen = isOpen;
        this.date = date;
        this.responsiblePersonnelId = responsiblePersonnelId;
    }

    public int getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(int incidentId) {
        this.incidentId = incidentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public String getReporterContactNo() {
        return reporterContactNo;
    }

    public void setReporterContactNo(String reporterContactNo) {
        this.reporterContactNo = reporterContactNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = this.date = new java.sql.Date(date.getTime());
    }

    public int getResponsiblePersonnelId() {
        return responsiblePersonnelId;
    }

    public void setResponsiblePersonnelId(int responsiblePersonnelId) {
        this.responsiblePersonnelId = responsiblePersonnelId;
    }
}
