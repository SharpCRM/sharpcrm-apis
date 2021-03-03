package com.sharp.crm.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
public class Lead {

	@Id
	@GeneratedValue
	private int id;

	private String leadStatus;

	private String firstName;

	private String lastName;

	private String companyName;

	private String country;

	private String state;

	private String city;

	private String businessEmail;

	private String companyEmail;

	private String companySocialId;

	private String companyURL;

	private String alternateEmail;

	private String leadSource;

	private String phoneNumber;

	private String companyPhoneNumber;

	private String mobileNumber;

	private String sicCode;

	private String naicsCode;

	private String targetIndustry;

	private String employeeSize;

	private String revenueSize;

	private String customDataRequirement;

	@JsonFormat(pattern= "yyyy-MM-dd'T'HH:mm:ss", shape = Shape.STRING)
	@Column(name="date_created")
	private String createdTimeStamp;

	@JsonFormat(pattern= "yyyy-MM-dd'T'HH:mm:ss", shape = Shape.STRING)
	@Column(name="date_updated")
	private String lastUpdatedTimeStamp;

	@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
	@JoinColumn(name="referenceId")
	private List<Comments> commentsList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBusinessEmail() {
		return businessEmail;
	}

	public void setBusinessEmail(String businessEmail) {
		this.businessEmail = businessEmail;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getCompanySocialId() {
		return companySocialId;
	}

	public void setCompanySocialId(String companySocialId) {
		this.companySocialId = companySocialId;
	}

	public String getCompanyURL() {
		return companyURL;
	}

	public void setCompanyURL(String companyURL) {
		this.companyURL = companyURL;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public String getLeadSource() {
		return leadSource;
	}

	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCompanyPhoneNumber() {
		return companyPhoneNumber;
	}

	public void setCompanyPhoneNumber(String companyPhoneNumber) {
		this.companyPhoneNumber = companyPhoneNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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

	public String getCustomDataRequirement() {
		return customDataRequirement;
	}

	public void setCustomDataRequirement(String customDataRequirement) {
		this.customDataRequirement = customDataRequirement;
	}

	public String getLeadStatus() {
		return leadStatus;
	}

	public void setLeadStatus(String leadStatus) {
		this.leadStatus = leadStatus;
	}

	public String getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	public void setCreatedTimeStamp(String createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}

	public String getLastUpdatedTimeStamp() {
		return lastUpdatedTimeStamp;
	}

	public void setLastUpdatedTimeStamp(String lastUpdatedTimeStamp) {
		this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
	}
	public List<Comments> getCommentsList() {
		return commentsList;
	}

	public void setCommentsList(List<Comments> commentsList) {
		this.commentsList = commentsList;
	}

}
