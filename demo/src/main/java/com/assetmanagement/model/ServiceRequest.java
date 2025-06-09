
package com.assetmanagement.model;
public class ServiceRequest {
    private int requestId;
    private int assetId;
    private int employeeId;
    private String requestDate;
    private String issueType;
    private String description;
    private String requestStatus;
    private String adminComment;
    private String updatedAt;

    public ServiceRequest() {}

    public ServiceRequest(int requestId, int assetId, int employeeId, String requestDate, String issueType,
                          String description, String requestStatus, String adminComment, String updatedAt) {
        this.requestId = requestId;
        this.assetId = assetId;
        this.employeeId = employeeId;
        this.requestDate = requestDate;
        this.issueType = issueType;
        this.description = description;
        this.requestStatus = requestStatus;
        this.adminComment = adminComment;
        this.updatedAt = updatedAt;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getAdminComment() {
        return adminComment;
    }

    public void setAdminComment(String adminComment) {
        this.adminComment = adminComment;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "ServiceRequest [requestId=" + requestId + ", assetId=" + assetId + ", employeeId=" + employeeId
                + ", requestDate=" + requestDate + ", issueType=" + issueType + ", description=" + description
                + ", requestStatus=" + requestStatus + ", adminComment=" + adminComment + ", updatedAt=" + updatedAt
                + "]";
    }

    
}
