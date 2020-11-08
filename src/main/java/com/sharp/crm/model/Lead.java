package com.sharp.crm.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="leads")
public class Lead {
    
    
    private String id;
    
    private String firstName;
    
    private String lastName;
    
    private String companyName;
    
    private String country;
    
    private String state;
    
    private String businessEmail;
    
    private String sicCode;
    
    private String naicsCode;
    
    private String targetIndustry;
    
    private String employeeSize;
    
    private String revenueSize;
    
    private StringBuffer customDataRequirement;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBussinessEmail() {
        return businessEmail;
    }

    public void setBussinessEmail(String bussinessEmail) {
        this.businessEmail = bussinessEmail;
    }

    public String getSicCode() {
        return sicCode;
    }

    public void setSicCode(String sicCode) {
        this.sicCode = sicCode;
    }

    public String getNaicsCode() {
        return naicsCode;
    }

    public void setNaicsCode(String naicsCode) {
        this.naicsCode = naicsCode;
    }

    public String getTargetIndustry() {
        return targetIndustry;
    }

    public void setTargetIndustry(String targetIndustry) {
        this.targetIndustry = targetIndustry;
    }

    public String getEmployeeSize() {
        return employeeSize;
    }

    public void setEmployeeSize(String employeeSize) {
        this.employeeSize = employeeSize;
    }

    public String getRevenueSize() {
        return revenueSize;
    }

    public void setRevenueSize(String revenueSize) {
        this.revenueSize = revenueSize;
    }

    public StringBuffer getCustomDataRequirement() {
        return customDataRequirement;
    }

    public void setCustomDataRequirement(StringBuffer customDataRequirement) {
        this.customDataRequirement = customDataRequirement;
    }

   
}

