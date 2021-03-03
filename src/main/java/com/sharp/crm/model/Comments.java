package com.sharp.crm.model;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Comments {
    

	@Id
	@GeneratedValue
    private int commentId;
  
    private int referenceId;
    
    private String comment;
    
    @JsonFormat(pattern= "yyyy-MM-dd'T'HH:mm:ss", shape = Shape.STRING)
	@Column(name="date_created")
    private String timeStamp;
    
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getReferenceId() {
        return this.referenceId;
    }

    public void setReferenceId(int id) {
        this.referenceId = id;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
