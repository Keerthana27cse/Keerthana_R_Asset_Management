package com.assetmanagement.model;

public class AssetCategory {
    private int categoryId;
    private String categoryName;
    private String description;

    public AssetCategory() {
    }

    public AssetCategory(int categoryId, String categoryName, String description) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.description = description;
    }


    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category ID: " + categoryId +
               "\nCategory Name: " + categoryName +
               "\nDescription: " + description + "\n";
    }
}

