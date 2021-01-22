package com.sharp.crm.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Deal {

	@Id
	@GeneratedValue
	private int dealId;

	private int leadId;

	private String dealStatus;

	private String sampleDataAttachmentFiles;

	private String finalDataFile;

	private Long dealValue;

	private String lastUpdatedTimeStamp;

	public String getLastUpdatedTimeStamp() {
		return lastUpdatedTimeStamp;
	}

	public void setLastUpdatedTimeStamp(String lastUpdatedTimeStamp) {
		this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
	}

	private String createdTimeStamp;

	public int getDealId() {
		return dealId;
	}

	public void setDealId(int dealId) {
		this.dealId = dealId;
	}

	public int getLeadId() {
		return leadId;
	}

	public void setLeadId(int leadId) {
		this.leadId = leadId;
	}

	public String getDealStatus() {
		return dealStatus;
	}

	public void setDealStatus(String dealStatus) {
		this.dealStatus = dealStatus;
	}

	public String getSampleDataAttachmentFiles() {
		return sampleDataAttachmentFiles;
	}

	public void setSampleDataAttachmentFiles(String sampleDataAttachmentFiles) {
		this.sampleDataAttachmentFiles = sampleDataAttachmentFiles;
	}

	public String getFinalDataFile() {
		return finalDataFile;
	}

	public void setFinalDataFile(String finalDataFile) {
		this.finalDataFile = finalDataFile;
	}

	public Long getDealValue() {
		return dealValue;
	}

	public void setDealValue(Long dealValue) {
		this.dealValue = dealValue;
	}

	public String getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	public void setCreatedTimeStamp(String createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}
}
