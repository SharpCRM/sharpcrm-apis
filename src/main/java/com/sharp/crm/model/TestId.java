package com.sharp.crm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="testid")
public class TestId {
    @Column(name = "name")
    private String name;
    @Id
    @Column(name = "id")
    private String id;
    
    @Column(name = "address")
    private String address;
    
    public TestId() {
        
    }
    public TestId(String id, String name,String address) {
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
