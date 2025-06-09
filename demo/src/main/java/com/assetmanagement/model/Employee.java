package com.assetmanagement.model;

    public class Employee {
    private int employeeId;
    private String name;
    private String gender;
    private String email;
    private String password;
    private String contactNumber;
    private String address;
    private String role;
    private String empStatus;
    private String createdAt;

    public Employee() {}

    public Employee(int employeeId, String name, String gender, String email, String password,
                    String contactNumber, String address, String role, String empStatus, String createdAt) {
        this.employeeId = employeeId;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.contactNumber = contactNumber;
        this.address = address;
        this.role = role;
        this.empStatus = empStatus;
        this.createdAt = createdAt;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", name=" + name + ", gender=" + gender + ", email=" + email
                + ", password=" + password + ", contactNumber=" + contactNumber + ", address=" + address + ", role="
                + role + ", empStatus=" + empStatus + ", createdAt=" + createdAt + "]";
    }



}
