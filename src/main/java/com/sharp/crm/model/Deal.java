package com.sharp.crm.model;

import java.util.Date;
import java.util.List;

public class Deal {
    
    private String dealId;
    
    private String leadId;
    
    private String dealStatus;
    
    private List<String> sampleDataAttachmentFiles;
    

    private String finalDataFile;
    
    private Long dealValue;
    
    private Date lastUpdatedTimeStamp;
    
    public Date getLastUpdatedTimeStamp() {
        return lastUpdatedTimeStamp;
    }

    public void setLastUpdatedTimeStamp(Date lastUpdatedTimeStamp) {
        this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
    }

    private Date createdTimeStamp;

    
    

    public String getDealId() {
        return dealId;
    }

    public void setDealId(String dealId) {
        this.dealId = dealId;
    }

    public String getLeadId() {
        return leadId;
    }

    public void setLeadId(String leadId) {
        this.leadId = leadId;
    }

    public String getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }

    public List<String> getSampleDataAttachmentFiles() {
        return sampleDataAttachmentFiles;
    }

    public void setSampleDataAttachmentFiles(List<String> sampleDataAttachmentFiles) {
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

    public Date getCreatedTimeStamp() {
        return createdTimeStamp;
    }

    public void setCreatedTimeStamp(Date createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
    }
}
