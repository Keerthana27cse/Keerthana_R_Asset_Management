package com.assetmanagement.model;
public class AuditRequest {
    private int auditId;
    private int assetId;
    private int adminId;
    private int employeeId;
    private String auditDate;
    private String auditStatus;
    private String remarks;

    public AuditRequest() {}

    public AuditRequest(int auditId, int assetId, int adminId, int employeeId,
                        String auditDate, String auditStatus, String remarks) {
        this.auditId = auditId;
        this.assetId = assetId;
        this.adminId = adminId;
        this.employeeId = employeeId;
        this.auditDate = auditDate;
        this.auditStatus = auditStatus;
        this.remarks = remarks;
    }

    public int getAuditId() {
        return auditId;
    }

    public void setAuditId(int auditId) {
        this.auditId = auditId;
    }

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(String auditDate) {
        this.auditDate = auditDate;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "AuditRequest [auditId=" + auditId + ", assetId=" + assetId + ", adminId=" + adminId + ", employeeId="
                + employeeId + ", auditDate=" + auditDate + ", auditStatus=" + auditStatus + ", remarks=" + remarks
                + "]";
    }
    


}
