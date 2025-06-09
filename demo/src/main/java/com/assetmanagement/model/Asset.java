package com.assetmanagement.model;
public class Asset {
    private int assetId;
    private String assetNo;
    private String assetName;
    private int categoryId;
    private String assetModel;
    private String manufacturingDate;
    private String expiryDate;
    private String assetValue;
    private String assetImageUrl;
    private String assetStatus;
    private String createdAt;

    public Asset() {}

    public Asset(int assetId, String assetNo, String assetName, int categoryId, String assetModel,
                 String manufacturingDate, String expiryDate, String assetValue, String assetImageUrl,
                 String assetStatus, String createdAt) {
        this.assetId = assetId;
        this.assetNo = assetNo;
        this.assetName = assetName;
        this.categoryId = categoryId;
        this.assetModel = assetModel;
        this.manufacturingDate = manufacturingDate;
        this.expiryDate = expiryDate;
        this.assetValue = assetValue;
        this.assetImageUrl = assetImageUrl;
        this.assetStatus = assetStatus;
        this.createdAt = createdAt;
    }

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getAssetNo() {
        return assetNo;
    }

    public void setAssetNo(String assetNo) {
        this.assetNo = assetNo;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getAssetModel() {
        return assetModel;
    }

    public void setAssetModel(String assetModel) {
        this.assetModel = assetModel;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(String assetValue) {
        this.assetValue = assetValue;
    }

    public String getAssetImageUrl() {
        return assetImageUrl;
    }

    public void setAssetImageUrl(String assetImageUrl) {
        this.assetImageUrl = assetImageUrl;
    }

    public String getAssetStatus() {
        return assetStatus;
    }

    public void setAssetStatus(String assetStatus) {
        this.assetStatus = assetStatus;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Asset [assetId=" + assetId + ", assetNo=" + assetNo + ", assetName=" + assetName + ", categoryId="
                + categoryId + ", assetModel=" + assetModel + ", manufacturingDate=" + manufacturingDate
                + ", expiryDate=" + expiryDate + ", assetValue=" + assetValue + ", assetImageUrl=" + assetImageUrl
                + ", assetStatus=" + assetStatus + ", createdAt=" + createdAt + "]";
    }

   
}
