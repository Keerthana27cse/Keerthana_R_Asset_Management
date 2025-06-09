package com.assetmanagement.model;

public class AssetAllocation {
    private int allocationId;
    private int assetId;
    private int employeeId;
    private String requestDate;
    private String allocationDate;
    private String returnDate;
    private String allocationStatus;
        
    public AssetAllocation() {}

    public AssetAllocation(int allocationId, int assetId, int employeeId, String requestDate,
                           String allocationDate, String returnDate, String allocationStatus) {
        this.allocationId = allocationId;
        this.assetId = assetId;
        this.employeeId = employeeId;
        this.requestDate = requestDate;
        this.allocationDate = allocationDate;
        this.returnDate = returnDate;
        this.allocationStatus = allocationStatus;
    }

    public int getAllocationId() {
        return allocationId;
    }

    public void setAllocationId(int allocationId) {
        this.allocationId = allocationId;
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

    public String getAllocationDate() {
        return allocationDate;
    }

    public void setAllocationDate(String allocationDate) {
        this.allocationDate = allocationDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getAllocationStatus() {
        return allocationStatus;
    }

    public void setAllocationStatus(String allocationStatus) {
        this.allocationStatus = allocationStatus;
    }

    @Override
    public String toString() {
        return "AssetAllocation [allocationId=" + allocationId + ", assetId=" + assetId + ", employeeId=" + employeeId
                + ", requestDate=" + requestDate + ", allocationDate=" + allocationDate + ", returnDate=" + returnDate
                + ", allocationStatus=" + allocationStatus + "]";
    }

    
}
